package com.springfield.powerplant.service;

import com.springfield.powerplant.model.Department;
import com.springfield.powerplant.model.Employee;
import com.springfield.powerplant.model.ExperienceLevel;
import com.springfield.powerplant.model.Shift;

public interface EmployeeManagementService {
    Employee createEmployee(String homerSimpson, int id, Department department, ExperienceLevel experienceLevel, Shift shift);

   int crewSize();


}
