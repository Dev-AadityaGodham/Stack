import java.util.*;

public class queue {
    private int[] arr;
    private int size;
    private int rare = -1;
    private int front = -1;

    public queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rare == -1 && front == -1;
    }

    public boolean isFull() {
        return (rare + 1) % size == front;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rare = (rare + 1) % size;
        arr[rare] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if (rare == front) {
            rare = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        queue myQueue = new queue(5);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.remove());
        }
    }
}
