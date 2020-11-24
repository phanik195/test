package com.example.employee.service.impl;

import com.example.employee.entity.Employee;
import com.example.employee.repos.EmployeeRepo;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void validateEmployee(Employee employee) {

    }

    @Override
    public Employee persistValidatedEmployee(Employee employee) {
       return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployeesList() {
      return employeeRepo.findAllByOrderByFirstName();
    }
}
