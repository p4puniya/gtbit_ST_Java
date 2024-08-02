package Week3;

public class Students {
    int roll= 0;
    String s= "";
    int semester= 0;
    int year= 0;
    int branch_code= -1;
    Branch branch= new Branch();
    public Students(){}
    public Students(
        int roll,
        String name,
        int sem,
        int branch,
        int year
    ){
        this.roll= roll;
        this.s= name;
        this.semester= sem;
        this.year= year;
        this.branch_code= branch;
    }
    //default constructor
    /*
     * public Students(){}
     */
}
