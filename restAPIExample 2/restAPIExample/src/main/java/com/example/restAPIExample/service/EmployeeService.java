package com.example.restAPIExample.service;

import com.example.restAPIExample.dao.EmployeeDao;
import com.example.restAPIExample.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    public List<Employee> createEmployee(Employee employee) {
        return employeeDao.createEmployee(employee);
    }


    public List<Employee> updateEmployeeId(int empId, Employee employee) {
        return employeeDao.updateEmployeeId(empId, employee);
    }

    public List<Employee> deleteEmployeeById(int empId) {
        return employeeDao.deleteEmployeeById(empId);
    }

    public Employee getAllEmployeeById(int empId) {
        return employeeDao.getAllEmployeeById(empId);
    }
}
