package com.example.restAPIExample.controller;

import com.example.restAPIExample.model.Employee;
import com.example.restAPIExample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Value("${sourceId}")
    private String configSourceId;

    @Value("${token}")
    private String configToken;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{empId}")
    public String getAllEmployeeById(@PathVariable int empId) {
        Employee employee = employeeService.getAllEmployeeById(empId);
        if (null == employee) {
            return "Emp id : " + empId + " doesn't exists!!!";
        }
        return employee.toString();
    }

    // request header is one type of security to your API.
    @PostMapping("/employee")
    public List<Employee> createEmployee(@RequestHeader String sourceId, @RequestHeader String token, @RequestBody Employee employee) {
        if (!sourceId.equals(configSourceId) && !token.equals(configToken)) {
            return new ArrayList<>();
        }
        return employeeService.createEmployee(employee);
    }

    //PathVariable will work on your selected resource. ; update your particular id.
    @PatchMapping("/employee/{empId}")
    public List<Employee> updateEmployeeId(@PathVariable int empId, @RequestBody Employee employee) {
        return employeeService.updateEmployeeId(empId, employee);
    }

    @DeleteMapping("/employee/{empId}")
    public List<Employee> deleteEmployeeById(@PathVariable int empId) {
        return employeeService.deleteEmployeeById(empId);
    }
}
