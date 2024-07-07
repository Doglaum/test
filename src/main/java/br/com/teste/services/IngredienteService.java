package br.com.teste.services;

import br.com.teste.models.Ingrediente;
import br.com.teste.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    IngredienteRepository ingredienteRepository;

    public Ingrediente cadastrar(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    public List<Ingrediente> obtemTodos() {
        return ingredienteRepository.findAll();
    }
}
