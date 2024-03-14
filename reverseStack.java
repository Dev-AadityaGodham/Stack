//reverse the stack
import java.util.*;
public class Main
{
  public static void pushAtBottom (int data,Stack < Integer > s)
  {
      if(s.isEmpty()){
          s.push(data);
          return;
      }
      int top = s.pop();
      pushAtBottom(data,s);
      s.push(top);
      
  }
  public static void main (String[]args)
  {
	Stack < Integer > s = new Stack < Integer > ();
	for (int i = 1; i < 4; i++)
	  {
		pushAtBottom (i,s);
	  }
	  
	while (!s.isEmpty ())
	  {
		System.out.println (s.peek ());
		s.pop ();
	  }
  }
}
// output
// 1
// 2
// 3

