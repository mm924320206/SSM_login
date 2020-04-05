package com.datagrid.service;

import java.util.List;

import com.datagrid.pojo.Uvip;
import com.datagrid.pojo.UvipExample;

public interface DatagridService {

	List<Uvip> findAll();
	int countByExample(UvipExample example);
	List<Uvip> findByPage(Integer page, Integer limit);
	
}
