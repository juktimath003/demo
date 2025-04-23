package demo;
public class EvenOddChecker {
    public static void main(String[] args) {
        // Hardcoded number
        int number = 10; // You can change this number to test with different values

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}