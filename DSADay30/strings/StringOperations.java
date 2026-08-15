package strings;

public class StringOperations{
     public static void main(String[] args) {
        // Original string
        String original = "Hello";

        // Create object of Solution class
        StringOperations sol = new StringOperations();

        // Pass string to function and store returned value
        String result = sol.modifyString(original);

        // Print results
        System.out.println("Original: " + original);
        System.out.println("Returned: " + result);
    }

     public String modifyString(String s) {
        // Assign existing string to a new variable
        String newStr = s;
        // Append extra text
        newStr += " World";
        // Return the modified string
        return newStr;
    }
}