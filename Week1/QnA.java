package Week1;
public class QnA {
    //create a function to print:
    //1. all subArrays
    //2. Sum of individual subarrays
    //3. Find the maximum sum from all the subarrays
    static void generateSubArrays(int[] arr){
        //blue pointer
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            //Red Pointer
            for(int j=i;j<arr.length;j++){
                //Printing my array
                int sum=0;
                for(int k=i;k<=j;k++)
                   sum+=arr[k];
                // System.out.println(sum);
                maxSum= Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
    //Rotate by 1 
    static void rotateByOne(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
    }
    //Kadane's Algorithm
    static int KadaneAlgo(int[] arr){
        int maxSum= Integer.MIN_VALUE;
        int currSum= 0;
        for(int i=0;i<arr.length;i++){
            currSum+= arr[i];
            maxSum= Math.max(currSum, maxSum);
            if(currSum<0)
                currSum=0;
        }
        return maxSum;
    }
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotateByOne(arr);
        display(arr);
        // System.out.println(KadaneAlgo(arr));
    }
}
