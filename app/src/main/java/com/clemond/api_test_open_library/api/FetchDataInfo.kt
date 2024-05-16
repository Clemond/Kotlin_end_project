package com.clemond.api_test_open_library.api

data class SearchResult(
    val start: Int,
    val num_found: Int,
    val docs: List<Book>
)

data class Book(
    val cover_i: Int?,
    val title: String,
    val author_name: List<String>?,
    val key: String
)