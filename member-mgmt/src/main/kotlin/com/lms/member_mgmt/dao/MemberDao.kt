package com.lms.member_mgmt.dao

import com.lms.member_mgmt.model.Member
import org.apache.ibatis.annotations.Mapper

@Mapper
interface MemberDao {

  fun insertMember(member: Member)
  fun deleteMember(id:Long)
  fun viewMember(id: Long):Member


}