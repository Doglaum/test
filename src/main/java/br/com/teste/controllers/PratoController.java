package br.com.teste.controllers;

import br.com.teste.dto.PratoWithIngredientesDTO;
import br.com.teste.models.Prato;
import br.com.teste.services.PratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prato")
public class PratoController {

    @Autowired
    PratoService pratoService;

    @PostMapping("/cadastrar")
    public Prato cadastrar(@RequestBody Prato prato) {
        return pratoService.cadastrar(prato);
    }

    @GetMapping("/list-all")
    public List<PratoWithIngredientesDTO> obtemTodosPratos() {
        return pratoService.obtemTodos();
    }
}
