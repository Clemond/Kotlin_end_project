package com.clemond.api_test_open_library.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BookViewModel: ViewModel() {
    private val _books = MutableLiveData<List<Book>>()
    val books: LiveData<List<Book>>get() = _books

    fun searchBooks(query: String){
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.searchBooks(query)
                _books.value = response.docs
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}