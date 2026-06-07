package com.springfield.powerplant.service.impl;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;
import com.springfield.powerplant.service.EmployeeManagementService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployee(String nombre, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee();
        employee.setNombre(nombre);
        employee.setDepartmento(department);
        employee.setExperienceLevel(experienceLevel);
        employee.setShift(shift);
        return employee;
    }

    @Override
    public int crewSize(){
       return   employees.size();
    }

    @Override
    public void listCrew(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
