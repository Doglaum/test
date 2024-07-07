package br.com.teste.repositories;

import br.com.teste.models.Prato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PratoRepository extends JpaRepository<Prato, Long> {

    @Query("FROM Prato p " +
            "JOIN FETCH p.ingredientes")
    List<Prato> findAllPratosWithIngredientes();
}
