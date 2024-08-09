package Week4.Day5;

public class PlaceNQueen {
    static int[][] board;
    static boolean NQueen(int board[][], int i, int n){
        if(i==n){
            //Display Board
            for(int k=0;k<n;k++){
                for(int j=0;j<n;j++)
                    System.out.print(board[k][j]);
                System.out.println();
            }
            System.out.println();

            return true;
        }

        for(int j=0;j<n;j++){
            if(safe(board, i,j,n)){
                board[i][j]=1;
                if(NQueen(board,i+1,n))
                    return true;
                board[i][j]=0;
            }
        }
        return false;
    }

    static boolean safe(int[][] board, int i,int j, int n){
        //check for all horizontals and verticals
        for(int k=0;k<n;k++)
            if(board[k][j]==1 || board[i][k]==1)
                return false;
        int k=i,l=j;
        while(i>=0 && j<n){
            if(board[i][j]==1)
                return false;
            i--;j++;
        }
        while(k>=0 && l>=0){
            if(board[k][l]==1)
                return false;
            k--;l--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=5;
        board= new int[n][n];
        NQueen(board, 0, n);
    }
}
