package com.lms.borrowing_mgmt.model

import java.time.LocalDateTime

data class Borrowing(
  var id: Long?,
  var memberId: Long,
  var bookId: Long,
  var borrowedAt: LocalDateTime,
  var dueDate: LocalDateTime?,
  var returnedAt: LocalDateTime?
)