package Week3;

public class OOPs {
     static int num=10;
     
    public OOPs(){
        num++;
    }

    public static class Inner{
        public Inner(){}
        public static class Inner2{
            public Inner2(){}
        }
     }
}
