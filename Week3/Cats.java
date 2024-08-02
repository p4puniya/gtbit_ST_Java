package Week3;

public class Cats extends Animals{
    String name= "NA";
    String voice= "NA";
    String color= "NA";
    public Cats(){
    }
    public Cats(
        String name,
        String voice,
        String color,
        int leg,
        boolean tail,
        int food
        ){
            this.name= name;
        this.voice= voice;
        this.color= color;
        this.legs= leg;
        this.tail= tail;
        this.food_habit= food;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.voice);
        System.out.println(this.color);
        System.out.println(this.legs);
        System.out.println(this.tail);
        System.out.println(this.f.habit[this.food_habit]);
    }
}
