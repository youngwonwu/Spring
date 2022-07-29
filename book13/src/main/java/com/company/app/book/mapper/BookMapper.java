package com.company.app.book.mapper;

import java.util.List;

import com.company.app.book.service.BookVO;

public interface BookMapper {
	
	public List<BookVO> getbookList();
	int insertBook(BookVO vo);

}
