import java.util.ArrayList;
public class Stack {
  //created stackArray class
    static class stackArray{
        //created ArratList<Integer> to add elements and do oprations
        static ArrayList<Integer> list = new ArrayList<Integer>();
      //isEmprty function will chake that the Array list is empty or not
        public static boolean isEmpty(){
            return list.size()==0;
        }
      //push funtion 
        public static void push(int data){
          //add that element (is to do with ArrayList than Linked list)  
          list.add(data);
        }
      //pop funtion
        public static int pop(){
          //if the list is empty the return -1  
          if (isEmpty()) {
                return -1;
            }
          //else do find the top element and remove it from list
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
      //peek function
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
          //return top element
            int top = list.get(list.size()-1);
            return top;
        }

    }
    public static void main(String[] args) {
        stackArray list = new stackArray();
        list.push(1);
        list.push(2);
        list.push(3);
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
    
}
