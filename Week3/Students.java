package Week3;

public class Students {
    int roll= 0;
    String s= "";
    int semester= 0;
    int year= 0;
    private int branch_code= -1;
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
    public Students(
        String name,
        int year,
        int sem
    ){
        this.s=name;
        this.semester= sem;
        this.year= year;
    }
    

    //getters and setter
    int getBranchCode(){
        return this.branch_code;
    }
    void setBranchCode(int code){
        this.branch_code=code;
    }
    //default constructor
    /*
     * public Students(){}
     */
}
