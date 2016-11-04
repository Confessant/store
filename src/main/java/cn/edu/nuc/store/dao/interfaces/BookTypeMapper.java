package cn.edu.nuc.store.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.BookType;

public interface BookTypeMapper {
	//通过类型名称查找类型id
	int typeid(@Param("typename")String typename);
	
	
	
    int deleteByPrimaryKey(Integer typeid);

    int insert(BookType record);

    int insertSelective(BookType record);

    BookType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
    
    int count(@Param("typeid")int typeid);
    
    List<Book> findAll(@Param("start")int start,@Param("offset")int offset);
    
    //										分页中传入起始行，					每页几条，					图书类别id
    List<Book> findByType(@Param("start")int start,@Param("offset")int offset,@Param("typeId")int typeId);
    
}