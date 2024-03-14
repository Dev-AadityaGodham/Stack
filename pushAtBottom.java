//push the new element at the bottom of the stack
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
		s.push (i);
	  }
	  pushAtBottom(4,s);
	while (!s.isEmpty ())
	  {
		System.out.println (s.peek ());
		s.pop ();
	  }
  }
}
// output
// 3
// 2
// 1
// 4
