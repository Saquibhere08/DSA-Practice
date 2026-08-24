package CoreJava.Part3.collectionsFramwork.List.arrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        //1.add(object)
        list.add("Saquib");
        list.add("Nazeeb");
        list.add("Faisal");
        list.add("Mithun");
        list.add("Kaushik");
        list.add("Jassi");
        list.add("Suaib");
        list.add("Sadique");
        list.add("Shakeel");
        list.add("Shanan");
        list.add("Dristant");
        list.add("Archit");
        list.add("Shameen");
        list.add("Hillol");
        list.add("Simanta");

        System.out.println(list);
        System.out.println("Size of ArrayList: "+list.size());

        //clear() - it will clear out the entire arraylist
        list.clear();
        System.out.println(list);

        //isEmpty() - checks wheather the arraylist is empty or not
        System.out.println(list.isEmpty()); //returns boolean value - true/false
        

    }
}
