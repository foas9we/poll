package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.QQ;
import com.briup.apps.poll.bean.Questionnaire;
import com.briup.apps.poll.bean.QuestionnaireExample;
import com.briup.apps.poll.bean.extend.QuestionnaireVM;
import com.briup.apps.poll.mapper.QQMapper;
import com.briup.apps.poll.mapper.QuestionnaireMapper;
import com.briup.apps.poll.mapper.extend.QuestionnaireVMMapper;
import com.briup.apps.poll.service.IQuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {

	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@Autowired
	private QQMapper qQMapper;
	
	@Autowired
	private QuestionnaireVMMapper questionnaireVMMapper;
	
	
	@Override
	public List<Questionnaire> findAll() {
		return questionnaireMapper.selectByExample(new QuestionnaireExample());
	}

	@Override
	public void addQuestionnaire(Questionnaire questionnaire, long[] ids) {
		/*
		 * 先插入问卷信息
		 * 再插入桥表信息
		 */
		questionnaireMapper.insert(questionnaire);
		
		// 怎么插入桥表(poll_qq)信息
		for (long id : ids) {
			QQ qq = new QQ();
			qq.setQuestionId(id);
			qq.setQuestionnaireId(questionnaire.getId());
			qQMapper.insert(qq);
		}
	}

	@Override
	public QuestionnaireVM findById(long id) {
		return questionnaireVMMapper.findById(id);
	}

}
