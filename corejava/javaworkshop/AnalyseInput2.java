package javaworkshop;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
Deepak Singh
Created on: 03/07/2021 15:16
This is based on Java Workshop book
*/
            
public class AnalyseInput2 {
    public static void main(String[] args) {
        Console cons = System.console();

        ArrayList<String> text = new ArrayList<String>();

        String line = "";
        while(!line.equals("*")  && (line = cons.readLine())
        != null){
            text.addAll(Arrays.asList(line.split(" "))); //This splits the line into an array of words, converts it into an arraylist and adds them to a list
            
        }
        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());

        //Now lets extract unique words
        //This can be easily done by adding the list to HashSet. Set will automatically remove duplicates
        Set textSet = new HashSet<>();

        textSet.addAll(text);

        Iterator it = textSet.iterator();

        List<DataPoint> frequencies = new ArrayList<DataPoint>();

        while (it.hasNext()) {
            //Traverse the unique set of words
            String s = (String) it.next();
            int frq = Collections.frequency(text, s);
            System.out.println("Word: " + s + " Appears -> " + frq + " times");

            //Create a datapoint from the data and add to the list
            frequencies.add(new DataPoint(s, frq));
        }
        Collections.sort(frequencies, new SortByValue());
        System.out.println("Sorted word frequencies");

        //Below print the word and its frequency
        for (DataPoint e : frequencies) {
            System.out.println(e.key + " - " + e.value);
        }

        //Same thing is ahieved using Lamda expression
        frequencies.forEach(e -> System.out.println(e.key + " - " + e.value));
    }
}

//Class to store word and its frequency
class DataPoint{
    String key = "";
    Integer value = 0;
    
    //constructor
    public DataPoint(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DataPoint [key=" + key + ", value=" + value + "]";
    }
    

    
}

//Comparator to compare DataPoint based on value (frequency)
class SortByValue implements Comparator<DataPoint>{

    @Override
    public int compare(DataPoint o1, DataPoint o2) {
        // Compare based on Value of Datapoints
        return o1.value - o2.value;
    }
    

}