package javaworkshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Deepak Singh
Created on: 03/07/2021 15:27
This is based on Java workshop book
*/
public class MyIteration {
    public static void main(String[] args) {
        List array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(37);

        Iterator iterator = array.iterator();

        while (iterator.hasNext()) {
            //point to next element
            int i = (Integer) iterator.next();
            //print elements
            System.out.println(i);
        }

    }
}
