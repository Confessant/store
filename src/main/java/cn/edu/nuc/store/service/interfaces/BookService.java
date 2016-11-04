package cn.edu.nuc.store.service.interfaces;

import cn.edu.nuc.store.dto.PageInfo;

public interface BookService {
	
	PageInfo book(int bookid,int current);
}
