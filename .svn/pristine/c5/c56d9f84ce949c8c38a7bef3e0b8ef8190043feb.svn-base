package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.extend.QuesstionVM;

public interface IQuestionService {

	void addQuestion(Question question,List<Option> options);
	
	/**
	 * 删除题目及其选项以及与问卷之间的关系
	 * @param id
	 */
	void deleteById(long id);
	
	List<QuesstionVM> findAll();
	
	List<QuesstionVM> findByCondition(String name);
}
