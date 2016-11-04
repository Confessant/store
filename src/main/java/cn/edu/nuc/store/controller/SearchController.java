package cn.edu.nuc.store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.store.dao.interfaces.BookMapper;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Search;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

@Controller
public class SearchController {
		
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private BookTypeService bookTypeService;
	
	@RequestMapping(value="/search",method = RequestMethod.POST)
	public String forward(
			@RequestParam(name="current",defaultValue="1") int current,  //当前页面
			String getsearch,
			HttpSession session,
			Model model){
		
		Search search = new Search();
		
		PageInfo pi = bookTypeService.searchService(search);
		
		model.addAttribute("pi", pi);
		
		return "face";
	}
}
