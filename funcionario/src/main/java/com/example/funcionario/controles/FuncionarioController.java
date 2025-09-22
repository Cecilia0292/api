package com.example.funcionario.controles;

import com.example.funcionario.models.Funcionario;
import com.example.funcionario.repositories.FuncionarioRepository;
import com.example.funcionario.services.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> getAll(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Funcionario>add(@RequestBody Funcionario funcionario){
        service.criarNovo(funcionario);
        return ResponseEntity.ok("Adcionado com sucesso!");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        Optional<Funcionario> funcionario = service.buscarPorId(id);
        if(funcionario.isEmpty()){
            return ResponseEntity.ok("Funcionario não encontrado");
        }
        return ResponseEntity.ok(funcionario.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>delete(@PathVariable Long id){
        return ResponseEntity.ok(service.delete(id));
    }
    @GetMapping("/cidade/{cidade}")
    public ResponseEntity<List<Funcionario>>getAllByCidade(@PathVariable string cidade){
        return ResponseEntity.ok(service.buscarPorCidade(cidade));
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<List<Funcionario>>getAllByEmail(@PathVariable string email){
        return ResponseEntity.ok(service.buscarPorEmail(email));
    }


}
