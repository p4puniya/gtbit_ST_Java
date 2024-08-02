package Week3;

import java.util.ArrayList;
import java.util.Collections;
public class arrayLists {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> arr= new ArrayList<>(2);
        // System.out.println(arr.size());
        //add an element
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        // //access
        // System.out.println(arr.get(0));
        // System.out.println(arr.get(3));
        // //remove
        // System.out.println(arr.remove(1));
        
        // System.out.println(arr.get(0));
        // //Update
        // System.out.println(arr.set(0, 10));
        // System.out.println(arr);
        // System.out.println(arr.get(0));
        // //Sorting
        Collections.sort(arr);
        System.out.println(arr);

    }
}
