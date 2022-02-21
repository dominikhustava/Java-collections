package com.hustava.unit1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayExamples {
    //array is the basic "collection" which existed before collection API (Vector, Hashtable also)


    static String line = "------------------------------------------------------";
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
        //doesnt have methods -> "Arrays" class was implemented for ths reason - a lot of overloads for every primitive type - not best oop principle

        String[] names = new String[20];
        Arrays.fill(names, "name ");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + i;
        }
        int j = Arrays.binarySearch(names, "name 4");
        System.out.println(j);
        System.out.println(line);

        List<Integer> integers = Arrays.asList(23, 4, 67, 88, 1000, 12345);
        integers.forEach(System.out::println);
        System.out.println(line);

        int[] arr = {98,54,77,1,2,45,77,44,1,15};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(line);

        //must be on sorted array and is not guaranteed which occurrence of multiple occurrences will be found
        int index = Arrays.binarySearch(arr, 45);
        System.out.println(index);
        System.out.println(line);

        //IntStream is just stream containing primitive ints
        IntStream stream = Arrays.stream(arr);
        stream.map(i -> i * 2)
                .forEach(System.out::println);
        System.out.println(line);

        System.out.println(Arrays.toString(Arrays.copyOf(arr, 3)));



    }
}
