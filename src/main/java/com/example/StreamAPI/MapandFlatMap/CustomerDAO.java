package com.example.StreamAPI.MapandFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {

    public List<Customer> getCustomer() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer("madhav", Arrays.asList("9942445540", "998347")));
        customerList.add(new Customer("anand", Arrays.asList("9945540", "99843347")));
        customerList.add(new Customer("baby", Arrays.asList("9944356540", "99834547")));
        return customerList;
    }
}
