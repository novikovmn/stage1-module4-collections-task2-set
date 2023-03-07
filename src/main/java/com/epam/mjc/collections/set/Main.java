package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers1 = List.of(2, -1, 3, 8, -5, 12);
        HashSetCreator hashSetCreator = new HashSetCreator();
        HashSet<Integer> set = hashSetCreator.createHashSet(numbers1);
        System.out.println(set);

        List<Integer> numbers2 =List.of(2, -1, 5, -7, 4, 6, -9, 8);
        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
        Set<Integer> treeSet = subsetOfSquaresCreator.createSubsetOfSquares(numbers2, 25, 49);
        System.out.println(treeSet);

        Set<String> first = Set.of("Java", "Collection", "framework", "interface", "class", "Queue");
        Set<String> second = Set.of("Queue", "iterator", "Java", "Collection","comparator");
        Set<String> third = Set.of("Java", "Set", "Map", "List");
        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        Set<String> setCombination = setCombinationCreator.createSetCombination(first, second, third);
        System.out.println(setCombination);


    }
}
