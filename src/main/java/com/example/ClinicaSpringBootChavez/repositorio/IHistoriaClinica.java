package com.example.ClinicaSpringBootChavez.repositorio;

import com.example.ClinicaSpringBootChavez.models.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriaClinica extends JpaRepository<HistoriaClinica, Integer> {
}
