package com.example.ClinicaSpringBootChavez.repositorio;

import com.example.ClinicaSpringBootChavez.models.TarjetaProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITargetaProfesional extends JpaRepository<TarjetaProfesional, Integer> {
}
