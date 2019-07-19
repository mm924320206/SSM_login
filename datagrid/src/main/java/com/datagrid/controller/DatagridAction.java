package com.datagrid.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagrid.pojo.PageBean;

import com.datagrid.pojo.Uvip;
import com.datagrid.service.DatagridService;

@RestController
public class DatagridAction {
	
	@Autowired
	private DatagridService userService;
	
	
	@RequestMapping("/userlogin.do")
	public PageBean<Uvip> name(PageBean<Uvip> uvip){
		List<Uvip> list=userService.findAll();
		return uvip;
		
	}
}
