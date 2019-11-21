package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.ClazzExample;
import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.bean.OptionExample;
import com.briup.apps.poll.bean.QQExample;
import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.extend.ClazzVM;
import com.briup.apps.poll.bean.extend.QuesstionVM;
import com.briup.apps.poll.mapper.ClazzMapper;
import com.briup.apps.poll.mapper.OptionMapper;
import com.briup.apps.poll.mapper.QQMapper;
import com.briup.apps.poll.mapper.QuestionMapper;
import com.briup.apps.poll.mapper.extend.ClazzVMMapper;
import com.briup.apps.poll.mapper.extend.QuestionVMMapper;
import com.briup.apps.poll.service.IClazzService;
import com.briup.apps.poll.service.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;
	
	@Autowired
	private OptionMapper optionMapper;
	
	@Autowired
	private QuestionVMMapper questionVMMapper;
	
	@Autowired
	private QQMapper qqMapper;
	
	@Override
	public void addQuestion(Question question, List<Option> options) {
		questionMapper.insert(question);
		for (Option option : options) {
			option.setQuestionId(question.getId());
			optionMapper.insert(option);
		}
	}

	@Override
	public void deleteById(long id) {
		/*
		 * 先删除 option
		 * 再删除 qq
		 * 删除question
		 */
		OptionExample optionExample = new OptionExample();
		optionExample.createCriteria().andQuestionIdEqualTo(id);
		optionMapper.deleteByExample(optionExample);
		
		// 删除qq
		QQExample qQExample = new QQExample();
		qQExample.createCriteria().andQuestionIdEqualTo(id);
		qqMapper.deleteByExample(qQExample);
		
		// 删除 question
		questionMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<QuesstionVM> findAll() {
		return questionVMMapper.findAll();
	}

	@Override
	public List<QuesstionVM> findByCondition(String name) {
		// 三目运算符
		name = name==null ? "%%" : "%" + name + "%";
		return questionVMMapper.findAllByCondition(name);
	}
	

}
