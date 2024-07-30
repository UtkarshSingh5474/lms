package com.lms.borrowing_mgmt.controller
import com.lms.borrowing_mgmt.model.Borrowing
import com.lms.borrowing_mgmt.service.BorrowingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/borrowings")
class BorrowingController(val borrowingService: BorrowingService) {
  @PostMapping("/borrow")
  fun borrowBook(@RequestParam memberId: Long, @RequestParam bookId: Long): String {
    return borrowingService.borrowBook(memberId, bookId)
  }

  @PostMapping("/return")
  fun returnBook(@RequestParam memberId: Long, @RequestParam bookId: Long): Borrowing {
    return borrowingService.returnBook(memberId, bookId)
  }

  @GetMapping("/history/{memberId}")
  fun viewBorrowingHistoryAndDueDates(@PathVariable memberId: Long): List<Borrowing> {
    return borrowingService.viewBorrowingHistoryAndDueDates(memberId)
  }
}