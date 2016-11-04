package cn.edu.nuc.store.service.interfaces;

import cn.edu.nuc.store.dto.PageInfo;
import cn.edu.nuc.store.entity.Search;

public interface BookTypeService {

	
	PageInfo paging(int bookid,int current);
	
	int bookid(String bookname);
	
	PageInfo pagingAll(int current);
	
	PageInfo searchService(Search search);
}
