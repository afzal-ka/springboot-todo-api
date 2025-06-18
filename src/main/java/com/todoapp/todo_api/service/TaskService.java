package com.todoapp.todo_api.service;

import com.todoapp.todo_api.model.Task;
import com.todoapp.todo_api.repository.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Long id,Task taskDetails){
        Task task = taskRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Task not found"));
        task.setTittle(taskDetails.getTittle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        if(!taskRepository.existsById(id)){
            throw new EntityNotFoundException("Task not found");
        }
        taskRepository.deleteById(id);
    }
}
