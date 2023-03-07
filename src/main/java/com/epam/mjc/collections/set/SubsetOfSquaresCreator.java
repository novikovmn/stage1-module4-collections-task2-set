package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(lowerBound);
        treeSet.add(upperBound);

        for (int i = 0; i < sourceList.size(); i++) {
            Integer sqr = (int) Math.pow(sourceList.get(i), 2);
            if (sqr >= lowerBound && sqr <= upperBound) {
                treeSet.add(sqr);
            }
        }

        return treeSet;
    }
}
