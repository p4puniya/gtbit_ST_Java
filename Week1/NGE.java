package Week1;

public class NGE {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
//Next Greates Element to the Left, Current not Included
    static void NGLNI(int[] nums, int[] arr){
        int maxR= 0;
        for(int i=0;i<nums.length;i++){
            arr[i]=maxR;//store
            maxR= Math.max(maxR, nums[i]);//update
        }
    }
// Next Smallest Element to the Right
    static void NSRNI(int[] nums, int[] arr){
        int minR= 100;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=minR;//store
            minR= Math.min(minR, nums[i]);//update
        }
    }
    //Next Greatest Element to the Right, Current Not Included
    static void NGRNI(int[] nums, int[] arr){
        int maxR= 0;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=maxR;//store
            maxR= Math.max(maxR, nums[i]);//update
        }
    }
    //Next Greatest Element to the right, Current Included
    static void NGRCI(int[] nums, int[] arr){
        int maxR= 0;
        for(int i=nums.length-1;i>=0;i--){
            maxR= Math.max(maxR, nums[i]);//update
            arr[i]=maxR;//store
        }
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,8,7,3,4};//0, 2, 3, 3, 8, 8, 8
        int[] arr= new int[nums.length];
        NSRNI(nums, arr);
        display(arr);
    }
}
