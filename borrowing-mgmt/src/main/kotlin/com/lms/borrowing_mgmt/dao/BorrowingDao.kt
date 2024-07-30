package com.lms.borrowing_mgmt.dao

import com.lms.borrowing_mgmt.model.Borrowing
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BorrowingDao {
  fun insertBorrowingRecord(record: Borrowing)
  fun updateBorrowingRecord(record: Borrowing)
  fun findBorrowingRecord(memberId: Long, bookId: Long): Borrowing
  fun findBorrowingHistoryAndDueDates(memberId: Long): List<Borrowing>
}
