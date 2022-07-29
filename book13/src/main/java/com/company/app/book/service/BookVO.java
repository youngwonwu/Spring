package com.company.app.book.service;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {

	private String bookNo;
	private String bookName;
	private String bookCoverimg;
	private Date bookDate;
	private String bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
}
