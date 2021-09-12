package javaworkshop;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

/*
Deepak Singh
Created on: 03/07/2021 15:16
This is based on Java Workshop book
*/
            
public class AnalyseInput {
    public static void main(String[] args) {
        Console cons = System.console();

        ArrayList<String> test = new ArrayList<String>();

        String line = "";
        while(!line.equals("*")  && (line = cons.readLine())
        != null){
            //test.addAll(Arrays.asList(line.split(" "))); This splits the line into an array of words, converts it into an arraylist and adds them to a list
            test.add(line);
        }
        System.out.println(test);
    }
}
