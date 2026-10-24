package com.eatm;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Component
@Scope(value = "prototype")

public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "attendence_gen")
	@SequenceGenerator(name = "attendence_gen",initialValue = 10,allocationSize = 1)
	private int attendenceId;
	@CreationTimestamp
	private LocalDateTime loginTime; // automatically update
	private LocalDateTime logoutTime; // we will set explicitly

}
