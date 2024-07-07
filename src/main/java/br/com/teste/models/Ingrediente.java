package br.com.teste.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ingrediente {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngrediente;
    private String nomeIngrediente;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Prato> pratos;

    public Ingrediente() {

    }

    public Ingrediente(Long idIngrediente, String nomeIngrediente, List<Prato> prato) {
        super();
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.pratos= prato;
    }

    public Long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }
}
