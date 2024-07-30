package com.lms.book_mgmt.service

import com.lms.book_mgmt.dao.BookDao
import com.lms.book_mgmt.model.Book
import org.springframework.stereotype.Service

@Service
class BookService(val bookDao: BookDao) {


  fun addBook(book: Book): Book {
    bookDao.insertBook(book)
    return book
  }

  fun updateBook(id:Long, book: Book):Book{
    return bookDao.updateBook(id, book)
  }

  fun deleteBook(id: Long) {
    bookDao.deleteBook(id)
  }

  fun viewBook(id: Long): Book {
    return bookDao.findBookById(id)
  }

  fun checkAvailability(id: Long): Boolean {
    return bookDao.checkAvailability(id)
  }
  fun changeAvailability(id: Long,status:Boolean): String{
    bookDao.changeAvailability(id,status)
    return "Changed"
  }
}