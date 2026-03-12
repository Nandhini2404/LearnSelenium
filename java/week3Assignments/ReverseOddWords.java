package week3Assignments;

public class ReverseOddWords {
    public static void main(String[] args) {

        // Input string
        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check for odd index (1, 3, 5...)
            if (i % 2 != 0) {

                // Convert the word to character array
                char[] chars = words[i].toCharArray();

                // Reverse the characters
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }

            } else {
                // Print even position words as it is
                System.out.print(words[i]);
            }

            // Print space after each word
            System.out.print(" ");
        }
    }
}
