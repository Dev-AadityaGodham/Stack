/******************************************************************************
Q2 find the count of vowvels in string count 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int counter = 0;
		StringBuilder str = new StringBuilder("Aaditya");
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'){
		        System.out.println("The alphabate is "+ str.charAt(i));
		        counter++;
		    }
		}
		System.out.println(counter);
	}
}

/* chatgpt
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        StringBuilder str = new StringBuilder("Aaditya");
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                System.out.println("The alphabet is " + str.charAt(i));
                counter++;
            }
        }
        System.out.println("Number of vowels: " + counter);
    }
}

*/
