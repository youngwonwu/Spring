package com.company.mvc.board;

import java.util.List;

public interface BoardMapper {
	
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoardList();
	public void insertBoard(BoardVO vo);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);

}
