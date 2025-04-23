package demo;
public class MethodOverloadingExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Calling the overloaded methods
        int sum1 = example.add(5, 10); // Calls the first method
        int sum2 = example.add(5, 10, 15); // Calls the second method
        double sum3 = example.add(5.5, 10.5); // Calls the third method

        // Displaying the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}