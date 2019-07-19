package com.datagrid.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.datagrid.mybatis.mapper.UvipMapper;

import com.datagrid.pojo.Uvip;
import com.datagrid.service.DatagridService;

@Service
public class DatagridserviceImpl implements DatagridService {

	@Autowired
	private UvipMapper uvipMapper;
	
	


	@Override
	public List<Uvip> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
