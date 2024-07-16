package Week1;
public class Arrays2 {
    //Arr function to find the sum of the complete array
    //To search an element in our array
    //a,b Swap
    //Create a function to reverse an Array
    public static int find(int[] arr,int b) {
        for(int i=0; i<arr.length; i++){
            if (arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    public static int findMax(int[] arr) {
        int b=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>b){
                b=arr[i];
            }
        }
        return b;
    }
    public static int sum( int arr[]) {
    int sum=0;
    for(int i=0; i<arr.length; i++){
        sum+=arr[i];
    }
        return sum;
    }
//Find the maximum in an Array
    static void reverseArray(int[] arr, int i, int j){
        while(i<j)
            change(arr, i++, j--);
    }
// 1 4 8 7 2 5 5 8 10 3
    public static void bubbleSort( int[] arr){
        for(int turn= 1;turn<arr.length;turn++){
            for( int i=0; i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
    }
    static void change(int[] adi, int i, int j){
        int temp=adi[i];
        adi[i]=adi[j];
        adi[j]=temp;
    }
    //Swap function
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++) //for each
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        //code
        int a=10,b=15;
        int[] arr= {1 ,4, 8 ,7 ,2 ,5, 5, 8 ,10, 3};
        // reverseArray(arr, 2, 6);
        bubbleSort(arr);
        
        print(arr);
        // print(arr);
        // reverseArray(arr);
        // // change(arr);
        // print(arr);
        // swap(a, b);//call by value , reference
        // System.out.print(a+" "+b);
    //     int b=9;
    //     int arr[]= new int[10];
    //     Scanner sc= new Scanner (System.in);
    //    for(int i=0; i<arr.length; i++){
    //    arr[i]=sc.nextInt(); 
    //    }
        //System.out.println(sum(arr));
        
    }
}
