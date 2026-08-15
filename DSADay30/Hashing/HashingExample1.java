/*
Hashing: Hashing is a technique used to store and retrieve data quickly by converting
a value (called a key) into an index using a hash function

In simpler terms: Hashing is a way of finding data quickly by converting it into a unique location (index)
 */

package DSADay30.Hashing;

import java.util.HashMap;

public class HashingExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> st=new HashMap<>();

        st.put(101,"Alice");
        st.put(102,"Saquib");

        System.out.println(st.get(101));
        System.out.println(st.get(102));

        System.out.println(st.isEmpty());
    }
}
