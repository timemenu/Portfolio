package com.portfolio.www.process.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.portfolio.www.process.member.domain.Member;

@Controller
@RequestMapping(value="member")
public class MemberCtrl {

	@RequestMapping(value="signin")
	public ModelAndView signin(@RequestBody Member member) {
		return null;
	}
	
	@RequestMapping(value="signup")
	public ModelAndView signup(@RequestBody Member member) {
		return null;
	}
	
}
