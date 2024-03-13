public class Main {
    //first we created node class
    static class Node{
        //having two properties
        int data;
        Node next;
        //constructor of Node class
        public Node(int data){
            this.data = data;
            this.next = null;	
        }
    }
    //new stack class
    static class Stack{
        //decleration of head Node
        public static Node head;
        //isEmpty function to chake that the stack is empty or not
        public static boolean isEmpty(){
            return head==null;
        }
        //push funtion 
        public static void push(int data){
            //creating newNode
            Node newNode = new Node(data);
            //if isEmpty is true make newNode as head and return 
            if(isEmpty()){
                head = newNode;
                return;
            }
            //else make newNode a head
            newNode.next = head;
            head = newNode;
        }
        //pop function 
        public static int pop(){
            //same if isEmpty is true then return -1 means there is no node and it will be negative if u pop
            if(isEmpty()){
                return -1;
            }
            //make new int top and assign the value if head.data to the top 
            int top = head.data;
            //make head.next as head
            head = head.next;
            return top;
        }
        //peek function
        public static int peek(){
            //same if isEmpty is true then return -1 means there is no node and it will be
            if(isEmpty()){
                return -1;
            }
            //make new int top and assign the value if head.data to the top and return the top
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //while loop to print elements
        //while s.isEmpty not get equle to null do this
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
