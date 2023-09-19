//Question 1
//Ans->

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveOccurrences {
    public static Map<String, Integer> countConsecutiveOccurrences(String s) {
        Map<String, Integer> result = new HashMap<>();
        int i = 0;

        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count >= 2) {
                String substring = String.valueOf(currentChar).repeat(count);
                System.out.printf("\"%s\" occurred: %d times in the given string%n", substring, count);
            }

            if (count >= 3) {
                result.put(substring, result.getOrDefault(substring, 0) + 1);
            }

            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        String strInput = "aaabcdddddefgggggghijjjjjjjkklnnnno";
        Map<String, Integer> result = countConsecutiveOccurrences(strInput);
        System.out.println(result);
    }
}

//===========================================================================================

//Question 2
//Ans ->
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
        countCharacterOccurrences(str);
    }

    public static void countCharacterOccurrences(String str) {
        Map<Character, Integer> charOccurrences = new HashMap<>();

        for (char c : str.toCharArray()) {
            charOccurrences.put(c, charOccurrences.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("%c occurred: %d Times.%n", entry.getKey(), entry.getValue());
            }
        }
    }
}

//==================================================================================================
//Question 3
//Ans->
public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        String reversedString = reverseWords(inputString);
        System.out.println(reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}

//=====================================================================================================

//Question 4
// Ans ->
public class ReverseWordLengths {
    public static void main(String[] args) {
        String inputString = "India is great country";
        displayReversedWordLengths(inputString);
    }

    public static void displayReversedWordLengths(String input) {
        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            String reversedWord = reverseWord(words[i]);
            int length = reversedWord.length();
            System.out.printf("%s length = %d%n", reversedWord, length);
        }
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }
}
//========================================================================================
//Question 5
//Ans->
public class LargestWord {
    public static void main(String[] args) {
        String inputString = "India is my beautiful country";
        String largestWord = findLargestWord(inputString);
        System.out.println(largestWord);
    }

    public static String findLargestWord(String input) {
        String[] words = input.split(" ");
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}

//===================================================================================================
//Question 6
//Ans->
import java.util.HashMap;
import java.util.Map;

public class NumberOccurrences {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 8, 5, 6, 7, 5, 4, 8};
        countNumberOccurrences(arr);
    }

    public static void countNumberOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.printf("%d=%d%n", number, count);
        }
    }
}
//============================================================================================================
//Question 7
//Ans ->
import java.util.HashMap;
import java.util.Map;

public class WordOccurrences {
    public static void main(String[] args) {
        String str = "aa bb cc aa bb cc bb aa bb";
        countWordOccurrences(str);
    }

    public static void countWordOccurrences(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> occurrences = new HashMap<>();

        for (String word : words) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.printf("\"%s\" occurred: %d times in the given string%n", word, count);
        }
    }
}
//============================================================================================
//Question 8
//Ans ->
public class MakePalindrome {
    public static void main(String[] args) {
        String str = "raj";
        String palindrome = makePalindrome(str);
        System.out.println(palindrome);
    }

    public static String makePalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 2; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
