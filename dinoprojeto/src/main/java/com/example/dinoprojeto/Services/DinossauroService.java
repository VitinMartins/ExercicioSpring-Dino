package com.example.dinoprojeto.Services;
import com.example.dinoprojeto.Model.Dinossauro;
import com.example.dinoprojeto.Repository.DinossauroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinossauroService {
    @Autowired
    private DinossauroRepository dinossauroRepository;

    //Mostrar todos
    public List<Dinossauro> mostrarTodosDinossauros() {
        return dinossauroRepository.mostrarTodosDinossauros();
    }

    //Buscar por id
    public Optional<Dinossauro> buscarDinossauroPorId(Long id) {
        return dinossauroRepository.buscarDinossauroPorId(id);
    }

    //Adicionar
    public Dinossauro adicionarDinossauro(Dinossauro dinossauro) {
        return dinossauroRepository.adicionarDinossauro(dinossauro);
    }

    //Deletar 
    public void deletarDinossauro(Long id) {
        dinossauroRepository.deletarDinossauro(id);
    }

    //Atualizar
    public Optional<Dinossauro> atualizarDinossauro(Long id, Dinossauro dinossauro) {
        dinossauro.setId(id);
        return dinossauroRepository.atualizarDinossauro(id, dinossauro);
    }




}
