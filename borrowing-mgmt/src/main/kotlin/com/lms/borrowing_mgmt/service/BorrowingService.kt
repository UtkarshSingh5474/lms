package com.lms.borrowing_mgmt.service

import com.lms.book_mgmt.service.BookService
import com.lms.borrowing_mgmt.dao.BorrowingDao
import com.lms.borrowing_mgmt.model.Borrowing
import org.springframework.stereotype.Service
import java.time.LocalDateTime


@Service
class BorrowingService(val borrowingDao: BorrowingDao, val bookService: BookService) {


  fun borrowBook(memberId: Long, bookId: Long): String {
    //Check if book is available or not
    if(bookService.checkAvailability(bookId)){
      val record = Borrowing(
        id = null,
        memberId = memberId,
        bookId = bookId,
        borrowedAt = LocalDateTime.now(),
        dueDate = LocalDateTime.now().plusWeeks(2),
        returnedAt = null
      )
      borrowingDao.insertBorrowingRecord(record)
      bookService.changeAvailability(bookId,false)
      return record.toString()
    }
    return "Book Not Available"
  }

  fun returnBook(memberId: Long, bookId: Long): Borrowing {

    val record = borrowingDao.findBorrowingRecord(
      memberId,
      bookId
    )
    record.returnedAt = LocalDateTime.now()
    borrowingDao.updateBorrowingRecord(record)
    bookService.changeAvailability(bookId,true)
    return record
  }

  fun viewBorrowingHistoryAndDueDates(memberId: Long): List<Borrowing> {
    return borrowingDao.findBorrowingHistoryAndDueDates(memberId)
  }
}
