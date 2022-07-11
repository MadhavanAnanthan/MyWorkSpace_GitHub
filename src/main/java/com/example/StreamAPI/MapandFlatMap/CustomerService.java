package com.example.StreamAPI.MapandFlatMap;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerService {

    public static void main(String[] args) {
        List<Customer> customer = new CustomerDAO().getCustomer();
        List<String> collect = customer.stream().map(c -> c.getCustName().toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(collect);

        Set<List<String>> collect1 = customer.stream().map(phn -> phn.getPhoneNumber()).collect(Collectors.toSet());
        System.out.println(collect1);

        List<String> collect2 = customer.stream().
                flatMap(pnum -> pnum.getPhoneNumber().stream()).
                collect(Collectors.toList());

        System.out.println(collect2);
    }
}
