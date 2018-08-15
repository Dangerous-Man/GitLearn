package com.git.gitLearn;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
	public static void test(){
		int i = 0;
		i++;//这是一些新加的代码
		System.out.println("输出点啥");
	}
	public static void test1(){
		System.out.println();//随便写了些东西
		System.out.println("eclipse 添加的代码");
 
	}

}
