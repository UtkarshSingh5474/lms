package com.lms.app.controller

import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ping")
class PingController {
  @Operation(summary = "Check liveliness!")
  @GetMapping()
  open fun getPing():String {
    return "Alive!"
  }
}

