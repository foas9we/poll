package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.ClazzExample;
import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.GradeExample;
import com.briup.apps.poll.mapper.ClazzMapper;
import com.briup.apps.poll.mapper.GradeMapper;
import com.briup.apps.poll.service.IGradeService;

@Service
public class GradeServiceImpl implements IGradeService {

	@Autowired
	private GradeMapper gradeMapper;
	
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Override
	public void saveOrUpdateGrade(Grade grade) {
		if(grade == null) {
			throw new RuntimeException("grade 参数为空");
		} 
		
		if(grade.getId() == null) {
			gradeMapper.insert(grade);
		} else {
			gradeMapper.updateByPrimaryKey(grade);
		}
	
	}

	
	@Override
	public void deleteById(long id) {
		/*
		 * 由于年级跟班级是一对多的关系
		 * 那么先删除有外键的一方，再删除没有外键的一方
		 */

		ClazzExample example = new ClazzExample();
		example.createCriteria().andGradeIdEqualTo(id);
		clazzMapper.deleteByExample(example);
		gradeMapper.deleteByPrimaryKey(id);
	} 

	@Override
	public void deleteBatchById(long[] ids) {
		if(ids == null) {
			throw new RuntimeException("参数为空");
		}
		for (long id : ids) {
			deleteById(id);
		}
	}

	@Override
	public List<Grade> findAll() {
		GradeExample example = new  GradeExample();
		return gradeMapper.selectByExample(example);
	}

	@Override
	public Grade findByid(long id) {
		return gradeMapper.selectByPrimaryKey(id);
	}
	
	
}
