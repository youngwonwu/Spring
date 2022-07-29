package com.company.app.book.service;

import java.util.List;

public interface BookService {
	
	public List<BookVO> getbookList();
	int insertBook(BookVO vo);

}
