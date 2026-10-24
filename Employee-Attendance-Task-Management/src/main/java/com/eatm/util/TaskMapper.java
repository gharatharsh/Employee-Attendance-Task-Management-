package com.eatm.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eatm.Task;
import com.eatm.Dao.TaskDao;
import com.eatm.dto.TaskDto;


@Component
public class TaskMapper {

	@Autowired
	ModelMapper modelMapper;
	
	public Task convertTaskDtoToEntity(TaskDto taskDto) {
		return modelMapper.map(taskDto, Task.class);
	}
}
