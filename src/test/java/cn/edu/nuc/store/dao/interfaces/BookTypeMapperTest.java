package cn.edu.nuc.store.dao.interfaces;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.store.BaseTest;
import cn.edu.nuc.store.entity.Book;

public class BookTypeMapperTest extends BaseTest{

	@Autowired
	private BookTypeMapper bookTypeMapper;
	
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
	public void testCount(){
		int a = bookTypeMapper.count(6);
		System.out.println(a);
	}

	@Test
	public void testFindByType() {
		List<Book> list = bookTypeMapper.findByType(0, 3, 6);
		System.out.println(list);
	}
	
	@Test
	public void typeid() {
		int a = bookTypeMapper.typeid("科幻");
		System.out.println(a);
	}
	

}
