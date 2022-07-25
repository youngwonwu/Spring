package com.company.mvc.reply;

import java.util.List;

public interface ReplyMapper {

	public int insertReply(ReplyVO no);
	public ReplyVO readReply(Long bno);
	public int deleteReply(Long bno);
	public int updateReply(ReplyVO reply);
	public List<ReplyVO> getListReply(Long bno);
	
}
