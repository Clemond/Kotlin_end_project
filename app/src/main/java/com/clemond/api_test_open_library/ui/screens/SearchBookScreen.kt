package com.clemond.api_test_open_library.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.clemond.api_test_open_library.api.Book
import com.clemond.api_test_open_library.api.BookViewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.navigation.NavController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BookList(viewModel: BookViewModel, navController: NavController) {
    var query by remember { mutableStateOf("")}

    Column (
        modifier = Modifier
            .padding(16.dp)
    ){
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", modifier = Modifier.clickable { navController.navigate("HomeScreen") })
        Row (
            modifier = Modifier
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedTextField(value = query,
                onValueChange = { query = it },
                label = { Text(text = "Search book") },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.clickable { viewModel.searchBooks(query)}
                    )
                },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {viewModel.searchBooks(query)},
                modifier = Modifier.align(Alignment.CenterVertically)
            ){
                Text("Search")
            }
        }

        val books by viewModel.books.observeAsState(initial = emptyList())

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ){
            items(books.size) {index ->
                BookItem(book = books[index])
            }
        }
    }
}

@Composable
fun BookItem(book: Book) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        val imageUrl = "https://covers.openlibrary.org/b/id/${book.cover_i}-L.jpg"

        Image(
            painter = rememberAsyncImagePainter(model = imageUrl),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .padding(end = 8.dp),
            contentScale = ContentScale.Crop
        )
        Column {
            Text(text = book.title,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            book.author_name?.let {
                Text(
                    text = it.joinToString(", ")
                )
            }
        }
    }
}
