package org.ks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2016/12/17.
 */
public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            list.add(i);

        System.out.println(list);

        list.remove(5);

        System.out.println(list);

    }
}
