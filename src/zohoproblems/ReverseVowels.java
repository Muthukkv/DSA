package zohoproblems;

public class ReverseVowels {
	public  static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            // Find the next vowel from the left side
            while (left < right && !isVowel(c[left])) {
                left++;
            }

            // Find the next vowel from the right side
            while (left < right && !isVowel(c[right])) {
                right--;
            }

            // Swap the vowels
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }

        return new String(c);
    }

    

    public static void main(String[] args) {
       

        String input2 = "practice";
        String output2 = reverseVowels(input2);
        System.out.println(output2); // Output: "prectica"
    }
}

