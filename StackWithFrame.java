
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0;i<4;i++){
		    s.push(i);
		}
		while(!s.isEmpty()){
		    System.out.println(s.peek());
		    s.pop();
		}
	}
}
