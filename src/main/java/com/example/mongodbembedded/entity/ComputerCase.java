package com.example.mongodbembedded.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ComputerCase {
    private String id;
    private String manufacturer;
    private String model;
    private LocalDate date;
    private BigDecimal cost;

    public ComputerCase() {
    }

    public ComputerCase(String id, String manufacturer, String model, LocalDate date, BigDecimal cost) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.date = date;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
