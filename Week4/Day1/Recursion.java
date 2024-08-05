package Week4.Day1;

public class Recursion {
    static void print(int n){
        //base case
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    //head recursion
    static int sumHead(int n){
        //base case
        if(n==1) return 1;
        //assumption
        int prevValueSum= sumHead(n-1);
        //proof
        return n+ prevValueSum;
    }
    //tail recursion
    static int sum(int n, int a){
        if(n==1)
            return a+n;
        
        return sum(n-1, a+n);
    }
    static int count(int n){
        if(n==1) return 0;
        if(n%2==0) return 1 + count(n-1);
        else return count(n-1);
    }
    static int countEven(int n, int count){
        if(n==1)
            return count;
        if(n%2==0) count++;
        return countEven(n-1, count);
    }
    static int power(int base, int pow){
        if(pow==0) return 1;
        return base* power(base, pow-1);
    }
    static int fact(int n){
        if(n==0|| n==1)
        return 1;
        return n* fact(n-1);
    }
    
    public static void main(String[] args) {
        // int n=10;
        System.out.println(fact(4));
        // print(n);
        // while(n<=10){
        //     System.out.println(n);
        //     n++;
        // }
        // int sum=sum(n,0);
        // for(int i=n;i>=1;i--)
        //     sum+=i;
        // int count=0;
        // while(n>1){
        //     if(n%2==0) count++;
        //     n--;
        // }
    }
}
