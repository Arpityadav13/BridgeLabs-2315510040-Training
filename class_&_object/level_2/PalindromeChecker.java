package JavaClassObjectPracticeLevel2;


public class PalindromeChecker {
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        String reverseText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reverseText);
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        checker1.displayResult();
        checker2.displayResult();
    }
}
