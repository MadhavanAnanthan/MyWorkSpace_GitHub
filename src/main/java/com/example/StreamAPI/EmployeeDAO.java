package com.example.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"madhav", 1000000L));
        empList.add(new Employee(2,"anand", 5000000L));
        empList.add(new Employee(3,"laksh", 8000000L));
        return empList;
    }
}
