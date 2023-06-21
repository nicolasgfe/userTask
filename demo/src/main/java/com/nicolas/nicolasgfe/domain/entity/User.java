package com.nicolas.nicolasgfe.domain.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "books")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;


}