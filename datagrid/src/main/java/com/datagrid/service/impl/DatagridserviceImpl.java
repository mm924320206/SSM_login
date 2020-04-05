package com.datagrid.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.datagrid.mybatis.mapper.UvipMapper;

import com.datagrid.pojo.Uvip;
import com.datagrid.pojo.UvipExample;
import com.datagrid.service.DatagridService;

@Service
public class DatagridserviceImpl implements DatagridService {

	@Autowired
	private UvipMapper uvipMapper;
	
	


	@Override
	public List<Uvip> findAll() {
		// TODO Auto-generated method stub
		return uvipMapper.findAll();
	}




	@Override
	public int countByExample(UvipExample example) {
		// TODO Auto-generated method stub
		return uvipMapper.countByExample(example);
	}




	@Override
	public List<Uvip> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		page=limit*(page-1);
		
		return uvipMapper.findByPage(page,limit);
	}
	
}
