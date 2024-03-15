package ems.example.ems.controllers;

import ems.example.ems.models.Tasks;
import ems.example.ems.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @PostMapping("/tasks")
    public String tasks(@RequestBody Tasks tasks){
        taskRepository.save(tasks);
        return "task assigned successfull";
    }
}
