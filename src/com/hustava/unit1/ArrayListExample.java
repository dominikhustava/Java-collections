package com.hustava.unit1;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        //off record arraylist is like better array, "improved array". A lot of people take it as a default collection and use it for everything

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("name "+ i);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        int j = names.indexOf("name 4");
        System.out.println(j);
    }
}
