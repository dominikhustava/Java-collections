package com.hustava.unit1;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    //iterator pattern explain how we should iterate the collection
    //it removes coupling with collection impl from iteration - when we use for loop we have to know how to "get" the element from different collections
    //collection that follows iterator pattern can get us iterator object, and we care just about "next" and "hasNext"
    //All of collection api support iterators

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("name "+ i);
        }

        //names.iterator(); + introduce a variable
        Iterator<String> iterator = names.iterator();
        String element = iterator.next(); //first

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //each iterator maintain its own state, we can have two pointing on diff element
        //Changes on underlying collection cause trouble. It can mix pointers. ConcurrentModificationException
        //for each(for IN) loop it's just syntactical sugar over iterator.
    }



}
