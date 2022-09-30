package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        Collections.sort(sourceList, comparator);
        System.out.println(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int response = 0;
        int aElement = calculate(a);
        int bElement = calculate(b);

        if(aElement > bElement){
            response = 1;
        }else if(aElement < bElement){
            response = -1;
        }else{
            int aInt = Integer.parseInt(a);
            int bInt = Integer.parseInt(b);
            if(aInt > bInt){
                response = 1;
            }else if(aInt < bInt){
                response = -1;
            }
        }
        return response;
    }

    public int calculate(String s){
        int x = Integer.parseInt(s);
        return (5*(x*x)+3);
    }
}
