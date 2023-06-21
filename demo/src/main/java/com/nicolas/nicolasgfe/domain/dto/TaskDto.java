package com.nicolas.nicolasgfe.domain.dto;


import com.nicolas.nicolasgfe.domain.entity.User;
import lombok.Data;


import java.time.LocalDate;

@Data
public class TaskDto {

    private Integer Id;

    private String titulo;
    private String descricao;
    private LocalDate createdAt;
    private String status;
    private User user;

}
