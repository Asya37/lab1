public class Palindrome {
    public static void main(String[] args) {
        args=new String []{"java", "Palindrome","madam","racecar", "apple", "kayak", "song", "noon"};
        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            System.out.println(isPalindrome(word));
        }

    }
     public static String reverseString(String str) {
        String s = "";
         for (int i = str.length(); i > 0; i--) {
            s += str.charAt(i - 1);
        }
        return s;
    }

    public static boolean isPalindrome(String s) {
        String s2 = reverseString(s);
        return s2.equals(s);
    }
}