package cn.edu.nuc.store.dao.interfaces;

import cn.edu.nuc.store.entity.Buy;

public interface BuyMapper {
    int insert(Buy record);

    int insertSelective(Buy record);
}