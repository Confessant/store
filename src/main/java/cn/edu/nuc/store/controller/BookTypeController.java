package cn.edu.nuc.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.store.dao.interfaces.BookTypeMapper;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

@Controller
public class BookTypeController {
	
	@Autowired
	private BookTypeService bookTypeService;
	
	@Autowired
	private BookTypeMapper bookTypeMapper;
	
	
	
	@RequestMapping(value="/{bookname}/type1")
	public String index(
			@PathVariable("bookname") String bookname,
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session, 
			Model model){
		//Book book = (Book)session.getAttribute("paging");
		/*if( book == null || book.getAid() != aid ){
			return "redirect:/login";
		}*/
		
		
		
		int type = bookTypeMapper.typeid(bookname);
		
		PageInfo pi = bookTypeService.paging(type, current);
		
		model.addAttribute("pi", pi);
		
		return "index";
	}
	
}
