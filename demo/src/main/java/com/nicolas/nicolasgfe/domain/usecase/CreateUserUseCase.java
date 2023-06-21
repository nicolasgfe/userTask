package com.nicolas.nicolasgfe.domain.usecase;

import com.nicolas.nicolasgfe.domain.dto.CreateUserDto;

public interface CreateUserUseCase {
    void execute(CreateUserDto bookData);
}
