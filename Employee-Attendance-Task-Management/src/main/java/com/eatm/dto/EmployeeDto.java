package com.eatm.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeDto {
	private int employeId;
	
    private String employeeName;

    private String email;
    private String password;

    private double salary;

    private String gender;
    private String role;
    


}
