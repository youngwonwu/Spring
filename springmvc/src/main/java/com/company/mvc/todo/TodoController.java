package com.company.mvc.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController	//
@CrossOrigin(origins = "*")
public class TodoController {
	
	@Autowired TodoMapper mapper;
	
//	@GetMapping("/getText")
//	public String getText() {
//		return "hello~ it's me";
//	}																			//text/plain	MIME 타입 : 이걸보고 브라우저가 처리함
//	@GetMapping(value="/getText", produces = "text/plain; charset=utf-8")		//produces에 원하는 Content-Type 적으면 됨
	@GetMapping(value="/getText", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getText() {
		String sentence = "영원 언니 안뇽,\n";
		sentence += "내가 누군지 아뉘?\n";
		sentence += "어디 한번 맞춰봐바~~~~~";
		return sentence;
	}
	
	@GetMapping("check")
	public List<TodoVO> check(TodoVO vo) {
		int a= 5/0;
		return mapper.findAll(vo);
	}
	
	//조희
//	@RequestMapping("/todo")
//	public List<TodoVO>	todoList(TodoVO vo) {
//		return mapper.findAll(vo);
//	}
//	@GetMapping("/todo")
  //조회(자원이름 (테이블명)만 적어주면 된다.)
	@GetMapping(value = "/todo", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<TodoVO>> todoList(TodoVO vo) { //JSON구조의 String으로 넘김
      //int a = 5/0;
		List<TodoVO> list = mapper.findAll(vo);
	    return new ResponseEntity<List<TodoVO>>(list, HttpStatus.OK); //response 상태값 넘길 수 있음 
	}
	//등록
//	@PostMapping("/todoInsert")
//	public TodoVO todoInsert(TodoVO vo) {
//		mapper.persist(vo);
//		return vo;
//	}
	@PostMapping("/todo")
	public TodoVO todoInsert(TodoVO vo) {
		mapper.persist(vo);
		return vo;
	}
	
	//수정
//	@GetMapping("/todoUpdate")
//	public TodoVO todoUpdate(TodoVO vo) {
//		mapper.merge(vo);
//		return vo;
//	}
	@PutMapping("/todo")	//수정은 파라미터 json을 vo 담을려면 @RequestBody가 필요하다
	public TodoVO todoUpdate(@RequestBody TodoVO vo) {
		mapper.merge(vo);
		return vo;
	}
	
	//삭제
//	@GetMapping("/todoDelete")
//	public TodoVO todoDelete(TodoVO vo) {
//		mapper.remove(vo);
//		return vo;
//	}
	@DeleteMapping("/todo/{no}")
	public Integer todoDelete(@PathVariable Integer no) {		///{no} 값을 읽어주는게 @PathVariable
		mapper.remove(no);
		return no;
	}
	
	//단건조회
	@GetMapping("/todo/{no}")
	public TodoVO todoSelect(@PathVariable Integer no) {
		return mapper.findById(no);
	}

}
