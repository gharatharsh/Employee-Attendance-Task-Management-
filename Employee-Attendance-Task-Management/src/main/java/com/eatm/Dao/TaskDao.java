package com.eatm.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatm.Task;

@Repository
public class TaskDao {
	@Autowired
	EntityManager entityManager;

	@Autowired
	EntityTransaction entityTransaction;

	// save Task

	public void saveTask(Task task) {
		entityTransaction.begin();
		entityManager.persist(task);
		entityTransaction.commit();
	}

	// update Task
	public void updateTask(Task task) {
		entityTransaction.begin();
		entityManager.merge(task);
		entityTransaction.commit();
	}

	// Delete Task
	public void deletetask(int taskId) {

		com.eatm.Task task = entityManager.find(Task.class, taskId);

		if (task != null) {
			entityTransaction.begin();
			entityManager.remove(task);
			entityTransaction.commit();
		}
	}

	// Find Task by ID
	public Task findTaskById(int taskId) {

		return entityManager.find(Task.class, taskId);
	}

	// Find All Task
	public List<Task> findAllTask() {

		return entityManager.createQuery("SELECT task FROM Task task", Task.class).getResultList();
	}

	// update task status
//
//	public Task updateTaskStatus(int taskId, String status) {
//
//		Task task = entityManager.find(Task.class, taskId);
//
//		if (task == null) {
//			return null;
//		}
//		
//		task.setStatus(status);
//		
//		entityTransaction.begin();
//		entityTransaction.commit();
//		return entityManager.merge(task);
//	}

}
