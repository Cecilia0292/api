package com.example.funcionario.repositories;

import com.example.funcionario.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario>findByCidade(String cidade);
    List<Funcionario>findBySalarioGreaterThan(Double salario);
    List<Funcionario>findByEmailContaining(String email);
    List<Funcionario>findBySalarioBetween(Double min, Double max);
}
