public class Demo {
    public static void main(String[] args) {
        // Create objects for Sum and Multiply classes
        Sum sumObj = new Sum();
        Multiply multiplyObj = new Multiply();

        // Declare two numbers for demonstration
        int num1 = 5, num2 = 3;

        // Perform addition and multiplication using the respective methods
        int sumResult = sumObj.add(num1, num2);
        int multiplyResult = multiplyObj.multiply(num1, num2);

        // Display the results
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sumResult);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multiplyResult);
    }
}
