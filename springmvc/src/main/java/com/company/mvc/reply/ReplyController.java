package com.company.mvc.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyController {
	
	@Autowired ReplyMapper mapper;
	
	
	
	//등록
	@PostMapping("/reply")
	public ReplyVO insert(ReplyVO vo) {
		mapper.insertReply(vo);
		return vo;
	}
	
	//수정
	@PutMapping("/reply")
	public ReplyVO update(@RequestBody ReplyVO vo) {
		mapper.updateReply(vo);
		return vo;
	}
	
	//삭제
	@DeleteMapping("/reply/{rno}")
	public Long delete(@PathVariable Long no) {
		mapper.deleteReply(no);
		return no;
	}

}
