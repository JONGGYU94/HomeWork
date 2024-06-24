package com.kh.homeWork.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.homeWork.member.model.service.MemberService;
import com.kh.homeWork.member.model.vo.Member;

@Controller
public class MemberController {
	
	
	@Autowired
	private MemberService mService;
	
	@RequestMapping("loginView.me")
	public String loginView(@ModelAttribute Member m) {
		
		
		return "login";
	}
	
	
	
	@RequestMapping("loginCheck.me")
	public String loginCheck(@ModelAttribute Member m) {
		
		
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberPwd());
		System.out.println("안녕하세요 깃허브 확인용입니다");
		System.out.println("확인좀 하자 제발~~~");
		System.out.println("이것도 축추가되냐??");
		
		//Member loginUser = mService.loginCheck(m);
		
		
		return "../home";
	}
}
