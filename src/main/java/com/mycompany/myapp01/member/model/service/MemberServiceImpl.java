package com.mycompany.myapp01.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.myapp01.member.model.dao.MemberDao;
import com.mycompany.myapp01.member.model.vo.Member;


@Service("MemberService")
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao MemberDao;
	
	@Override
	public int insertMember(Member mvo) throws Exception {
		return MemberDao.insertMember(mvo);
	}
}
