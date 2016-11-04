package cn.edu.nuc.store.dao.interfaces;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.BaseTest;
import cn.edu.nuc.store.dao.interfaces.Collection1Mapper;

public class Collection1MapperTest extends BaseTest{

	@Autowired
	private Collection1Mapper collection;
	
	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindCollection() {
		List<Book> list = collection.findCollection("zhangsan");
		System.out.println(list);
	}

}
