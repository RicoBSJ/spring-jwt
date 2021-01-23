package com.aubrun.eric.spring.jwt.springjwt.sid.web;

import com.aubrun.eric.spring.jwt.springjwt.sid.dao.TaskRepository;
import com.aubrun.eric.spring.jwt.springjwt.sid.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> taskList(){
        return taskRepository.findAll();
    }

    @PostMapping("/tasks")
    public Task save(@RequestBody Task task){
        return taskRepository.save(task);
    }
}
