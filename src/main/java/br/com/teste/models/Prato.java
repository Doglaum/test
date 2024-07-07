package br.com.teste.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Prato {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrato;
    private String nomePrato;
    private BigDecimal valorPrato;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "prato_ingrediente",
            joinColumns = @JoinColumn(name = "prato_id"),
            inverseJoinColumns = @JoinColumn(name = "ingrediente_id")
    )
    private List<Ingrediente> ingredientes;

    public Prato() {
    }

    public Prato(Long idPrato, String nomePrato, BigDecimal valorPrato, List<Ingrediente> ingrediente) {
        super();
        this.idPrato = idPrato;
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
        this.ingredientes = ingrediente;
    }

    public Long getIdPrato() {
        return idPrato;
    }

    public void setIdPrato(Long idPrato) {
        this.idPrato = idPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public BigDecimal getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(BigDecimal valorPrato) {
        this.valorPrato = valorPrato;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }


}

