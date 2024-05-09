package ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<Integer>(); // creating array.
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        arr.add(6);
        System.out.println(arr);

        arr.add(2, 34);
        System.out.println(arr);

        System.out.println(arr.get(3));

        System.out.println(arr.hashCode());

        ArrayList<Integer> arr1 = new ArrayList<>(); //creating new array.
        arr1.add(2);
        arr1.add(3);

        arr.addAll(arr1);
        System.out.println(arr);// to add two arrays.

        arr.remove(3);
        System.out.println(arr); // to remove value at given index.

        arr.remove(Integer.valueOf(34));
        System.out.println(arr); //to remove particular value from array.

        System.out.println(arr.contains(5)); //true or false

        arr.set(1, 22);
        System.out.println(arr); //to update value at index.

        Iterator<Integer> itr = arr.iterator(); // iterating the values can also use for loop and for each loop.
        while(itr.hasNext()){
            System.out.println("Iterator " + itr.next());
        }

        for (Integer element : arr){
            System.out.println("for each loop " + element);
        }

        arr.clear();
        System.out.println("Array cleared "+arr); //it will clear the array.

    }
}
