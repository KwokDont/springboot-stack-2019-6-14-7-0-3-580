package com.tw.apistackbase.dao;

import com.tw.apistackbase.model.Employee;

import java.util.*;

public class EmployeeRepository {
    private final static Map<String, Employee> employees = new HashMap<>();

    static {
        addEmployee("fan",22,"male");
        addEmployee("liu",22,"male");
        addEmployee("yong",22,"female");
        addEmployee("young",22,"male");
    }

    public static void addEmployee(String name,int age, String gender){
        String key = UUID.randomUUID().toString();
        Employee employee = new Employee(key, name, age, gender);
        employees.put(key,employee);
    }

    public void save(Employee employee){
        addEmployee(employee.getName(),employee.getAge(),employee.getGender());
    }

    public Employee findById(String employeeId){
        return employees.get(employeeId);
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employees.values());
    }

    public void deleteById(String employeeId) {
        employees.remove(employeeId);
    }
}
