import java.util.*;
class PatternPrinting{
    public static void main(String[] args) {
        // int n;
        //Taking input
        // Scanner sc = new Scanner(System.in);
        // n= sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        // for(int i=1; i<=n; i++){
        //     //loop for spaces
        //     for(int k=1; k<=(n-i); k++)
        //         System.out.print("  ");
        //     for(int j=1; j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();//endl
        // }
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
                //j1
            for(int j=1;j<=i;j++)
                System.out.print("* ");
                //j2
            for(int j=2;j<=i && j<n-1;j++)
                System.out.print("* ");
            System.out.println();
        }
        // sc.close();
    }
}