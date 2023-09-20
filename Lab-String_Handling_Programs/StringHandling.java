/*Question 1. WAP to take string and display the following result.

Ex: 

String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";

O/P:

"aaa" occurred: 3 times in given string

"ddddd" occurred: 5 times in given string

"gggggg" occurred: 6 times in given string

"jjjjjjj" occurred: 7 times in given string

"kk" occurred: 2 times in given string

"nnnn" occurred: 4 times in given string

{aa=3, bb=2, ccc=1, dddd=3}

Ans: */

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


============================================================================================================================================================================================

/*2. WAP take any String and display number of occurrences of each character which is occurring more than 1 times.

Ex: 

String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";

O/P:

g occurred: 7 Times.

a occurred: 3 Times.

d occurred: 5 Times.

j occurred: 7 Times.

k occurred: 2 Times.

n occurred: 4 Times.


Ans:  */

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

============================================================================================================================================================================================

/*3. WAP take any string and display words in reverse order

Ex:

String string = "Java Concept Of The Day";

O/P:

Day The Of Concept Java

Ans:*/

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

============================================================================================================================================================================================

/*4. WAP to take any string and display length of each reverse words.

Ex:

String str = "India is great country";

O/P

aidnI length = 5

si length = 2

taerg length = 5

yrtnuoc length = 7

Ans:*/


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
============================================================================================================================================================================================

/*5. WAP to take any string and print largest word present in the string.

Ex:

String str = "India is my beautiful country";

O/P:

beautiful

Ans: */

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

============================================================================================================================================================================================
/*6. WAP to an integer array and display number of occurrences of each number.

Ex: 

int[] arr = {7,5,9,8,5,6,7,5,4,8};

O/P:

7=2

5=3

9=1

8=2

6=1

4=1

or

7 occured 2 times

5 occurred 3 times

9 occurred 1 times

8 occurred 2 times

6 occurred 1 times

4 occurred 1 times

Ans:*/


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
============================================================================================================================================================================================
/*7. WAP to take string and display the following result.

Ex: 

String str = "aa bb cc aa bb cc bb aa bb ";

O/P:

"aa" occurred: 3 times in given string

"bb" occurred: 4 times in given string

"cc" occurred: 2 times in given string

Ans:*/

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
============================================================================================================================================================================================
/*8. WAP to take string and make it palindrome.

Ex:  

String str = raj

O/P

---

rajjar

Ans:*/

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
