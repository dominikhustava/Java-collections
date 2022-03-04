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

        //Collection-List-ArrayList
        //no special syntax like arrays "{}" pure object oriented programming


        //Tradeoffs
        //  Efficiency - Time, Space - space usually not problem it's proportional to size storing
        //TIme
        // Storage time, retrieval time-item, retrieval time-search
        //bigger collection = longer times
        //we mesuare it by A factor of N -> Big O notation O(N) - how good or bad is dependence on N?
        //Linear Time - jar with tokens(20) - pick "token number X" - time is derectly proportional to size of the jar, it willl take half time for 10 tokens etc.
        //O(N)
        //Constant Time - O(1)
        //Pick any token from the jar (you will pick any token from jar and the time is independent of the size of the jar and number of tokens)
        //doesnt mean that it's fast, it is just independent od N - It's constant
        //Logaritmic Time
        //Scenario - sorted stack of tokens -> go find token 20 -> you will start from half and repeat it - binarySearch.
        //Will it take longer with stack of 100 than 10? yes but not the 10times. O(log N).
        //Quadratic Time
        //Scenario - jar with tokens again - find duplicates, take one and compare with other and move - bigger the jar, the worse it gets. Worse than linear O(N na druhu)

        //how it matters? first we will figure out most occurring operation - insert? search? etc
        //search for an item in a list - O(N) its not sorted its linear, looking up by index - dependent on implementation ArrayList, LinkedList
    }
}
