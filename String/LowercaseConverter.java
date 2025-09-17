package Level_1_Strings_Practice_Problems;

import java.util.Scanner;

public class LowercaseConverter {
    static String toLowerManual(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert to lowercase: ");
        String text = sc.nextLine();
        String builtIn = text.toLowerCase();
        String manual = toLowerManual(text);
        boolean isEqual = compareStrings(builtIn, manual);
        System.out.println("Built-in Lower: " + builtIn);
        System.out.println("Manual Lower: " + manual);
        System.out.println("Lowercase Match: " + isEqual);
    }
}

