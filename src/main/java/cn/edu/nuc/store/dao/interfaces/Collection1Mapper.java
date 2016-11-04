package cn.edu.nuc.store.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.store.entity.Book;
import cn.edu.nuc.store.entity.Collection1;
import cn.edu.nuc.store.entity.User;

public interface Collection1Mapper {
    int insert(Collection1 record);

    int insertSelective(Collection1 record);
    
    List<Book> findCollection(@Param("userName")String userName);
}