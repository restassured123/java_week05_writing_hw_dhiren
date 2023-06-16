package calculate.homework_week_9.calculate.writing;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {
        ArrayList<String > fruitList= new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add ("Banana");
        fruitList.add ("Grape");
        fruitList.add ("Mango");
        fruitList.add ("Kiwi");
        fruitList.add ("Orange");
        fruitList.add ("Blackberry");
        fruitList.add ("Strawberry");
        fruitList.add ("Cherry");

        ListIterator<String> iterator = fruitList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() +",");
        }
    }
}
