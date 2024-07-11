package Day1;

public class Operators {
    public static void main(String[] args){
        //1. Arithematic operators
        int a=2, b=3;
        //+, -, *, /, %, ++, --
        a=a+b; //5
        b=b+a; //8
        a=a-b; // -3
        b=b-a; // 11
        ++a; a++; --b; b--;
        //2. Comparison Operators
        // >, <, !=, ==, <=, >=
        //3. Logical operators: && : and , ||: or, !
        if(!(a>b || a<10));
        //4. Assignment Operators:
        int x=2;
        x+=3; //x= x+3;
        x-=3; //x = x-3;
        x*=3; // x= x*3;
        x/=3; // x= x/3;
        x %=3; // x= x%3;
        // Homework: Bitwise-> &, |, ^, >>, <<, ~
        //Loops: for, while, Do-while
        for(int i=0;i<10;i++){
            //code
        }
        System.out.print(a+" , ");
        // Using a for loop print sum of all numbers 1 -> 25
        // 1,2,3,4,5,6,...25
        // 1,3,6,10, 15, 21...
        int i=5;
        while(i<15){
            //code
            i++;
        }
        //output the first multiple of 2 and 7
    }
    
}
