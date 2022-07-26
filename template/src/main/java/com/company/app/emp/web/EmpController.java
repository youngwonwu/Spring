package com.company.app.emp.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.emp.service.EmpReqVO;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Controller	//쓰던 안쓰던 꼭 해두기, Logger 설정도!!
public class EmpController {
	
	@Autowired EmpService service;
	Logger logger = LoggerFactory.getLogger(EmpController.class);	//slf4j로 로거 만들기
	
	//단건조회
	@RequestMapping("/emp")
	public String emp(EmpVO vo, Model model, HttpServletRequest request) {
		logger.info("파라미터 : " + vo.toString());
		model.addAttribute("emp", service.getEmp(vo));
		//request.setAttribute("emp", mapper.getEmp(vo));	//request로 해도 되지만 모델로 하면 됨, 잘 안씀
		return "emp/emp";	//폴더명/파일명
	}
	
	//목록
	//검색기능이 있는 목록
	@RequestMapping("/emplist")
	public String empList(Model model, EmpReqVO vo) {
		model.addAttribute("list", service.getEmpReqList(vo));
		return "emp/emplist";
	}
	
	//등록페이지로 이동
	//@RequestMapping은 모든 맴핑이 다 들어오고 @GetMapping은 조희 @PostMapping은 등록, 수정 할때
	@GetMapping("/empInsert")	
	public String empInsert() {
		
		return "emp/empInsert";
	}
	//등록 처리	//등록해서 폼 액션 처리하는곳
	@PostMapping("/empInsert")	//액션주소랑 같아야 함
	public String empInsertProc(EmpVO vo) {	//위에 처럼 안해도 스트링은 모든 vo가 파라이터에 들어옴
		//커맨드객체
		logger.debug(vo.toString());
		System.out.println(vo);
		service.InsertEmp(vo);
		System.out.println(vo.getEmployeeId() + "사번 등록");	//id값 들어갔는지 확인
		return "redirect:emplist";	//이게 뭐라궁...
	}
	
	//수정
	//수정 페이지
	@RequestMapping("/empUpdate/{empId}")
	public String empUpdateFrom(Model model, EmpVO vo, @PathVariable String empId)	{	//@PathVariable 주소에 /empUpdate/102 이렇게 되게
		vo.setEmployeeId(empId);
		model.addAttribute("emp", service.getEmp(vo));
		return "emp/empUpdate";
	}
	//수정 처리
	@PostMapping("/empUpdate")
	public String empUpdateProc(EmpVO vo) {
		service.UpdateEmp(vo);
		return "redirect:emplist";
	}

	//삭제
	@RequestMapping("/empDelete")
	public String empDelete(EmpVO vo) {
		service.deleteEmp(vo);
		return "redirect:emplist";
	}
}
