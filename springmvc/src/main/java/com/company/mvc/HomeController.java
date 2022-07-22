package com.company.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.mvc.emp.EmpMapper;
import com.company.mvc.emp.EmpVO;
// commend 랑 같다고 보면됨....
/**
 * Handles requests for the application home page.
 */
@Controller	//POJO이면서 @component상속, 빈등록		서브릿이 호출할 수 있도록 command화 시킴
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)	//{} 배열로 가능 경로를 /나 /home하면 emp가 나온다
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
//	@RequestMapping("/ajax")
//	@ResponseBody
//	public EmpVO ajax(EmpVO vo) {
//		vo.setFirst_name("hong");
//		vo.setLast_name("gildong");
//		return vo;
//	}
	
//	@Autowired EmpMapper mapper;
//	//http://localhost/mvc/emp?employee_id=100 get방식
//	@RequestMapping("/emp")	// 파라미터에서 id 100번째를 알아서 들고온다
//	public String emp(EmpVO vo, Model model) {
//		model.addAttribute("emp", mapper.getEmp(vo));	//emp.jsp에 ${emp.vo에 있는 값}
//		return "emp";	//emp.jsp 이동
//		//return "폴더명/파일명"
//	}
	
	
}
