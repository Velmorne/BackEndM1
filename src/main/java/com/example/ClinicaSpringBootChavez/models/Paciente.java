package com.example.ClinicaSpringBootChavez.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Creo la tabla
@Entity
// Le doy nombre
@Table(name = "patient")
public class Paciente {

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
    private String queryType;
    private char gender;
    private String password;

    // Genero al esclavo
    @OneToOne(mappedBy = "pk_patient")
    private HistoriaClinica medicalRecord;

    // Constructor vacio
    public Paciente() {
    }

    // El constructor lleno
    public Paciente(Integer id, LocalDate birthdate, String email, String firstName, String lastName, String region, String city, LocalDateTime entryTime, String queryType, char gender, String password) {
        this.id = id;
        this.birthdate = birthdate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.city = city;
        this.entryTime = entryTime;
        this.queryType = queryType;
        this.gender = gender;
        this.password = password;
    }

    // Getter y Setter
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

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
