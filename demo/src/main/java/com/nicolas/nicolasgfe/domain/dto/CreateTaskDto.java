package com.nicolas.nicolasgfe.domain.dto;

import lombok.Data;

@Data
public class CreateTaskDto {
    private String title;
    private String author;

    private Integer edicao;
    private Integer pages;

    private String summary;
}