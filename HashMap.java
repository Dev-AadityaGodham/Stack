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
		map.put("Alandi",20);
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
		
// 		for(int val : arr){
		    //for each loop 
// 		}
		
		for(Map.Entry<String , Integer> e : map.entrySet()){ //-----this is the set of key value pair 
		    System.out.println(e.getKey() +"-"+ e.getValue());
		}
		
		Set<String> keys = map.keySet();//-----this is also a one way to print the keySet of the map
		for(String key : keys){
		    System.out.println(key + "-" + map.get(key)+ " ");
		}
		//to remove use .remove(key);
		map.remove("Chaina");
		System.out.println(map);
	}
}
/* output
{Alandi=20, Chaina=100, Us=20, India=120}
{Alandi=20, Chaina=100, Us=50, India=120}
Key is present
120
null
Alandi-20
Chaina-100
Us-50
India-120
Alandi-20 
Chaina-100 
Us-50 
India-120 
{Alandi=20, Us=50, India=120}
*/
