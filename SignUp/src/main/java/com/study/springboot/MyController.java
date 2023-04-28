package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	@RequestMapping("/signupOk")
	public String signup(Model model, 
			@ModelAttribute
			MemberInfo memberInfo) {
		
		String id = memberInfo.getId();
		String pw = memberInfo.getPw();
		String name = memberInfo.getName();
		String number = memberInfo.getNumber();
		String email = memberInfo.getEmail();
		
		System.out.println("/signupOk 접근");		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		System.out.println("name : " + name);
		System.out.println("number : " + number);
		System.out.println("email : " + email);
		
		model.addAttribute("id", memberInfo);
		model.addAttribute("pw", memberInfo);
		model.addAttribute("name", memberInfo);
		model.addAttribute("number", memberInfo);
		model.addAttribute("email", memberInfo);
		
		
		
		return "/signupOk";
	}
	
}
