package cn.edu.nuc.store.dao.interfaces;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.store.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    String findPass(@Param("userName")String userName);
}