package com.company.app.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.app.book.service.BookService;
import com.company.app.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired BookService service;
	
	//도서 등록페이지
	@GetMapping("/bookInsert")
	public String bookInsert() {
		return "book/bookInsert";
	}
	//도서 등록
	@RequestMapping(value = "/bookInsert", method = RequestMethod.POST)
	public String bookInsertProc(BookVO vo) {
		service.insertBook(vo);
		return "redirect:bookList";
	}
	
	//도서목록조회
	@RequestMapping("/bookList")
	public String bookList(Model model) {
		model.addAttribute("bookList", service.getbookList());
		return "book/bookList";
	}

}
