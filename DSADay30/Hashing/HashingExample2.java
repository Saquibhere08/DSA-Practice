package DSADay30.Hashing;

import java.util.HashMap;

public class HashingExample2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        hashOperations1(map);
        hashOperations2(map);
        hashOperations3(map);
    }
    //Hashing Operation 1 - insert
    public static void hashOperations1(HashMap map){
        System.out.println("Insert key/value: ");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        System.out.println(map.get(1));
    }
    //Hashing Operation 2  - search
    public static void hashOperations2(HashMap map){
        System.out.println("Search key/Value:");
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("five"));
    }
    //Hashing Operation 3 - delete
    public static void hashOperations3(HashMap map){
        System.out.println("Delete key: ");
        System.out.println(map.remove(4));
        System.out.println("Deleted 4 = "+map.remove("four"));
        System.out.println(map.containsKey(4));
    }
}

/*

Hashing is the process of converting a key into an index for fast data storage and retrieval
Operation	Average Time
Insert	        O(1)
Search	        O(1)
Delete	        O(1)
 */