package cn.edu.nuc.store.dao.interfaces;

import cn.edu.nuc.store.entity.Read;

public interface ReadMapper {
    int insert(Read record);

    int insertSelective(Read record);
}