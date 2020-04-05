package com.datagrid.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagrid.pojo.PageBean;

import com.datagrid.pojo.Uvip;
import com.datagrid.pojo.UvipExample;
import com.datagrid.service.DatagridService;

@RestController
public class DatagridAction {
	
	@Autowired
	private DatagridService userService;
	
	
	@RequestMapping("/userList.do")
	public PageBean<Uvip> name(PageBean<Uvip> uvip,Integer page,Integer limit){
		

		UvipExample uvipExample=new UvipExample();
		/* uvip.setData(userService.findAll()); */
		uvip.setData(userService.findByPage(page, limit));
		uvip.setCount(userService.countByExample(uvipExample));
		return uvip;
		
	}
	
}
