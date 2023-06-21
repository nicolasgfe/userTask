package com.nicolas.nicolasgfe.domain.usecase.impl;

import com.nicolas.nicolasgfe.domain.builden.UserBuilder;
import com.nicolas.nicolasgfe.domain.dto.CreateUserDto;
import com.nicolas.nicolasgfe.domain.repository.UserRepository;
import com.nicolas.nicolasgfe.domain.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateBookUseCaseImpl implements CreateUserUseCase {

    private final UserRepository repository;

    private final UserBuilder userBuilder;

    public void execute(CreateUserDto userData){
        var user = userBuilder.build(userData);

        repository.save(user);
    }

}
