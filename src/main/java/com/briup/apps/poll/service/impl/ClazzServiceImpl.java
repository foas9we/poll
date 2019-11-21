package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Clazz;
import com.briup.apps.poll.bean.ClazzExample;
import com.briup.apps.poll.bean.extend.ClazzVM;
import com.briup.apps.poll.mapper.ClazzMapper;
import com.briup.apps.poll.mapper.extend.ClazzVMMapper;
import com.briup.apps.poll.service.IClazzService;

@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;
	@Autowired
	private ClazzVMMapper clazzVMMapper;
	
	@Override
	public List<Clazz> findAll() {
		ClazzExample example = new ClazzExample();
		List<Clazz> list = clazzMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<ClazzVM> findAllClazzVM() {
		
		return clazzVMMapper.findAll();
	}

}
