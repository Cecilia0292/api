package com.example.funcionario.controles;

import com.example.funcionario.models.Funcionario;
import com.example.funcionario.models.Setor;
import com.example.funcionario.services.SetorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setor")
public class SetorController {
    private final SetorService service;

    public SetorController(SetorService service){
        this.service =service;
    }

    @GetMapping
    public ResponseEntity<List<Setor>> getAll(){
        return ResponseEntity.ok(service.buscarTodos());
    }






}
