package cn.edu.nuc.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.store.dao.interfaces.BookTypeMapper;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

@Controller
public class FindAll {
	
	
	@Autowired
	private BookTypeService bookTypeService;
	
	@Autowired
	private BookTypeMapper bookTypeMapper;
	/**
	 * 返回分类图书的方法
	 * @param bookname
	 * @param current
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{bookname}/type")
	public String typebook(
			@PathVariable("bookname") String bookname,
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session,
			Model model){
		/*List<Book> list = bookTypeMapper.findByType(0, 3, 6);
		List<Book> hot = bookMapper.hot();
		session.setAttribute("list", list);
		session.setAttribute("hot", hot);*/
		
		
		
		//Book book = (Book)session.getAttribute("paging");
		
		
		/*if( book == null || book.getAid() != aid ){
			return "redirect:/login";
		}*/
		int type = bookTypeMapper.typeid(bookname);
		
		PageInfo pi = bookTypeService.paging(type, current);
		
		model.addAttribute("pi", pi);
		
		return "face2";
	}
}
