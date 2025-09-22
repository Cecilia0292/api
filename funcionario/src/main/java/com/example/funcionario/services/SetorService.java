package com.example.funcionario.services;

import com.example.funcionario.models.Funcionario;
import com.example.funcionario.models.Setor;
import com.example.funcionario.repositories.FuncionarioRepository;
import com.example.funcionario.repositories.SetorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {
    private final SetorRepository repository;

    public SetorService(SetorRepository setorRepository){
        this.repository =setorRepository;
    }
    public List<Setor> buscarTodos(){
        return repository.findAll();
    }
    public Setor criarNovo(Setor setor){
        return repository.save(setor);
    }
}
