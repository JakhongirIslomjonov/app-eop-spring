package com.example.appeopspringboot.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.appeopspringboot.entity.Todo}
 */
@Value
public class TodoDTO implements Serializable {
    String message;
    Boolean event;
}