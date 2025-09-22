package com.example.funcionario.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "setor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Setor {
    private Long id;
    private String nome;
    private String categoria;
}
