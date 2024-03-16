/******************************************************************************
HashSet may or may not have any orderd way to save the elements for that we use iterator 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //HashSet is same as the Arraylist but it does not contains any duplicates
	    HashSet<Integer> h = new HashSet<>();
	    //.add() to add element
	    h.add(1);
	    h.add(2);
	    h.add(3);
	    h.add(1);//HashSet doesnot allow duplicates
	    //.remove() to remove element
	    h.remove(1);
	    if(!h.contains(1)){
	        System.out.println("set doesnot conatines 1");
	    }
	    System.out.println(h);
	    //.contains() use to chake if there is any element is present or not
	    if(h.contains(1)){
	        System.out.println("contains 1");
	    }
	    if(!h.contains(7)){
	        System.out.println("not contains 7");
	    }
	    //.size() use to find the size of the set
	    //set does not contains any buplictes thats why it does not add it into size
	    System.out.println("The size of the set is "+ h.size());
	    
	    //iterator in set
	    //for iterator you need to import java.util.iterator
	    //iterator has two main functions 1st one is .next() which will return the next value/element 
	    //and 2nd one is .hasNext() which will return the true or false if it have next value the true else false
	    Iterator it = h.iterator();//----this is how you need to introdeuce iterator
	    //first the next will point to the null the it will point to the next element
	   // System.out.println(it.next());
	    
	    //chake it hasNext
	    System.out.println(it.hasNext());//-----it will return true
	    
	    //you can iterator all element by sing looop aslo
	    while(it.hasNext()){
	        System.out.println(it.next());
	        //no need it increment it will atuomatically do that
	    }
	}
}
