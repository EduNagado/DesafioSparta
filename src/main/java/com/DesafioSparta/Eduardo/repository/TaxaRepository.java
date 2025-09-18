package com.DesafioSparta.Eduardo.repository;

import com.DesafioSparta.Eduardo.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Taxa, Long> {
}
