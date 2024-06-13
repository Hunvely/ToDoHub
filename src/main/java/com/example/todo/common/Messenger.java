package com.example.todo.common;

import com.example.todo.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Messenger {

    private String message;
    private int status;
    private Todo data;
}
