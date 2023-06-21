package com.nicolas.nicolasgfe.domain.builden;

import com.nicolas.nicolasgfe.domain.dto.CreateUserDto;
import com.nicolas.nicolasgfe.domain.dto.UserDto;
import com.nicolas.nicolasgfe.domain.entity.User;

import java.util.List;


public interface UserBuilder {
    User build(CreateUserDto dta);
    UserDto build(User user);
    List<UserDto> build(List<User> user);
}
