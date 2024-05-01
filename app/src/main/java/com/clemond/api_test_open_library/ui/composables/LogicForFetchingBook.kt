package com.clemond.api_test_open_library.ui.composables

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

@Composable
fun RandomBookScreen() {
    var book by remember { mutableStateOf("Click button to get random book") }
    var coverUrl by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { getRandomCookBook {newBook ->
            book = newBook?.title ?: "Failed to fetch book"
            coverUrl = newBook?.coverImageUrl
            Log.d("RandomBookScreen", "Cover URL: $coverUrl")
        } }) {
            Text(text = "Get Random Cookbook")
        }
        coverUrl?.let { url ->
            Image(
                painter = rememberImagePainter(url),
                contentDescription = book,
                modifier = Modifier.padding(16.dp)
            )
        }
        Text(text = book, modifier = Modifier.padding(16.dp))
    }
}

interface OpenLibraryService {
    // Example API endpoint for random books
    @GET("search.json")
    fun searchCookBooks(
        @Query("q") query: String,
        @Query("sort") sort: String
    ): Call<SearchResponse>
}
data class BookResponse(
    @SerializedName("title")
    val title: String,
    @SerializedName("author_name")
    val authorName: List<String>,
    @SerializedName("cover")
    val cover: Cover?,
    @SerializedName("OLID")
    val olid: String? // Add property for OLID
){
    val coverImageUrl: String?
        get() = cover?.let {
            val key = "olid" // Key for OLID
            val value = olid ?: "" //Use OLID if avalible, otherwise empty string
            "https://covers.openlibrary.org/b/$key/$value-L.jpg" // Construct cover image URL
        }
}

data class Cover(
    @SerializedName("large")
    val large: String?,
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("small")
    val small: String?
)

// ALCHEMIST - "isbn/978-0007155668\n.json"
//https://openlibrary.org/isbn/{ISBN_NUMBER}.json
data class SearchResponse(
    @SerializedName("docs")
    val docs: List<BookResponse>
)


private fun getRandomCookBook(callback: (BookResponse?) -> Unit) {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://openlibrary.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(OpenLibraryService::class.java)
    service.searchCookBooks("title:cookbook", "random").enqueue(object : Callback<SearchResponse> {
        override fun onResponse(call: retrofit2.Call<SearchResponse>, response: Response<SearchResponse>) {
            if (response.isSuccessful) {
                val books = response.body()?.docs
                val randomBook = books?.firstOrNull()
                callback(randomBook)
            } else {
                callback(null)
            }
        }

        override fun onFailure(call: retrofit2.Call<SearchResponse>, t: Throwable) {
            callback(null)
        }
    })
}