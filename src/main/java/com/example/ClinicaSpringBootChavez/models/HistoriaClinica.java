package com.example.ClinicaSpringBootChavez.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "medicalRecord")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate birthdate;
    private String email;
    private String firstName;
    private String lastName;
    private String region;
    private String city;
    private LocalDateTime entryTime;
    private String queryDescription;
    private Boolean Inability;
    private String specialist;

    // Genero al maestro
    @OneToOne
    @JoinColumn(name = "fk_patient")
    private Paciente patient;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer id, LocalDate birthdate, String email, String firstName, String lastName, String region, String city, LocalDateTime entryTime, String queryDescription, Boolean inability, String specialist) {
        this.id = id;
        this.birthdate = birthdate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.city = city;
        this.entryTime = entryTime;
        this.queryDescription = queryDescription;
        Inability = inability;
        this.specialist = specialist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getQueryDescription() {
        return queryDescription;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public Boolean getInability() {
        return Inability;
    }

    public void setInability(Boolean inability) {
        Inability = inability;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
