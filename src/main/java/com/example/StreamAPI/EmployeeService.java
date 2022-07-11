package com.example.StreamAPI;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> getEmployeeUsingFilter(int input){
        List<Employee> collect=null;
        if (input == 1) {
            collect = new EmployeeDAO().getEmployee().stream().filter(sal -> sal.getSalary() > 5000000L).collect(Collectors.toList());
        }
        if (input == 2)
            collect = new EmployeeDAO().getEmployee().stream().filter(sal -> sal.getSalary() <= 5000000L).collect(Collectors.toList());
        else
            return collect;
        return collect;
    }
    public static void main(String[] args) {
        System.out.println("Search Employee based on below filter /n" +
                "Press 1 for Taxable Employee /n" +
                "Press 2 for Non-Taxable Employee");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(getEmployeeUsingFilter(input));
    }
}
