package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        int size=list.size();
        Integer[] array = (Integer[])list.toArray(new Integer[size]);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}