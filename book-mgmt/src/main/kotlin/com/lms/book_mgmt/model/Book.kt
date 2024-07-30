package com.lms.book_mgmt.model

data class Book(
  var id: Long?,
  var title: String,
  var author: String,
  var genre: String?,
  var isbn: String,
  var available: Boolean = true
)