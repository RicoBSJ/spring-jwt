package com.aubrun.eric.spring.jwt.springjwt.sid.dao;

import com.aubrun.eric.spring.jwt.springjwt.sid.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
