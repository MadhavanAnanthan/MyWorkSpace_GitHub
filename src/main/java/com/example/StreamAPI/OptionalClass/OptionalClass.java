package com.example.StreamAPI.OptionalClass;

import java.util.Optional;

public class OptionalClass {


    private  int id ;
    private String name;

    public OptionalClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        OptionalClass optionalClass = new OptionalClass(1,"ABD");
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        /*Optional<String> idempty = Optional.of(optionalClass.name);
        System.out.println(idempty);*/

      Optional<String> optionalClass1 = Optional.ofNullable(optionalClass.name);
        System.out.println(optionalClass1);


    }
}
