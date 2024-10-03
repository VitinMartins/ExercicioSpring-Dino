package com.example.dinoprojeto.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dinoprojeto.Model.Dinossauro;
import com.example.dinoprojeto.Services.DinossauroService;

@RestController
@RequestMapping("/api/dinossauros")
public class DinossauroController {

    @Autowired
    private DinossauroService DinossauroService;

    @GetMapping
    public List<Dinossauro> mostrarTodosDinossauros() {
        return DinossauroService.mostrarTodosDinossauros();
    } 
    
    @PostMapping
    public Dinossauro adicionarDinossauro(@RequestBody Dinossauro dinossauro) {
        return DinossauroService.adicionarDinossauro(dinossauro);
    }

    @GetMapping("/{id}")
    public Optional<Dinossauro> buscarDinossauroPorId(@PathVariable Long id) {
        return DinossauroService.buscarDinossauroPorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletarDinossauro(@PathVariable Long id) {
        DinossauroService.deletarDinossauro(id);
        return "Dinossauro com a id: " + id + " foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Optional<Dinossauro> atualizarDinossauro(@RequestBody Dinossauro dinossauro, @PathVariable Long id) {
        return DinossauroService.atualizarDinossauro(id, dinossauro);
    }
}
