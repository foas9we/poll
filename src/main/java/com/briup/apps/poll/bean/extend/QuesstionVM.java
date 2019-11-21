package com.briup.apps.poll.bean.extend;

import java.util.List;

import com.briup.apps.poll.bean.Option;

/**
 * 拓展问题类
 * @author wangzh
 *
 */
public class QuesstionVM {
	private Long id;
	private String name;
	private String type;
	
	/**
	 * 一对多关系体现  一个问题对应着多个选项
	 */
	private List<Option> options;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	} 
	
	
	
	
}
