package test;

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        HashMap<String, HashMap<Integer, Integer>> count = new HashMap<>();
        HashMap<Integer, Integer> pot = new HashMap<>();
        pot.put(12,23);
        count.put("Январь",pot);
        System.out.println(count);
    }
 }
