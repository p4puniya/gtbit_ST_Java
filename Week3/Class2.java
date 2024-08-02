package Week3;

public class Class2 {
    public static void display(Students s){
        System.out.println(s.s);
        System.out.println(s.roll);
        System.out.println(s.semester);
        System.out.println(s.year);
        if(s.getBranchCode()<0 || s.getBranchCode()>=4)
            System.out.println("No branch Assigned");
        else
            System.out.println(s.branch.branches[s.getBranchCode()]);        
    }
    public static void main(String[] args) {
        Students s1= new Students();
        Students utkarsh= new Students(
            69,
            "Utkarsh",
            5,
            2,
            3
        );
        utkarsh.setBranchCode(0);
        Students naman= new Students(
            "Naman",
            1,
            1
        );
        // utkarsh.branch_code=0;
        display(naman);
    }
}
