package com.company.mvc.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.board.BoardMapper;
import com.company.mvc.board.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	
	@Autowired BoardMapper mapper;
	
	@Test
	public void test() {
		
		//mapper.getBoardList().forEach(vo -> logger.info(vo));
		
		List<BoardVO> result = mapper.getBoardList();
		System.out.println(result);
		
	}

}
