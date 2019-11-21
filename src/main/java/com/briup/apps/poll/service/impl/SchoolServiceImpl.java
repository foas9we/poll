package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.School;
import com.briup.apps.poll.bean.SchoolExample;
import com.briup.apps.poll.mapper.SchoolMapper;
import com.briup.apps.poll.service.ISchoolService;

@Service
public class SchoolServiceImpl implements ISchoolService {
	
	@Autowired
	private SchoolMapper schoolMapper;
	
	
	@Override
	public void addSchool(School school) {
		if(school == null) {
			throw new RuntimeException("school 参数为空");
		}
		schoolMapper.insert(school);
	}


}
