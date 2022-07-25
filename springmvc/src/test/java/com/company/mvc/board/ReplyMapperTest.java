package com.company.mvc.board;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.reply.ReplyMapper;
import com.company.mvc.reply.ReplyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:config/*.xml")
public class ReplyMapperTest {
	
	@Autowired ReplyMapper mapper;
	
	@Test
	public void getList() {
		System.out.println(mapper.getListReply(1L));
	}
	
//	@Test
//	public void insert() {
//		
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("replyer" + i);
//			
//			mapper.insert(vo);
//		});
//	}

}
