package cn.edu.nuc.store.dao.interfaces;

import cn.edu.nuc.store.entity.Publish;

public interface PublishMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Publish record);

    int insertSelective(Publish record);

    Publish selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);
}