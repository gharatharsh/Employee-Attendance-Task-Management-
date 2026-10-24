package com.eatm.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttendanceDto {
	
	private int attendenceId;
	private LocalDateTime loginTime; 
	private LocalDateTime logoutTime; 

}
