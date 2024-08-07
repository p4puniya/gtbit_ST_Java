package Week4.Day1;

public class Subsequence {
    static void genSubseq(String ques, String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        genSubseq(ques.substring(1), ans+ques.charAt(0));
        genSubseq(ques.substring(1), ans);

    }

    static int countSubseq(String ques){
        if(ques.isEmpty()){
            return 1;
        }
        //Num1 is the count when you are including your first character
        int num1= countSubseq(ques.substring(1));
        //Num2 is the count when you are not including your first character
        // int num2= countSubseq(ques.substring(1));
        return num1*2;
    }
    public static void main(String[] args) {
        String s= "TAP";
        System.out.println(countSubseq(s));
    }
}
