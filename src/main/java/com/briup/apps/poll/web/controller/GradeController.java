package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.Teacher;
import com.briup.apps.poll.service.IGradeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/grade")
public class GradeController {

	@Autowired
	private IGradeService gradeService;
	
	
	@ApiOperation(value="添加年级信息")
	@PostMapping("/addGrade")
	public void addGrade(Grade grade) {
		gradeService.saveOrUpdateGrade(grade);
	}
	
	@ApiOperation(value="查询所有的年级信息")
	@GetMapping("/getAllGrade")
	public List<Grade> findAllGrade() {
		return gradeService.findAll();
		
	}

	
	@ApiOperation(value="根据id查询年级信息")
	@GetMapping("/getById")
	public Grade findById(long id) {
		return gradeService.findByid(id);
	}
	
	
	
}
