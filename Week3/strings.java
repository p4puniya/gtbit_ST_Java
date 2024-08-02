package Week3;
public class strings {
    //Create a string s= "your_name", 
    public static String changeName(String name){
        String ans="";
        for(int i=0;i<name.length();i++){
            ans+=(char) (name.charAt(i)+1);
        }
        return ans;
    }
    //return the reverse of a string
    public static String reverse(String s){
        String ans="";
        for(int i=s.length()-1; i>=0;i--)
            ans+=s.charAt(i);
        return ans;
    }
    //Pallindrome: MADAM, NAMAN, MOM, WOW, NOON, RADAR, etc
    //Ques: Input:"Today is ThursDay" Output:"Thursday is Today".
    public static String reverseString(String s){
        s=s.trim();
        String[] s_arr= s.split(" "); //this is a table
        String ans="";
        for(int i=s_arr.length-1;i>=0;i--){
            ans+=s_arr[i]+" ";
        }
        return ans.trim();
        // System.out.println(s_arr[3]);
        // return "";
    }
    public static boolean pallindrome(String s){
        return (s.equals(reverse(s)));
    }
    //aaaqqqquuuuuiiqqquu
    //aarav
    public static int count(String s){
        int ans=0;
        char curr=s.charAt(0);
        int len= 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==curr){
                len++;
            }else{
                curr=s.charAt(i);
                ans= Math.max(ans, len);
                len=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1="    this is a table    ";
        String s2="Parabolla";
        String s3="aaaqqqquuuuuiiqqquu";
        System.out.println(count(s2));
        // System.out.print();
        // System.out.println("*"+reverseString(s1)+"*");
        // String s1="hi";
        // String s2= new String("HI");
        // // System.out.println(s1.equalsIgnoreCase(s2));
        // String s3= "hi";   
        // s3+="e" ;
        // s1+="e" ;
        // String s4= s2;
        // String s5= s4;
        // System.out.println(pallindrome("madam"));
        // // String s4= 
        // char[] s4= {'h','i'};
        // // char[] s5= {'h','i'};
        // System.out.print(s4[1]==s1.charAt(1));
    }
}
