package CoreJava.collections.List.arrayList;
import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        //1.add(object)
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        System.out.println(myList);

        //1.1 add(index,object)
        myList.add(1,99);
        //it will add the element 99 at index 1
        //Note: If we dont mention the index, the arraylist will add element at the ending of the lists
        System.out.println(myList); 

        //get(index)
        System.out.println(myList.get(1));  //99

        //remove(index)
        myList.remove(2);
        System.out.println(myList);

        //set(index,object)
        myList.set(0, 98);
        System.out.println(myList);

        //size()
        System.out.println("Size of ArrayList: "+myList.size());

        //clear() - it will clear out the entire arraylist
        //myList.clear();

        //isEmpty() - checks wheather the arraylist is empty or not
        System.out.println(myList.isEmpty()); //returns boolean value - true/false

        //contains(object)
        System.out.println(myList.contains(2)); //returns boolean value - false

    }    
}
