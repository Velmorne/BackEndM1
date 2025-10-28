package com.example.ClinicaSpringBootChavez.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate birthdate;
    private String email;
    private String firstName;
    private String lastName;
    private String region;
    private LocalDateTime entryTime;
    private Integer patientsTreated;
    private char gender;
    private String specialization;
    private String password;

    @OneToOne(mappedBy = "doctor")
    private TarjetaProfesional profesionalCard;

    public Medico() {
    }

    public Medico(Integer id, LocalDate birthdate, String email, String firstName, String lastName, String region, LocalDateTime entryTime, Integer patientsTreated, char gender, String specialization, String password) {
        this.id = id;
        this.birthdate = birthdate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.entryTime = entryTime;
        this.patientsTreated = patientsTreated;
        this.gender = gender;
        this.specialization = specialization;
        this.password = password;
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

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getPatientsTreated() {
        return patientsTreated;
    }

    public void setPatientsTreated(Integer patientsTreated) {
        this.patientsTreated = patientsTreated;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
