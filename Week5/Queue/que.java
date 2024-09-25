package Week5.Queue;
import java.util.*;
public class que {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        
        // System.out.println(q.remove());
        q.offer(1);
        q.add(10);
        q.add(100);
        q.add(1000);
        System.out.println(q);
        q.remove();
    }
}
