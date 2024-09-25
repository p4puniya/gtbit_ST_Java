import java.util.*;
public class HMaps{
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp= new HashMap<>();

        int[] arr={1,2,3,4,1,2,3,3,3,2};

        mp.put(1, 2);
        mp.put(2, 3);
        mp.put(3, 4);
        mp.put(4, 1);
        System.out.println(mp);
        mp.put(1,1);
        mp.put(4,2);
        mp.put(5,null);
        System.out.println(mp.containsKey(3));
        System.out.println(mp);
        mp.remove(3);
        System.out.println(mp);
        System.out.println(mp.containsKey(3));
        System.out.println(mp.get(3));

        //Iterate over a map
        for(Map.Entry m : mp.entrySet()){
            System.out.println("THe Key is: "+ m.getKey()+ " The Value is: "+ m.getValue());
        }
    }
}