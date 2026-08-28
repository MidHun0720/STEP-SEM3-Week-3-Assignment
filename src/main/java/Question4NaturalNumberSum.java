public class Question4NaturalNumberSum {

    static void sumOfNaturalNumbers(int n) {
        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Register No: RA2511026011373");

        int n = 5;

        sumOfNaturalNumbers(n);
    }
}