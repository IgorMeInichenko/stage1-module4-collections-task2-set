package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstSubset = new HashSet<>(firstSet);
        Set<String> secondSubset = new HashSet<>(thirdSet);
        Set<String> resultSubSet = new HashSet<>();
        //
        firstSubset.removeAll(thirdSet);
        firstSubset.retainAll(secondSet);
        //
        secondSubset.removeAll(firstSet);
        secondSubset.removeAll(secondSet);
        //
        resultSubSet.addAll(firstSubset);
        resultSubSet.addAll(secondSubset);

        return resultSubSet;
    }
}
