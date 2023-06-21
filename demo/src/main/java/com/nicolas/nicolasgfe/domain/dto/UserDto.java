package com.nicolas.nicolasgfe.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String nome;
    private String email;
    private String senha;

}
