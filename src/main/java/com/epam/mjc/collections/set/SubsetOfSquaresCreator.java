package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> resultAtSet = new TreeSet<>();
        for (Integer i: sourceList) {
            resultAtSet.add(i * i);
        }
        return resultAtSet.subSet(lowerBound, true, upperBound, true);
    }
}
