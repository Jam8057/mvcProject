package com.kh.web.board.service;

import java.util.List;

import java.util.Map;

import com.kh.common.Pagination;
import com.kh.common.Search;
import com.kh.web.board.model.BoardVO;
import com.kh.web.board.model.ReplyVO;

public interface BoardService {

	public List<BoardVO> getBoardList(Search search) throws Exception;

	// 총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;

	public void insertBoard(BoardVO boardVO) throws Exception;

	public BoardVO getBoardContent(int bid) throws Exception;

	public void updateBoard(BoardVO boardVO) throws Exception;

	public void deleteBoard(int bid) throws Exception;

	// 댓글 리스트
	public List<ReplyVO> getReplyList(int bid) throws Exception;

	public int saveReply(ReplyVO replyVO) throws Exception;

	public int updateReply(ReplyVO replyVO) throws Exception;

	public int deleteReply(int rid) throws Exception;

}
