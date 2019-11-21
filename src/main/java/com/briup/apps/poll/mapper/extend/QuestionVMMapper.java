package com.briup.apps.poll.mapper.extend;

import java.util.List;

import com.briup.apps.poll.bean.extend.QuesstionVM;

public interface QuestionVMMapper {
	List<QuesstionVM> findAll();
	
	List<QuesstionVM> findAllByCondition(String name);
	
	List<QuesstionVM> findById(long questionnaireId);
}
