/******************************************************************************
Queue by using array (using array for the Queue implemention is not a good option becuse for add it will give O(1) but for remove and peek it will give O(n))
*******************************************************************************/
import java.util.*;
public class Main
{
    static class Queue{
        static int arr[];
        static int size;
        static int rare = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        
        //isEmpty function
        public static boolean isEmpty(){
            return rare == -1;
        }
        
        //equeue function
        public static void add(int data){
        if(isEmpty()){
        arr[0] = data; // Correctly add the first element
        } else if(rare == size - 1){
        System.out.println("Queue is full");
        return; // Return early if the queue is full
        }
        rare++;
        arr[rare] = data;
}

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i=0;i<rare ;i++ ){
                arr[i]=arr[i+1];
            } 
            rare--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
	public static void main(String[] args) {
		Queue AQ = new Queue(5);
		AQ.add(1);
		AQ.add(2);
		AQ.add(3);
		AQ.add(4);
		AQ.add(5);
		
		while(!AQ.isEmpty()){
		    System.out.println(AQ.peek());
		    AQ.remove();
		}
	}
}
