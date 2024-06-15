package com.example.todo.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString(exclude = {"id"})

public class Todo {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
