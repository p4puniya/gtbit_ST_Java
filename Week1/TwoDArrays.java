package Week1;

import java.util.Scanner;
import java.util.*;
public class TwoDArrays {
    static void sortbyCol(int arr[][], int col){
        Arrays.sort(arr, (a,b)->Integer.compare(a[col], b[col]));
    }
    static void sortAllRows(int arr[][]){
        for(int i=0;i<arr.length;i++)
            Arrays.sort(arr[i]);
    }
    //
    static int[] search(int[][] arr, int num){
        int[] ans= {-1,-1};
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                if(arr[i][j]==num){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
        return ans;
    }
    // int[] nums= search(arr, 115);
    // System.out.println(nums[0]+" "+nums[1]);
    static void insert(int[][] arr){
        int num=1;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]= num++;
        }
    }
    static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    static int[][] transpose(int[][] arr){
        int[][] nums= new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                nums[j][i]=arr[i][j];
        return nums;
    }
    public static void main(String[] args){
        int[][] arr= {
            {2,4,2,5},
            {4,5,2,4},
            {9,7,1,7}
        };
        // Arrays.sort(arr);
        // sortbyCol(arr, 3);
        sortAllRows(arr);
        sortbyCol(arr, 0);
        display(arr);
        // int[][] arr= new int[5][3];
        // insert(arr);
        // display(arr);
        // System.out.println();
        // System.out.println();
        // int[][] nums= transpose(arr);
        // display(nums);
        // int[] nums= search(arr, 115);
        // System.out.println(nums[0]+" "+nums[1]);
        // System.out.println(arr[0][2]);
    }
}
