package com.company.mvc.reply;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class ReplyVO {
	
	private String rno;
	private String bno;
	
	private String reply;
	//@JsonAlias(value = "writer")	//테스트 해본것임		// vo 객체를 바꿀때 Json~
	private String replyer;
	@JsonFormat(pattern = "yyyy--MM-dd") //날짜타입 바꿔준다
	private Date replyDate;
	@JsonIgnore
	private Date updateDate;
	
}
