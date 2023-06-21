package com.nicolas.nicolasgfe.domain.builden.impl;

import com.nicolas.nicolasgfe.domain.builden.UserBuilder;
import com.nicolas.nicolasgfe.domain.dto.CreateUserDto;
import com.nicolas.nicolasgfe.domain.dto.UserDto;
import com.nicolas.nicolasgfe.domain.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserBuilderImpl implements UserBuilder {


    public User build(CreateUserDto bookData) {
        var user = new User();
        user.setNome(bookData .getNome());
        user.setEmail(bookData.getEmail());
        user.setSenha(bookData.getSenha());

        return user;
    }

    public UserDto build(User user) {
        var dto = new UserDto();
        dto.setId(user.getId());
        dto.setNome(user.getNome());
        dto.setEmail(user.getEmail());
        dto.setSenha(user.getSenha());

        return dto;
    }

    public List<UserDto> build(List<User> user) {
        return user.stream().map(this::build).toList();
    }
}
