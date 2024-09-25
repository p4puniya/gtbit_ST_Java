package Week5.Stack;
import java.util.*;
public class DSA_Stack {

    static int[] nextGreater(int[] arr){
        int[] NGE= new int[arr.length];
        Stack<Integer> stk= new Stack<>();

        for(int i=arr.length-1 ;i>=0;i--){
            //step 1
            while(!stk.empty() && arr[i]<stk.peek())
                stk.pop();
            //step 2
            if(stk.empty())
                NGE[i]=-1;
            else
                NGE[i]= stk.peek();
            //step 3
            stk.push(arr[i]);                
        }
        return NGE;
    }
    public static void main(String[] args) {
        int[] arr= {4,5,3,2,1,5,6,2};
        int[] nums= nextGreater(arr);
        for(int n:nums)
            System.out.print(n+" ");

        // Stack<Integer> stk= new Stack<>();
        // stk.push(1);
        // stk.push(2);
        // stk.push(10);
        // stk.push(20);
        // stk.push(100);
        // stk.push(200);

        // System.out.println(stk);
        // stk.pop();
        // stk.pop();
        // System.out.println(stk.size()-stk.search(100));

        // Scanner sc = new Scanner(System.in);
        // // while(sc.hasNextInt()){
        // //     stk.push(sc.nextInt());
        // // }
        
    }
    

}
