package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId = Integer.parseInt(request.getParameter("bId")); 
   	 BoardVO vo = BoardRepository.getInstance().getContent(bId);
        request.setAttribute("content", vo);
        request.setAttribute("boardNo", bId);
        
	}

}
