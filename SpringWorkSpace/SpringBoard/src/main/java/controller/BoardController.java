package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.Common;
import dao.BoardDAO;
import vo.BoardVO;

@Controller
public class BoardController {

	private BoardDAO board_dao;
	
	public BoardController(BoardDAO board_dao) {
		this.board_dao = board_dao;
	}
	
	@RequestMapping(value = {"/","/list.do"})
	public String list(Model model) {
		List<BoardVO> list = board_dao.getList();
		
		model.addAttribute("list", list);
		
		return Common.Board.VIEW_PATH + "list.jsp";
	}
	
	@RequestMapping("/readContent.do")
	public String readContent(Model model,int seq) {
		
		BoardVO vo = board_dao.getContent(seq);
		
		model.addAttribute("vo", vo);
		
		
		return Common.Board.VIEW_PATH + "read.jsp";
	}
	
	
}




















