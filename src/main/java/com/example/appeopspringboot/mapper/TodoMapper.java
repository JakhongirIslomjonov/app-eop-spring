package com.example.appeopspringboot.mapper;

import com.example.appeopspringboot.dto.TodoDTO;
import com.example.appeopspringboot.entity.Todo;
import org.mapstruct.*;

@Mapper( componentModel = MappingConstants.ComponentModel.SPRING)
public interface TodoMapper {
    Todo toEntity(TodoDTO todoDTO);

    TodoDTO toDto(Todo todo);


}