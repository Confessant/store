package cn.edu.nuc.store.dao.interfaces;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.store.BaseTest;
import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Search;

public class BookMapperTest extends BaseTest{
	
	@Autowired
	private BookMapper bookMapper;
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testHot(){
		List<Book> list = bookMapper.hot();
		System.out.println(list);
	}

	@Test
	public void testFindByName() {
		Search search = new Search("的",0,3);
		List<Book> list  = bookMapper.findByName(search);
		System.out.println("------------"+list);
	}

}
