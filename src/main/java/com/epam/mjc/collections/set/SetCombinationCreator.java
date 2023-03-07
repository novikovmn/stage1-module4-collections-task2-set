package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        // each set to list
        List<String> fList = new ArrayList<>(firstSet);
        List<String> sList = new ArrayList<>(secondSet);
        List<String> tList = new ArrayList<>(thirdSet);
        // first and second lists to one big list
        List<String> firstAndSecondElemsList = new ArrayList<>();
        firstAndSecondElemsList.addAll(fList);
        firstAndSecondElemsList.addAll(sList);

        // elems that common for first and second set AND no present in third set
        List<String> firstAndSecondCommonElems = new ArrayList<>();
        // common elems for first and second
        for (int i = 0; i < fList.size(); i++) {
            int frequency = Collections.frequency(secondSet, fList.get(i));
            if(frequency > 0){
                firstAndSecondCommonElems.add(fList.get(i));
            }
        }
        // remove elems that presented in third
        for (int i = 0; i < firstAndSecondCommonElems.size(); i++) {
            int frequency = Collections.frequency(thirdSet, firstAndSecondCommonElems.get(i));
            if(frequency > 0){
                firstAndSecondCommonElems.remove(firstAndSecondCommonElems.get(i));
            }
        }

        // get elems that presented only in third set
        List<String> elemsFromThirdUnique = new ArrayList<>();
        for (int i = 0; i < tList.size(); i++) {
            int frequency = Collections.frequency(firstAndSecondElemsList, tList.get(i));
            if (frequency == 0){
                elemsFromThirdUnique.add(tList.get(i));
            }
        }

        Set<String> result = new HashSet<>();
        result.addAll(firstAndSecondCommonElems);
        result.addAll(elemsFromThirdUnique);


        return result;
    }
}
