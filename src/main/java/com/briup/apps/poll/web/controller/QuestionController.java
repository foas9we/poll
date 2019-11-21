package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.extend.QuesstionVM;
import com.briup.apps.poll.service.IQuestionService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private IQuestionService questionService;
	
	
	@ApiOperation(value="添加题目信息以及相对应的选项信息")
	@PostMapping("/addQuestion")
	public void addQuestion(Question question,@RequestBody List<Option> options) {
		questionService.addQuestion(question, options);
	}
	
	@ApiOperation(value="删除题目信息以及相对应的选项和与问卷之间的关系")
	@GetMapping("/deleteQuestion")
	public void deleteQuestion(long id) {
		questionService.deleteById(id);
	}
	
	@ApiOperation(value="查询所有的题目以及相对应的选项")
	@GetMapping("/findAllQuestion")
	public List<QuesstionVM> findAllQuestion() {
		return questionService.findAll();
	}
	
	@ApiOperation(value="根据题干进行模糊查询")
	@GetMapping("/findAllQuestionByCondition")
	public List<QuesstionVM> findAllQuestionByCondition(String name) {
		return questionService.findByCondition(name);
	}
	
	
	
	
}
