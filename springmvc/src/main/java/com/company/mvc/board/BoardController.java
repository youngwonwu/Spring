package com.company.mvc.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired BoardMapper mapper;
	Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//상세보기(단건조회)
	@RequestMapping("/get/{bno}")
	public String boardGet(BoardVO vo, Model model, @PathVariable String bno) {
		vo.setBno(bno);
		model.addAttribute("board", mapper.getBoard(vo));
		return "board/boardGet";
	}
	
	//목록
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		model.addAttribute("boardList", mapper.getBoardList());
		return "board/boardList";
	}
	
	//등록페이지로 이동
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "board/boardInsert";
	}
	//등록
	@PostMapping("/boardInsert")
	public String boardInsertProc(BoardVO vo) {
		mapper.insertBoard(vo);
		System.out.println(vo.getWriter()+"님의 게시글이 등록되었습니다.");
		return "redirect:boardList";
	}
	
	//수정
	//수정 페이지
	@RequestMapping("/boardUpdate/{bno}")
	public String boardUpdateForm(BoardVO vo, Model model, @PathVariable String bno) {
		vo.setBno(bno);
		model.addAttribute("board", mapper.getBoard(vo));
		return "board/boardUpdate";
	}
	//수정 처리
	@PostMapping("/boardUpdate")
	public String boardUpdateProc(BoardVO vo) {
		System.out.println(vo);
		mapper.updateBoard(vo);
		return "redirect:boardList";
	}
	
	//삭제
	@RequestMapping("/boardDelete")
	public String boardDelete(BoardVO vo) {
		mapper.deleteBoard(vo);
		return "redirect:boardList";
	}

}
