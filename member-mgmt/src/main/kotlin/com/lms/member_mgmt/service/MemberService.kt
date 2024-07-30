package com.lms.member_mgmt.service

import com.lms.member_mgmt.dao.MemberDao
import com.lms.member_mgmt.model.Member
import org.springframework.stereotype.Service

@Service
class MemberService(val memberDao: MemberDao) {

  fun addMember(member: Member): Member {
     memberDao.insertMember(member);
    return member;
  }

  fun deleteMember(id: Long){
    memberDao.deleteMember(id)
  }
  fun viewMember(id:Long):Member{
    return memberDao.viewMember(id)
  }

}