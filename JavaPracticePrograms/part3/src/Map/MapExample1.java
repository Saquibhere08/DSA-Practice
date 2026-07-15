package Map;

import java.util.HashMap;
/*
 Map:
 *It is an interface
 * It a group of key and value pairs
 *In map, the keys follows some specific characteristics of Set Interface
 *The value doesn't follow any specific characteristics
 *In map interface there is an inner interface called entry interface
 *In map interface, we can store both key and values together
 *If we try to insert duplicate values in map, it will simply update the 
 old data with the new one, but it will never show duplicate values. 
 */

public class MapExample1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Saquib");
		map.put(2,"Faisal");
		map.put(3,"Kaushik");
		map.put(4, "Jassi");
		
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map);
	}
}
