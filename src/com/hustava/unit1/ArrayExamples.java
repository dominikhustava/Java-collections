package com.hustava.unit1;

import java.util.Arrays;
import java.util.Date;

public class ArrayExamples {
    //array is the basic "collection" which existed before collection API (Vector, Hashtable also)

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[20];
        numbers[0] = 10;
        System.out.println(numbers[0]);

        //works with object references too - it stores pointers to objects in heap
        Date[] dates = new Date[20];
        dates[10] = new Date();
        System.out.println(dates[10]);

        //problems with arrays:
        //limited data structure - position based access is good but what if u want other type of access
        //doesnt have methods -> "Arrays" class was implemented for ths reason - a lot of overloads for every primitive type - not best oop

        String[] names = new String[20];
        Arrays.fill(names, "name ");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + i;
        }
        int j = Arrays.binarySearch(names, "name 4");
        System.out.println(j);

    }
}
