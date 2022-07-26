package com.company.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	
	private String bno;
	private String title;
	private String content;
	private String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updateDate;
	
}
