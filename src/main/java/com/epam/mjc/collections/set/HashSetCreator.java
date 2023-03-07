package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < sourceList.size(); i++) {
            Integer theNum = sourceList.get(i);
            if (theNum % 2 == 0) {
                set.add(theNum);
                while(theNum % 2 == 0){
                    theNum /= 2;
                    set.add(theNum);
                }
            }else {
                set.add(theNum);
                set.add(theNum * 2);
            }
        }

        return set;
    }
}
