package com.easy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//ע�⣺ӳ�������;
@Controller
public class HelloController {
//ע�⣺ӳ�䷽��(���η���);
	@RequestMapping("/he")
	public String hello(){
		System.out.println("hello world");
		return "test"; //��ת��jsp
	}
}
