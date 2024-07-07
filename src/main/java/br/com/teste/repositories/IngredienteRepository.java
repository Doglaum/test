package br.com.teste.repositories;

import br.com.teste.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {

    @Query("SELECT i.idIngrediente FROM Ingrediente i")
    List<Long> obtemListIdsIngrediente();

}
