import java.util.*;
public class mainQueue {
    public static void main(String args[]){
        // Queue<Integer> q = new LinkedList<Integer>();
        //you can implement the queue by using Linklist and ArrayDeque
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove(3));
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }    
}
