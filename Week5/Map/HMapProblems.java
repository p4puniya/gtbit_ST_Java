import java.util.*;
public class HMapProblems {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,2,8,1,3,2,2,32,3,1,2,2};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i)+1);
            }else{
                mp.put(i,1);
            }
        }
        System.out.println(mp);
    }
}
