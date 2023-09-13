package com.jsp.board.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;

//지금 DB를 아직 배우지 않아서
//DB 역할을 대신할 List를 하나 선언해서 BoardVO객체를 저장하겠습니다.
public class BoardRepository {
	
	private static final List<BoardVO> boardList = new ArrayList<>();
	
	private BoardRepository() {}
	
	private static BoardRepository repository = new BoardRepository();
	
	public static BoardRepository getInstance() {
		return repository;
	}
	
	//게시글 등록 메서드
	public void regist(BoardVO vo) {
		boardList.add(vo);
	}
	
	//전체 게시물(BoardList)을 담고있는 리스트를 리턴
	public List<BoardVO> getList() {
		return boardList;
	}
	
	
}
