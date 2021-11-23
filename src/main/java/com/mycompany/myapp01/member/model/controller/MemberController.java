package com.mycompany.myapp01.member.model.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.myapp01.member.model.service.MemberService;
import com.mycompany.myapp01.member.model.vo.Member;

@Controller
@RequestMapping("/")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping("/")
	public ModelAndView signUp(HttpServletRequest request, ModelAndView mv) {
		String msg = request.getParameter("msg");
		mv.setViewName("enroll");
		mv.addObject("msg", msg);
		return mv;
	}
	@PostMapping("/signup")
	public String insertMember(Member mvo, RedirectAttributes ra) {
		int result = 0;
		try {
			result = memberService.insertMember(mvo);
			if(result>0) {
				ra.addAttribute("msg", "ȸ������ ����");
			}else {
				ra.addAttribute("msg", "ȸ������ ����");
			}
		} catch (Exception e) {
			ra.addAttribute("msg", "ȸ������ �������� ���� �߻�");
			e.printStackTrace();
		}
		return "redirect:/";
	}
}