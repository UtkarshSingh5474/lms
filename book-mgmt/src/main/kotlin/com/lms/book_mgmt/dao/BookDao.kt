package com.lms.book_mgmt.dao

import com.lms.book_mgmt.model.Book
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BookDao {
  fun insertBook(book: Book)
  fun updateBook(id: Long,book: Book):Book
  fun deleteBook(id: Long)
  fun findBookById(id: Long): Book
  fun checkAvailability(id: Long): Boolean
  fun changeAvailability(id:Long,status:Boolean)
}