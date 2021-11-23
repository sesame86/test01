package com.mycompany.myapp01.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp01.member.model.vo.Member;


@Repository("memberDao")
public class MemberDao {
	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(Member mvo) {
		return sqlSession.insert("Member.insertMember", mvo);
	}
}