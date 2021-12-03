package com.example.demotodo.ds;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

@Entity
@Data
public class TodoItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "title cannot be empty.")
    @NotBlank(message = "Task title is required.")
    private String title;

}
