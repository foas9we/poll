package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.service.IClazzService;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.extend.ClazzVM;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	
	@GetMapping("findAll")
	public List<Clazz> findAll(){
		return clazzService.findAll();
	}
	
	@GetMapping("findAllClazzVM")
	public List<ClazzVM> findAllClazzVM(){
		List<ClazzVM> list =  clazzService.findAllClazzVM();
		return list;
	}
}
