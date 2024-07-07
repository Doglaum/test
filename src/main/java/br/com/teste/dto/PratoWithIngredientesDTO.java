package br.com.teste.dto;

import br.com.teste.models.Prato;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PratoWithIngredientesDTO {

    private String nome;
    private BigDecimal valorPrato;
    private List<String> ingredientes;

    public PratoWithIngredientesDTO(Prato prato) {
        this.nome = prato.getNomePrato();
        this.valorPrato = prato.getValorPrato();
        this.ingredientes = prato.getIngredientes().stream().map(ingrediente -> ingrediente.getNomeIngrediente()).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(BigDecimal valorPrato) {
        this.valorPrato = valorPrato;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
