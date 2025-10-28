package com.example.ClinicaSpringBootChavez.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Random;

@Entity
@Table(name = "profesionalCard")
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate birthdate;
    private String email;
    private String firstName;
    private String lastName;
    private String specialization;
    private String region;
    private String photo;
    private String hall;
    private String range;
    private Random cardCode;

    @OneToOne
    @JoinColumn(name = "fk_doctor")
    private Medico doctor;

    public TarjetaProfesional() {
    }

    public TarjetaProfesional(Integer id, LocalDate birthdate, String email, String firstName, String lastName, String specialization, String region, String photo, String hall, String range, Random cardCode) {
        this.id = id;
        this.birthdate = birthdate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.region = region;
        this.photo = photo;
        this.hall = hall;
        this.range = range;
        this.cardCode = cardCode;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Random getCardCode() {
        return cardCode;
    }

    public void setCardCode(Random cardCode) {
        this.cardCode = cardCode;
    }
}
