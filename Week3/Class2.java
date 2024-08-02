package Week3;

public class Class2 {
    public static void display(Students s){
        System.out.println(s.s);
        System.out.println(s.roll);
        System.out.println(s.semester);
        System.out.println(s.year);
        if(s.branch_code<0 && s.branch_code<4)
            System.out.println("No branch Assigned");
        else
            System.out.println(s.branch.branches[s.branch_code]);        
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
        display(utkarsh);
    }
}
