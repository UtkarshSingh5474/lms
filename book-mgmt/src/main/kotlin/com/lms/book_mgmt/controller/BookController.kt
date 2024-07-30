package com.lms.book_mgmt.controller

import com.lms.book_mgmt.model.Book
import com.lms.book_mgmt.service.BookService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/books")
class BookController(val bookService: BookService) {

  @PostMapping()
  fun addBook(@RequestBody book: Book): Book {
    return bookService.addBook(book)
  }

  @PutMapping("/{id}")
  fun updateBook(@PathVariable id: Long, @RequestBody book: Book): Book {
    return bookService.updateBook(id, book)
  }


  @DeleteMapping("/{id}")
  fun deleteBook(@PathVariable id: Long) {
    bookService.deleteBook(id)
  }

  @GetMapping("/{id}")
  fun viewBook(@PathVariable id: Long): Book {
    return bookService.viewBook(id)
  }

  @GetMapping("/availability/{id}")
  fun checkAvailability(@PathVariable id: Long): Boolean {
    return bookService.checkAvailability(id)
  }

  @PutMapping("/changeAvailability/{id}")
  fun changeAvailability(@PathVariable id: Long,status:Boolean):String{
    return bookService.changeAvailability(id,status)
  }
}

