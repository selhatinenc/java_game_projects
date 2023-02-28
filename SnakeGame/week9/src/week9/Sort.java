package week9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sort
{
   public static void main(String[] args)
   {
	   //create, initialize and output ArrayList of Integers, then
	   //display total of the elements
	   Integer[] integers = {5, 9, 1, 4, 7};
	   ArrayList<Integer> integerList = new ArrayList<>();


	   //insert elements in integerList
	   for (Integer element : integers) 
	   {
		   integerList.add(element);
	   }

	   System.out.printf("integerList contains: %s%n", integerList);
	   System.out.printf("Reverse order of the elements in integerList: %s%n%n",sort(integerList));

	   //create, initialize and output ArrayList of Doubles, then
	   //display total of the elements
	   Double[] doubles = {3.3, 5.5, 1.1};
       ArrayList<Double> doubleList = new ArrayList<>();

       //insert elements in doubleList
       for (Double element : doubles) {
    	   doubleList.add(element);
       }

       System.out.printf("doubleList contains: %s%n", doubleList);
       System.out.printf("Reverse order of the elements in doubleList: %s%n%n",sort(doubleList));

       //create, initialize and output ArrayList of Numbers containing
       //both Integers and Doubles, then display total of the elements
       Character[] chars = {'C', 'S', 'A', 'M','G'}; // Integers and Doubles
       ArrayList<Character> charList = new ArrayList<>();


       //insert elements in numberList
       for(Character element : chars) {
    	   charList.add(element);
       }

       System.out.printf("charList contains: %s%n", charList);
       System.out.printf("Reverse order of the elements in charList: %s%n",sort(charList));
    } // end main

    // total the elements; using a wildcard in the ArrayList parameter
    public static ArrayList sort(ArrayList list)
    {
        Comparator c = Collections.reverseOrder();
        Collections.sort(list,c);
        return list;
    }
}
