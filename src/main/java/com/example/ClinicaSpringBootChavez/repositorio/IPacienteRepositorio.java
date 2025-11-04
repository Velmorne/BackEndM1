package com.example.ClinicaSpringBootChavez.repositorio;

import com.example.ClinicaSpringBootChavez.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepositorio extends JpaRepository<Paciente, Integer> {
}
