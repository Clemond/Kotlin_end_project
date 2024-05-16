package com.clemond.api_test_open_library.api

import retrofit2.http.GET
import retrofit2.http.Query

interface OpenLibraryApiInterface {
    @GET("search.json")
    suspend fun searchBooks(@Query("q") query: String): SearchResult
}