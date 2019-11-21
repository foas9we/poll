package com.briup.apps.poll.bean.extend;

import java.util.List;

import com.briup.apps.poll.bean.Question;

public class QuestionnaireVM {
	private long id;
	private String name;
	private String description;
	
	/**
	 * 一个问卷对应着多个题目
	 */
	private List<QuesstionVM> quesstionVMs;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<QuesstionVM> getQuesstionVMs() {
		return quesstionVMs;
	}

	public void setQuesstionVMs(List<QuesstionVM> quesstionVMs) {
		this.quesstionVMs = quesstionVMs;
	}
	
}
