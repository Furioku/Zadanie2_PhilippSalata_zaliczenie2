package com.philippsalata;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DefenicjaZbiora {
    Set<Integer> test1 = new HashSet<Integer> ();
    Scanner scanner = new Scanner(System.in);
    public int number;

    public static void createSet (Set<Integer> test1){
        Set<Integer> newSet = new HashSet<Integer>(test1);
    }

    public static void czescWspolna (Set<Integer> test1, Set<Integer> test2){
        System.out.println (test1.retainAll (test2));
    }

    public static Set<Integer> suma(Set<Integer> test1, Set<Integer> test2) {
        Set<Integer> sumSet = new HashSet<Integer>(test1);
        sumSet.addAll(test2);
        return sumSet;
    }

    public static boolean roznicaBminusA(Set<Integer> test1, Set<Integer> test2) {
        return test2.removeAll(test1);
    }




    }
