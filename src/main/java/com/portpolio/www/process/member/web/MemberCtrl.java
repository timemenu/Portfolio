package com.portpolio.www.process.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.portpolio.www.process.member.domain.Member;
import com.portpolio.www.process.member.service.MemberService;

@Controller
@RequestMapping(value="member")
public class MemberCtrl {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="signin")
	public ModelAndView signin(@RequestBody Member member) {
		return null;
	}
	
	@RequestMapping(value="signup")
	public ModelAndView signup(@RequestBody Member member) {
		return null;
	}
	
}
