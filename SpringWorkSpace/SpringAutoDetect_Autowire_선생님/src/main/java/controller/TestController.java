package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import service.TotalService;
import vo.DeptVO;

@Controller
public class TestController {
	//경로 설정
	public static final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	@Autowired
	TotalService service;
	
	public TestController() {
		System.out.println("--- TestController 생성자 ---");
	}


	
	@RequestMapping(value = {"/","/list.do"})
	public String list(Model model) {
		//dao에서 목록 요청...
		List<DeptVO> dept_list = service.selectList_dept();
		
		model.addAttribute("list", dept_list);
		
		return VIEW_PATH + "total_list.jsp";
		
	}
}



















