package com.example.dinoprojeto.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dinoprojeto.Model.Dinossauro;

@Repository
public class DinossauroRepository {
    private List<Dinossauro> listaDinossauro = new ArrayList<>();
    private Long currentId = 1L;

    //Criar um dinossauro - Create
    public Dinossauro adicionarDinossauro(Dinossauro dinossauro) {
        dinossauro.setId(currentId++);
        listaDinossauro.add(dinossauro);
        return dinossauro;
    }
    //Mostrar todos - Read
    public List<Dinossauro> mostrarTodosDinossauros() {
        return listaDinossauro;
    }

    // Read - Buscar um dinossauro pelo ID
    public Optional<Dinossauro> buscarDinossauroPorId(Long id) {
        return listaDinossauro.stream().filter(d -> d.getId().equals(id)).findFirst();
    }

    // Update - Atualizar um dinossauro
    public Optional<Dinossauro> atualizarDinossauro(Long id, Dinossauro atualizarDinossauro) {
        Optional<Dinossauro> dinossauroOpt = buscarDinossauroPorId(id);
        dinossauroOpt.ifPresent(dinossauro -> {
            dinossauro.setNome(atualizarDinossauro.getNome());
            dinossauro.setEspecie(atualizarDinossauro.getEspecie());
            dinossauro.setAltura(atualizarDinossauro.getAltura());
            dinossauro.setPeso(atualizarDinossauro.getPeso());
            dinossauro.setVelocidade(atualizarDinossauro.getVelocidade());
        });
        return dinossauroOpt;
    }

    // Delete - Remover um dinossauro
    public boolean deletarDinossauro(Long id) {
        return listaDinossauro.removeIf(d -> d.getId().equals(id));
    }
}
