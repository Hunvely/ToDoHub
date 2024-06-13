package com.example.todo.mapper;

import com.example.todo.model.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {

    void save(Todo todo);

    List<Todo> findAll();

    void edit(Todo todo);

    void deleteById(Long id);
}
