package com.example.StreamAPI.MapandFlatMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter@Setter@AllArgsConstructor@ToString
public class Customer {
    private String custName;
    private List<String> phoneNumber;
}
