package com.agromono.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ciclos_agricolas")
public class CicloAgricola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cultura;
    private LocalDate dataPlantio;
    private LocalDate previsaoColheita;

    public CicloAgricola() {
    }

    public CicloAgricola(String cultura, LocalDate dataPlantio, LocalDate previsaoColheita) {
        this.cultura = cultura;
        this.dataPlantio = dataPlantio;
        this.previsaoColheita = previsaoColheita;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public LocalDate getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(LocalDate dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public LocalDate getPrevisaoColheita() {
        return previsaoColheita;
    }

    public void setPrevisaoColheita(LocalDate previsaoColheita) {
        this.previsaoColheita = previsaoColheita;
    }
}