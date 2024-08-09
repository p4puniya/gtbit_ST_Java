package Week4.Day5;
import java.util.*;
public class quesSudokuSolver {
    static boolean canPlace(int[][] mat, int i, int j, int n, int number){
        //for checking rows and cols
        for(int x=0;x<n;x++)
            if(mat[x][j]==number|| mat[i][x]==number)
                return false;
        //For Checking Subblock
        int rn= (int)Math.sqrt(n);
        int sx= (i/rn)*rn;
        int sy= (j/rn)*rn;
        //check inside a subblock
        for(int x=sx;x<sx+rn;x++)
            for(int y=sy;y<sy+rn;y++)
                if(mat[x][y]==number)
                    return false;
        //No issues with this number :)
        return true;
    }

    static boolean sudokuSolver(int[][] mat, int i, int j, int n){
        if(i==n)    //ans found
            return true;
        if(j==n)    //end of row
            return sudokuSolver(mat,i+1,0,n);
        if(mat[i][j]!=0)    //cell prefilled
            return sudokuSolver(mat, i, j+1, n);
        for(int number=1;number<=n;number++)
            if(canPlace(mat, i, j, n, number)){
                mat[i][j]=number;
                if(sudokuSolver(mat, i, j+1, n))
                    return true;
            }
        //backtrack
        mat[i][j]=0;
        return false;
    }
    public static void main(String[] args) {
        int n=9;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[][] mat= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        
        sudokuSolver(mat,0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
/*
 * 9
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9 
 */