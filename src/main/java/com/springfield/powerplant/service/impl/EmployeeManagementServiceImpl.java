package com.springfield.powerplant.service.impl;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;
import com.springfield.powerplant.service.EmployeeManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployee(String nombre, int id, Department department, ExperienceLevel experienceLevel, Shift shift) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setNombre(nombre);
        employee.setDepartment(department);
        employee.setExperienceLevel(experienceLevel);
        employee.setShift(shift);
        employees.add(employee);
        return employee;
    }

    @Override
    public int crewSize(){
       return   employees.size();
    }

    @Override
    public void listCrew(){
        for (Employee employee : employees) {
            System.out.println(employee.getNombre() + ", " + employee.getDepartment() + ", " + employee.getExperienceLevel() + ", " + employee.getShift()); }
        }
    
    @Override
    public List<Employee> findEmployeesByDepartment(Department department) {
        List<Employee> EmployeesInDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                EmployeesInDepartment.add(employee);
            }
        }
        return EmployeesInDepartment;

    }

    @Override
    public void changeEmployeeExperienceLevel(Employee empleado, ExperienceLevel newLevel) {
        empleado.setExperienceLevel(newLevel);
}


    @Override
    public Map<String, Long> getExperienceLevelStatistics() {
        Map<String, Long> resultado = employees.stream().collect(Collectors.groupingBy(e -> e.getExperienceLevel().name(), Collectors.counting()));
        return resultado;
    }

   // @Override
    //public  boolean isDepartmentFullyCovered(Department departamento){
    //    boolean iscovered = false;



      //  return true;
    //}
    }


