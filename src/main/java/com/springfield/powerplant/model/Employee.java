package com.springfield.powerplant.model;

public class Employee {
    private int id;
    private String nombre;
    private Department department;
    private Shift shift;
    private ExperienceLevel experienceLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("se necesita un id positivo");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public String toString() {
        return String.format("Empleado {%d, '%s', %s, %s, %s}",
                id, nombre, department.name()
                , experienceLevel.name(), shift.name());
     } 
    
    }


