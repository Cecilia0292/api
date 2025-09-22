package com.example.funcionario.services;

import com.example.funcionario.models.Funcionario;
import com.example.funcionario.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
    this.repository =funcionarioRepository;
    }
    public List<Funcionario> buscarTodos(){
        return repository.findAll();
    }
    public Funcionario criarNovo(Funcionario funcionario){
        return repository.save(funcionario);
    }
}
