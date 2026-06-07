package com.springfield.powerplant.model;

public class Employee {
    private float id;
    private String nombre;
    private Department departmento;
    private Shift shift;
    private ExperienceLevel experienceLevel;


    public void setNombre() {
        this.nombre = nombre;
    }

    public Department getDepartmento() {
        return this.departmento;
    }

    public ExperienceLevel getExperienceLevel() {
        return this.experienceLevel;
    }

    public Float getId() {
        return this.id;
    }

    public Shift getShift() {
        return this.shift;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDepartmento(Department departmento) {
        this.departmento = departmento;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public void setId(Float id) {
        if (id == null) {
            throw new IllegalArgumentException("se nececita un id");
        }

        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
