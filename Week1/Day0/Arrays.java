class Arrays{
    // int size=10;
    public static void displayArray(int[] aditya){
        //code for displaying my array.
        for(int i=0;i<aditya.length;i++)
            System.out.print(aditya[i]+" ");
    }

    public static boolean checkPrime(int n){
        for(int i=2; i<n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static int reverseInteger(int n){
        int temp=0;//initialization
        while(n!=0){//condition
            temp= temp*10+ n%10;//code
            n/=10;//change
        }
        return temp;
    }

    public static int countDigits(int n){
        int numberOfDigits=0;
        while(n!=0){
            n/=10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    public static boolean checkArm(int n){
        int temp=n;
        int d= countDigits(n);
        int sum=0;
        while(n!=0){
            sum+=Math.pow((n%10),d);
            n/=10;
        }
        return (sum==temp);
    }
    public static void main(String[] args) {
        // int[] arr= new int[10];
        // arr[1]=10;
        // arr[6]=110;
        // arr[9]=101;

        // displayArray(arr);
        char a='a';
        int n=Integer.MAX_VALUE;//32187
        n+=2;
        n+=Integer.MAX_VALUE;
        // double d= 10;
        // n=(int)d+n;
        System.out.println(n);
    }


}