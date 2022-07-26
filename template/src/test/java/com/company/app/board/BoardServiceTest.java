package com.company.app.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.board.service.BoardService;
import com.company.app.board.service.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/*-context.xml")
@Log4j
public class BoardServiceTest {
	
	@Setter(onMethod_ = @Autowired)	// 이렇게 해도 되고 @Autowired만 적어도 된다 똑같은 거임
	BoardService service;
	
	@Test
	public void insert() {
//		BoardVO vo = new BoardVO();
//		vo.setTitle("test1");
//		vo.setContent("test1 내용");
//		vo.setWriter("user10");
//		service.insertBoard(vo);
//		log.info("생성된 게시물 번호 : " + vo.getBno());
		// 생성된 게시물 번호 : null 이렇게 뜬다
		// 왜? 여기서 bno 값을 넣어주지 않았기 때문에
		//mapper에는 nextval로 해서 db에는 값이 들어가긴한다
		
		for(int i=1; i<100; i++) {
			BoardVO vo = new BoardVO();
			vo.setTitle("test1");
			vo.setContent("test1 내용");
			vo.setWriter("user10");
			service.insertBoard(vo);
			log.info("생성된 게시물 번호 : " + vo.getBno());
		}
	}

}
