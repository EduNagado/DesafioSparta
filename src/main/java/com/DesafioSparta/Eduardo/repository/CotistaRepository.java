package com.DesafioSparta.Eduardo.repository;

import com.DesafioSparta.Eduardo.model.Cotista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotistaRepository extends JpaRepository<Cotista, Long> {

}
