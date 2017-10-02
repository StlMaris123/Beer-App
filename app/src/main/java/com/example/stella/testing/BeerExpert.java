package com.example.stella.testing;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stella on 10/2/17.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else{
            brands.add("Jail Pale Ale");
        }
        return brands;
    }
}
