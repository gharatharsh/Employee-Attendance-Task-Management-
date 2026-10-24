package com.eatm.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatm.Attendance;
import com.eatm.Task;
@Repository
public class AttendanceDao {
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	EntityTransaction entityTransaction;
	// save Task

	public void saveAttendance(Attendance attendance) {
		entityTransaction.begin();
		entityManager.persist(attendance);
		entityTransaction.commit();
	}

	// update Task
	public void updateAttendance(Attendance attendance) {
		entityTransaction.begin();
		entityManager.merge(attendance);
		entityTransaction.commit();
	}

	// Delete Task
	public void deleteAttendance(int attendanceId) {

		com.eatm.Attendance attendance = entityManager.find(Attendance.class, attendanceId);

		if (attendance != null) {
			entityTransaction.begin();
			entityManager.remove(attendance);
			entityTransaction.commit();
		}
	}

	// Find Attendance by ID
	public Attendance findAttendance(int attendanceId) {

		return entityManager.find(Attendance.class, attendanceId);
	}

	// Find All Attendance
	public List<Attendance> findAllAttendance() {

		return entityManager.createQuery("SELECT task FROM Task task", Attendance.class).getResultList();
	}
	
	public void saveAttendanceById(Attendance attendance) {
		entityTransaction.begin();
		entityManager.persist(attendance);
		entityTransaction.commit();
	}
	
	public Attendance findAttendanceById(int attendanceId) {
		return entityManager.find(Attendance.class, attendanceId);
	}
}

