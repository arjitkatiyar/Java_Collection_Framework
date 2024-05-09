package ArrayListCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("Arjit");
        a.add("Katiyar");
        a.add("Kanpur");
        a.add("UttarPradesh");
        a.add("India");

//        System.out.println(a);       //this will print all the elements in a single line inside Array.

        Iterator itr = a.iterator();   //Iterator used to print all the elements of ArrayList.ArrayList in a new line.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //OR

//        for (String x:a) {           //ForEach loop used to print all the element s of Arraylist in new line like Iterator.
//            System.out.println(x);
//        }

        ArrayList<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");

        l.addAll(a);
        System.out.println(l);
    }
}