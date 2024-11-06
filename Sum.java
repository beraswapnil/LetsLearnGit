public class Sum {
    // Method to calculate the sum of two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to calculate the sum of an array of numbers
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
