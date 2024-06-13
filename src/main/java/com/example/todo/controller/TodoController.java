package com.example.todo.controller;

import com.example.todo.common.Messenger;
import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService taskService) {
        this.todoService = taskService;
    }

    @PostMapping("/save")
    public ResponseEntity<Messenger> save(@RequestBody Todo todo) {
        log.info("Received request to save task: {}", todo);

        return ResponseEntity.ok(todoService.save(todo));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Todo>> getAllTasks() {

        return ResponseEntity.ok(todoService.getAllTasks());
    }

    @PatchMapping("/edit")
    public ResponseEntity<Messenger> edit(@RequestBody Todo todo) {
        log.info("Received request to edit task: {}", todo);

        return ResponseEntity.ok(todoService.edit(todo));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Messenger> deleteById(@PathVariable Long id) {
        log.info("Received request to delete task with ID: {}", id);

        return ResponseEntity.ok(todoService.deleteById(id));
    }

}
