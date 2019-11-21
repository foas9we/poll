package com.briup.apps.poll.mapper.extend;

import java.util.List;

import com.briup.apps.poll.bean.Option;

public interface OptionVMMapper {
	List<Option> selectByQuestionId(long id);
}
