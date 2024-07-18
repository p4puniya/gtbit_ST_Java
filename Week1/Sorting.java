package Week1;
import java.util.Arrays;
import java.util.Collections;
public class Sorting {
// Try to return the index
    //binary search
    static int binarySearch(int arr[], int key){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end= mid-1;
            else 
                start=mid+1;                
        }
        return -1;
    }

    //Lower Bound
    static int lowerBound(int arr[], int key){
        int start= 0, end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                ans= mid;
                end= mid-1;
            }
            else if(arr[mid]>key)
                end= mid-1;
            else 
                start= mid+1;
        }
        return ans;
    }

    //upperBound
    static int upperBound(int arr[], int key){
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                //code
                ans=mid+1;
                start=mid+1;
            }else if(arr[mid]>key){
                //code
                end= mid-1;
            }else{
                start= mid+1;
            }
        }
        return ans;
    }

    //insertion sort
    static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    //Selection sort
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx= minimumValue(arr, i);
            int temp=arr[i];
            arr[i]= arr[idx];
            arr[idx]=temp;
        }
    }

    //Find the index of the minimum element from an array: arr
    static int minimumValue(int[] arr, int a){
        int mini= a;
        for(int i=a+1; i<arr.length;i++)
            if(arr[mini]>arr[i])
                mini=i;
        return mini;
    }
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args){
        int[] arr= {1,23,4,4,4,12,2};
        // selectionSort(arr);
        Arrays.sort(arr);
        display(arr);
        System.out.println();
        System.out.println(upperBound(arr, 23));
        //binary search
        // display(arr);
        // int min= Collections.max(Arrays.asList(arr));
        // System.out.println(minimumValue(arr,1));
    }
}
