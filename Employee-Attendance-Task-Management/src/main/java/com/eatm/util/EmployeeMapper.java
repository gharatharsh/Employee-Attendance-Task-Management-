package com.eatm.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eatm.Employee;
import com.eatm.Address;
import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;

@Component
public class EmployeeMapper {
	
	@Autowired
	ModelMapper modelMapper;
	
	public Employee convertEmployeeDtoToEntity(EmployeeDto employeeDto) {
		return modelMapper.map(employeeDto, Employee.class);
	}
	
	public Address convertAddressDtoToEntity(AddressDto addressDto) {
		return modelMapper.map(addressDto, Address.class);
	}
}
