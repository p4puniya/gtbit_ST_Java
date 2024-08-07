package Week4.Day3;

public class Cheezy {
    static int sum=0;

    static boolean backtrackSumArray(int[] arr, int i, int k){
        if(i==arr.length) return true;
        if(sum>k) return false;
        //Include current value in ans
        sum+= arr[i];
        //check if this can be included in final answer
        if(!backtrackSumArray(arr, i+1, k)){
            sum-=arr[i];
        }        
        return true;            
    }

    static void sumArray(int[] arr, int i, int k){
        if(i==arr.length) return;
        sum+=arr[i];
        if(sum>k){
            sum-=arr[i];
            return;
        }
        sumArray(arr, i+1, k);
    }
    public static void main(String[] args) {
         int[] arr= {1,2,3,4,5,6,7};
         sumArray(arr,0, 14);
         System.out.println(sum);
    }
}
