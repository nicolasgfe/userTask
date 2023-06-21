package com.nicolas.nicolasgfe.domain.usecase;

import com.nicolas.nicolasgfe.domain.dto.UserDto;

import java.util.List;

public interface FindAllUserUseCase {
    List<UserDto> execute();
}
