package com.eatm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String employeeName;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private double salary;

    private String gender;
    private String role;
    
    // has - a
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;
    
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Attendance> attendences;
    
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Task> tasks;



}
