package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardService;

@Controller
//어노테이션을 통해서 이게 컨트롤러임을 알려줘야한다 
public class BoardController {
	
	private BoardService service;
	
	public BoardController() {
		System.out.println("-----BoradController 생성자 -----");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
	
	//사용자가 board/list.do를 요청 하면 해당 메소드가 실행될 수 있도록 하려면
	//@requestMapping을 통해 지정하면 된다 
	
	@RequestMapping("/board/list.do")
	public String list(Model model) {
		
		//Model - servlet과 controller의 중간 매개체 역할을 하는 인터페이서
		//		- request 객체와 바인딩(연결) 처리가 되어 서로간의 호환이 가능해진다 
		
		List<String> list = service.selectList();
		
		//request.setAttribute 를 한 것과 동일 
		model.addAttribute("list",list);
		
		return "board_list";
	}

}
