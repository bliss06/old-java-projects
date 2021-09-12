package javaworkshop;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/*
Deepak Singh
Created on: 03/07/2021 15:16
This is based on Java Workshop book
*/
public class MySets {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[] {3, 25, 2, 79, 2};
        Integer[] numbers2 = new Integer[] {7, 12, 14, 79};
        Set set1 = new HashSet();
        Collections.addAll(set1, numbers1);
        Set set2 = new HashSet();
        Collections.addAll(set2, numbers2);
        set1.addAll(set2);
        System.out.println("Normal Set");
        System.out.println(set1);
        
        //TreeSet is an ordered collection
        Set set3 = new TreeSet<>();
        Collections.addAll(set3, numbers1);
        Collections.addAll(set3, numbers2);
        System.out.println("Tree Set");
        System.out.println(set3);
        
        //Linked Hashset sorts in the order of addition
        Set set4 = new LinkedHashSet<>();
        Collections.addAll(set4, numbers1);
        Collections.addAll(set4, numbers2);
        System.out.println("LinkedHashSet  Set");
        System.out.println(set4);
    }
}
