package com.nicolas.nicolasgfe.domain.dto;


import lombok.Data;

@Data
public class CreateUserDto {
    private String nome;
    private String email;
    private String senha;
}