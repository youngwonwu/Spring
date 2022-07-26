package com.company.app.board.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.app.board.mapper.BoardMapper;
import com.company.app.board.service.BoardService;
import com.company.app.board.service.BoardVO;
import com.company.app.common.Criteria;
import com.company.app.common.PageDTO;

@Controller
//@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired BoardService service;
	Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//상세보기(단건조회)
	@GetMapping("/getBoard")
	public String boardGet(BoardVO vo, Model model, @PathVariable String bno) {
		vo.setBno(bno);
		model.addAttribute("board", service.getBoard(vo));
		return "board/boardGet";
	}
	
	//목록
	@RequestMapping("/boardList")
	public String boardList(Model model, Criteria cri) {
		//페이징 처리
		//전체건수
		cri.setAmount(10);	//목록 몇개 보일건지
		int total = service.getTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		model.addAttribute("boardList", service.getBoardList(cri));
		return "board/boardList";
	}
	
	//등록페이지로 이동
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "board/boardInsert";
	}
	//등록
	@PostMapping("/boardInsert")
	public String boardInsertProc(BoardVO vo, RedirectAttributes rttr) {
		if(service.insertBoard(vo)) {
			rttr.addFlashAttribute("result", "success");
		}
		System.out.println(vo.getWriter()+"님의 게시글이 등록되었습니다.");
		return "redirect:boardList";
	}
	
	//수정
	//수정 페이지
	@RequestMapping("/boardUpdate/{bno}")
	public String boardUpdateForm(BoardVO vo, Model model, @PathVariable String bno) {
		vo.setBno(bno);
		model.addAttribute("board", service.getBoard(vo));
		return "board/boardUpdate";
	}
	//수정 처리
	@PostMapping("/boardUpdate")
	public String boardUpdateProc(BoardVO vo, RedirectAttributes rttr) {
		if(service.updateBoard(vo)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:boardList";
	}
	
	//삭제
	@RequestMapping("/boardDelete")
	public String boardDelete(BoardVO vo, RedirectAttributes rttr) {
		if(service.deleteBoard(vo)) {
			rttr.addFlashAttribute("result", "success");
		};
		return "redirect:boardList";
	}

}
