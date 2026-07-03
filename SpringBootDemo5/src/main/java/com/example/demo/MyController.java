package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class MyController {

    ArrayList<Employee> emp = new ArrayList<>();

    public MyController() {
        emp.add(new Employee(1, "John", 30, 500000, "Developer"));
        emp.add(new Employee(2, "Jenny", 33, 400000, "Tester"));
        emp.add(new Employee(3, "Joy", 36, 600000, "Programmer"));
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getEmployee() {
        return emp;
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        for (Employee e : emp) {
            if (e.getId() == id) {
                return e;
            }
        }

        return null;   
    }
}