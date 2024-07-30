package com.lms.member_mgmt.controller

import com.lms.member_mgmt.model.Member
import com.lms.member_mgmt.service.MemberService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(val memberService: MemberService) {

  @PostMapping()
  fun addMember(@RequestBody member: Member): Member {
    return memberService.addMember(member)
  }

  @DeleteMapping("/{id}")
  fun deleteMember(@PathVariable id: Long) {
    memberService.deleteMember(id)
  }

  @GetMapping("/{id}")
  fun viewMember(@PathVariable id: Long): Member {
    return memberService.viewMember(id)
  }


}