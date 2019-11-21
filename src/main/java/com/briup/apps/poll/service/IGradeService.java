package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Grade;

public interface IGradeService {

	/**
	 * 添加或者更新年级信息
	 * @param grade
	 */
	void saveOrUpdateGrade(Grade grade);
	
	/**
	 * 根据id去删除年级信息
	 * @param id
	 */
	void deleteById(long id);
	
	/**
	 * 批量删除年级信息
	 * @param ids
	 */
	void deleteBatchById(long[] ids);
	
	/**
	 * 查询所有年纪信息
	 * @return
	 */
	List<Grade> findAll();
	
	/**
	 * 根据id去查询信息
	 * @param id
	 * @return
	 */
	Grade findByid(long id);
	
	
	
}
