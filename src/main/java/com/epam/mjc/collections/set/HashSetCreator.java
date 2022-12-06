package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i: sourceList){
            if (i%2==0){
                result.add(i);
                int temp =1;
                while (temp <= i){
                    result.add(temp);
                    temp *= 2;
                }
            }
            else{
                result.add(i);
                result.add(2*i);
            }
        }
        return result;
    }
}
