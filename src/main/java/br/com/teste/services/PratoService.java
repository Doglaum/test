package br.com.teste.services;

import br.com.teste.dto.PratoWithIngredientesDTO;
import br.com.teste.models.Prato;
import br.com.teste.repositories.IngredienteRepository;
import br.com.teste.repositories.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PratoService {

    @Autowired
    PratoRepository pratoRepository;

    @Autowired
    IngredienteRepository ingredienteRepository;

    public Prato cadastrar(Prato prato) {
        return pratoRepository.save(prato);
    }

    public List<PratoWithIngredientesDTO> obtemTodos() {
        List<Prato> listPratosWithIngredientes = pratoRepository.findAllPratosWithIngredientes();
        return listPratosWithIngredientes.stream().map(prato -> new PratoWithIngredientesDTO(prato)).collect(Collectors.toList());
    }
}
