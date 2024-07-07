package br.com.teste.controllers;

import br.com.teste.models.Ingrediente;
import br.com.teste.services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    IngredienteService ingredienteService;

    @PostMapping("/cadastrar")
    public Ingrediente cadastrar (@RequestBody Ingrediente ingrediente) {
        return ingredienteService.cadastrar(ingrediente);
    }

    @GetMapping("/list-all")
    public List<Ingrediente> obtemIngredientes() {
        return ingredienteService.obtemTodos();
    }

}
