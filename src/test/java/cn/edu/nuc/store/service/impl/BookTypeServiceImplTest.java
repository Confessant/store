package cn.edu.nuc.store.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.store.BaseTest;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Search;
import cn.edu.nuc.store.service.interfaces.BookTypeService;

public class BookTypeServiceImplTest extends BaseTest {

	
	@Autowired
	private BookTypeService bookTypeService;
	@Test
	public void testBook() {
		PageInfo pi  = bookTypeService.paging(6, 2);
		System.out.println(pi);
	}
	
	@Test
	public void searchService(){
		Search search = new Search("的",55,3);
		PageInfo pi = bookTypeService.searchService(search);
		System.out.println(pi);
		
	}
	
	@Test
	public void pagingAll(){
		PageInfo pi  = bookTypeService.pagingAll(11);
		System.out.println(pi);
	}

}
