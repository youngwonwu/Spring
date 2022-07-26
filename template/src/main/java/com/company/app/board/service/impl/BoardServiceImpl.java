package com.company.app.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.board.mapper.BoardMapper;
import com.company.app.board.service.BoardService;
import com.company.app.board.service.BoardVO;
import com.company.app.common.Criteria;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper mapper;
	
	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return mapper.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(Criteria cri) {
		return mapper.getBoardList(cri);
	}

	@Override
	public boolean insertBoard(BoardVO vo) {
		return mapper.insertBoard(vo)  == 1;
	}

	@Override
	public boolean updateBoard(BoardVO vo) {
		return mapper.updateBoard(vo) == 1;
	}

	@Override
	public boolean deleteBoard(BoardVO vo) {
		return mapper.deleteBoard(vo) == 1;
	}

}
