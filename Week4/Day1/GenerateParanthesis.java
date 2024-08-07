package Week4.Day1;

public class GenerateParanthesis {
    static void generateP(int n, int l, int r, String ans){
        if(n==l && l==r){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l)
            return;
        generateP(n, l+1, r, ans+"{");
        generateP(n, l, r+1, ans+"}");
    }
    public static void main(String[] args) {
        int n=3;
        generateP(n, 0, 0, "");
    }
}













//Ques 22