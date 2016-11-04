package cn.edu.nuc.store.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Search;

public interface BookMapper {
	
	int count(@Param("bookid")Integer bookid);
	
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
    List<Book> findByName(Search search);
    
    List<Book> hot();
    
    int countAll();
    
}