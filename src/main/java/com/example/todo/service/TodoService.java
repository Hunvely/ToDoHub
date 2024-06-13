package com.example.todo.service;

import com.example.todo.common.Messenger;
import com.example.todo.mapper.TodoMapper;
import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoMapper todoMapper;

    @Autowired
    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public Messenger save(Todo todo) {

        todoMapper.save(todo);

        return Messenger.builder()
                .message("To-Do Save Success")
                .status(200)
                .data(todo)
                .build();
    }

    public List<Todo> getAllTasks() {

        return todoMapper.findAll();
    }


    public Messenger edit(Todo todo) {

        todoMapper.edit(todo);

        return Messenger.builder()
                .message("To-Do Update Success")
                .status(200)
                .data(todo)
                .build();
    }

    public Messenger deleteById(Long id) {

        todoMapper.deleteById(id);

        return Messenger.builder()
                .message("To-Do Delete Success")
                .status(200)
                .build();
    }
}
