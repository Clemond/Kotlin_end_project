package com.clemond.api_test_open_library.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private const val Base_URL = "https://openlibrary.org/"

    val api: OpenLibraryApiInterface by lazy {   //Check variable type if it don't work
        Retrofit.Builder()
            .baseUrl(Base_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OpenLibraryApiInterface::class.java)
    }
}