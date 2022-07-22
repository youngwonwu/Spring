package com.company.mvc.emp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller	//반드시
public class TestController {
	
//	@RequestMapping("/parameter")
//	public void parameter() {
//		
//	}
//	@RequestMapping("/paramtest")
//	public String parameter() {
//		return "parameter";
//	}
	@RequestMapping("/paramtest")
	public String parameter(Model model) {
		model.addAttribute("param1", "test");
		return "parameter";
	}
	@RequestMapping("/paramtest2")
	public ModelAndView parameter2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("parameter");
		mv.addObject("", "");
		return mv;
	}
	
	//이거 잘 모르겟다요....
//	@RequestMapping("/req1")
//	   public void req1(HttpServletResponse response,
//	                  String id		//Integer로 하면 값이 숫자로 값을 줘야해야 한다
//	                  ) throws IOException {
//	      response.setContentType("text/html; charset=UTF-8");
//	      PrintWriter out = response.getWriter();
//	      out.print(id);
//	   }
	//트라이문은 오류나면 해당 페이지에서 처리하는거고 throws는 넘어가는 페이지에서 처리해줘야함
	//이렇게 해도 된다
	@RequestMapping("/req1")
	public void req1(HttpServletResponse response,
					@RequestParam(required = false, defaultValue = "woo") String id	//값 하나 받아올때
			){
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print(id);
		//@RequestParam 하고 throws IOException문 안쓸때
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 책 132
	@RequestMapping("/req2")	//String[]
	public void req2(HttpServletResponse response,
					@RequestParam List<String> ids
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/req3")	//Map
	public void req3(HttpServletResponse response,
					@RequestParam Map<String, Object> map
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/req4")	//VO
	public void req4(HttpServletResponse response,
					ReqVO vo
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/req5")	//ListVO
	public void req5(HttpServletResponse response,
						ListReqVO vo
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//첨부파일
//	@RequestMapping("/req6")
//	public void req6(HttpServletResponse response,
//					ReqVO vo, MultipartFile pic	//변수명이 input file타입의 네임명과 같아야한다
//			){
//		try {
//			PrintWriter out;
//			response.setContentType("text/html; charset=UTF-8");
//			out = response.getWriter();
//			
//			//첨부파일 업로드
//			if(pic != null && pic.getSize() > 0) {
//				File file = new File("c:/upload", pic.getOriginalFilename());
//				pic.transferTo(file);
//				out.print(pic.getOriginalFilename()+ "<br>");
//				out.print(pic.getSize());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	//첨부파일 
	//MultipartFile[] 배열 근데 List<MultipartFile> 해도 된다
	@RequestMapping("/req6")
	public void req6(HttpServletResponse response,
					ReqVO vo, MultipartFile[] pic	//변수명이 input file타입의 네임명과 같아야한다
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			
			//첨부파일 업로드
			for(MultipartFile temp : pic)
			if(pic != null && temp.getSize() > 0) {
				File file = new File("c:/upload", temp.getOriginalFilename());
				temp.transferTo(file);
				out.print(temp.getOriginalFilename() + "<br>");
				out.print(temp.getSize() + "<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
	@RequestMapping("/req7/{id}/{age}")	//.jsp href="req7/woo/28" 각각 들어가고 @PathVariable해서 타입 정해줘야함
	public void req7(HttpServletResponse response,
					@PathVariable String id,
					@PathVariable int age
			){
		try {
			PrintWriter out;
			response.setContentType("text/html; charset=UTF-8");
			out = response.getWriter();
			out.print(id);
			out.print(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//스트링[] request.getParameterValues() repuse.getParameter......
	
	@GetMapping("/array")
	public void array(@RequestParam String id,		//하나만 가져옴
						@RequestParam List<String> ids,	//스트링 배열 	@RequestParam String[] ids 이렇게 됨
						HttpServletResponse response) throws IOException{	//out.print를 사용하려면
		//System.out.println(id);
		//System.out.println(ids[0]);	//@RequestParam String[] ids 이거 사용하면
		//System.out.println(ids);
		
		PrintWriter out = response.getWriter();
		out.print(id);
		out.print(ids);
		
	}

}
