package com.example.restAPIExample.dao;

import com.example.restAPIExample.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        //Assume this data is coming from Database
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Nancy");
        employee1.setLastName("Barto");

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("john");
        employee2.setLastName("williams");

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setFirstName("Steve");
        employee3.setLastName("Harris");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        return employeeList;
    }

    public Employee getAllEmployeeById(int empId) {
        List<Employee> employeeList = getAllEmployee();
        for (Employee emp : employeeList) {
            if (emp.getId() == empId) {
                return emp;
            }
        }
        return null;
    }

    public List<Employee> createEmployee(Employee employee) {
        List<Employee> employeeList = getAllEmployee();
        employeeList.add(employee);
        System.out.println(employeeList.toString());
        return employeeList;
    }

    public List<Employee> updateEmployeeId(int empId, Employee employee) {
        List<Employee> employeeList = getAllEmployee();
        for (Employee emp : employeeList) {
            if (emp.getId() == empId) {
                emp.setLastName(employee.getLastName());
                emp.setFirstName(employee.getFirstName());
            }
        }
        System.out.println(employeeList.toString());
        return employeeList;
    }

    public List<Employee> deleteEmployeeById(int empId) {
        List<Employee> employeeList = getAllEmployee();
        for (Employee emp : employeeList) {
            if (emp.getId() == empId) {
                employeeList.remove(emp);
                return employeeList;
            }
        }
        System.out.println(employeeList.toString());
        return employeeList;
    }
}
