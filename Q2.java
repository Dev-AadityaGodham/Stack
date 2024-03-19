/******************************************************************************
Q2 intput 12345
    output 1
           2
           3
           4
           5
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int  n = 12345;
		StringBuilder str = new StringBuilder(Integer.toString(n));
		for(int i=0;i<str.length();i++){
		    System.out.println(str.charAt(i));
		}
	}
}
