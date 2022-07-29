package com.company.app.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.book.mapper.BookMapper;
import com.company.app.book.service.BookService;
import com.company.app.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper mapper;

	@Override
	public List<BookVO> getbookList() {
		return mapper.getbookList();
	}

	@Override
	public int insertBook(BookVO vo) {
		return mapper.insertBook(vo);
	}
	
	

}
