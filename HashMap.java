/******************************************************************************
HashMap is way to store the key value paire data 
like roll no and name
HashMap<TypeOfKey , TypeOfValue> name = new HashMap<>();
also HashMap may or may not be orderd
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		
		//insertion opration -----use .put()
		//we storing the name of contry and population
		map.put("India",120);
		map.put("Chaina",100);
		map.put("Us",20);
		System.out.println(map);
		map.put("Us",50);//-------it will update the value for the last usedKey
		System.out.println(map);
		
		//search 
		//to find there is any key present or not ---------us .containsKey()
		if(map.containsKey("India")){
		    System.out.println("Key is present");
		}
		else{
		     System.out.println("key is not presernt");
		}
		
		//to get the value for the perticular key use .get("key");
		System.out.println(map.get("India"));
		System.out.println(map.get("Pune"));//------as there is not key named pune it will show null
	}
}
