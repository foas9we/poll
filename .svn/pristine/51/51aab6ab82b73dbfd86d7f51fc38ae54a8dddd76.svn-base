package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.bean.extend.QuestionnaireVM;
import com.briup.apps.poll.service.IQuestionnaireService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/naire")
public class QuestionnaireController {

	@Autowired
	private IQuestionnaireService questionnaireService; 
	
	@ApiOperation(value="查询所有的问卷，不级联查询")
	@GetMapping("/findAll")
	public List<Questionnaire> findAll() {
		return questionnaireService.findAll();
	}
	
	@ApiOperation(value="添加问卷信息以及与题目之间的关系")
	@PostMapping("/addQuestionnaire")
	public void addQuestionnaire(Questionnaire questionnaire,long[] ids) {
		 questionnaireService.addQuestionnaire(questionnaire, ids);
	}
	
	
	@PostMapping("/findById")
	public QuestionnaireVM findById(long id) {
		return questionnaireService.findById(id);
	}
}
