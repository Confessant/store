package cn.edu.nuc.store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.store.dao.interfaces.BookMapper;
import cn.edu.nuc.store.dao.interfaces.BookTypeMapper;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

@Controller
public class Books {

	
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private BookTypeService bookTypeService;
	
	@RequestMapping(value="/login")
	public String forward(
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session,
			Model model){
//		List<Book> list = bookTypeMapper.findByType(0, 3, 6);
		List<Book> hot = bookMapper.hot();
		session.setAttribute("hot", hot);
		
		//Book book = (Book)session.getAttribute("paging");
		/*if( book == null || book.getAid() != aid ){
			return "redirect:/login";
		}*/
		
		PageInfo pi = bookTypeService.pagingAll(current);
		
		model.addAttribute("pi", pi);
		
		
		return "face";
	}
	
	
	
}
