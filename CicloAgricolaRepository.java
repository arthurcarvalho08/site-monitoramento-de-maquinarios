package com.agromono.repository;

import com.agromono.model.CicloAgricola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicloAgricolaRepository extends JpaRepository<CicloAgricola, Long> {
}