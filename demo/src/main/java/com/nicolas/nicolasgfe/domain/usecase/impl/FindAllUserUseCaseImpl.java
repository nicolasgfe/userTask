package com.nicolas.nicolasgfe.domain.usecase.impl;

import com.nicolas.nicolasgfe.domain.builden.UserBuilder;
import com.nicolas.nicolasgfe.domain.dto.UserDto;
import com.nicolas.nicolasgfe.domain.repository.UserRepository;
import com.nicolas.nicolasgfe.domain.usecase.FindAllUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FindAllUserUseCaseImpl implements FindAllUserUseCase {

    private final UserRepository repository;

    private final UserBuilder userBuilder;

    public List<UserDto> execute(){
        var result = repository.findAll();
        return userBuilder.build(result);
    }
}
