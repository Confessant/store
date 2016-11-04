package cn.edu.nuc.store.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.store.dao.interfaces.BookMapper;
import cn.edu.nuc.store.dao.interfaces.BookTypeMapper;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Search;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

@Service
public class BookTypeServiceImpl implements BookTypeService {

	@Autowired
	private BookTypeMapper bookTypeMapper;
	
	@Autowired
	private BookMapper bookMapper;
	
	
	/**
	 * 模糊搜索search
	 */
	@Override
	public PageInfo searchService(Search search){
		
		int count = bookMapper.findByName(search).size();
		
		PageInfo pi = new PageInfo(count);
		
		List<Book> list = bookMapper.findByName(search);
		
		pi.setList(list);
		
		return pi;
		
	}
	
	@Override
	public PageInfo paging(int bookid, int current) {
		
		/*PageInfo pi = new PageInfo(current);
		
		int count = bookMapper.countAll();
		
		pi.setCount(count);
		
		List<Book> list = bookTypeMapper.findAll(pi.getStart(),pi.getOffset());
		
		pi.setList(list);
		
		return pi;*/
		PageInfo pi = new PageInfo(current);
		
		int count = bookTypeMapper.count(bookid);
		
		pi.setCount(count);
		
		List<Book> list = bookTypeMapper.findByType(pi.getStart(),pi.getOffset(),bookid);
		
		pi.setList(list);
		
		return pi;
	}
	
	@Override
	public PageInfo pagingAll(int current) {
		
		PageInfo pi = new PageInfo(current);
		
		int count = bookMapper.countAll();
		
		pi.setCount(count);
		
		List<Book> list = bookTypeMapper.findAll(pi.getStart(),pi.getOffset());
		
		pi.setList(list);
		
		return pi;
	}

	@Override
	public int bookid(String bookname) {
		return 0;
	}

}
