package com.tw.apistackbase.controller;

import com.tw.apistackbase.dao.EmployeeRepository;
import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        EmployeeRepository repository = new EmployeeRepository();
        return repository.getAllEmployees();
    }

    @PostMapping("/employees")
    public void saveEmployee(@RequestBody Employee employee){
        EmployeeRepository repository = new EmployeeRepository();
        repository.save(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findEmployeeById(@PathVariable String employeeId){
        EmployeeRepository repository = new EmployeeRepository();
        return repository.findById(employeeId);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployeeById(@PathVariable String employeeId){
        EmployeeRepository repository = new EmployeeRepository();
        repository.deleteById(employeeId);
    }

    @GetMapping("/employees/leastAge/{leastAge}")
    public List<Employee> findAgeMoreThan(@PathVariable int leastAge) {
        EmployeeRepository repository = new EmployeeRepository();
        return repository.findAgeMoreThan(leastAge);
    }
}
