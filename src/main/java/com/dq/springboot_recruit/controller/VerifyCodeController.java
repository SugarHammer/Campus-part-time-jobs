//package com.dq.springboot_recruit.controller;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.dq.springboot_recruit.util.RandomValidateCode;
//
//
//@Controller
//@RequestMapping("/verifycode")
//public class VerifyCodeController {
//	private String verify;
//	/**
//
//	 */
//	@RequestMapping(value="/checkCode")
//	public void checkCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//设置相应类型,告诉浏览器输出的内容为图片
//		response.setContentType("image/jpeg");
//
//		//设置响应头信息，告诉浏览器不要缓存此内容
//		response.setHeader("pragma", "no-cache");
//		response.setHeader("Cache-Control", "no-cache");
//		response.setDateHeader("Expire", 0);
//
//		RandomValidateCode randomValidateCode = new RandomValidateCode();
//
//		try {
//			 verify = randomValidateCode.getRandcode(request, response);//输出图片方法
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@RequestMapping(value="/getVerify", method=RequestMethod.POST)
//	@ResponseBody
//	private String getVerify() {
//		return verify;
//	}
//}
