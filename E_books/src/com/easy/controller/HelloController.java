package com.easy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注解：映射控制器;
@Controller
public class HelloController {
//注解：映射方法(修饰方法);
	@RequestMapping("/he")
	public String hello(){
		System.out.println("hello world");
		return "test"; //跳转到jsp
	}
}
