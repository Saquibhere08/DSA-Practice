package strings;

public class LongestSubString {
    public static void main(String[] args) {
        String s="abcccaabcaba";
        int max=0;
        for (int i = 0; i < s.length(); i++) {

            int length = 0;

            for (int j = i; j < s.length(); j++) {

                boolean duplicate = false;

                // Check if s[j] already exists
                for (int k = i; k < j; k++) {

                    if (s.charAt(k) == s.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate)
                    break;

                length++;

                if (length > max)
                    max = length;
            }
        }

        System.out.println(max);
    }
}
    

