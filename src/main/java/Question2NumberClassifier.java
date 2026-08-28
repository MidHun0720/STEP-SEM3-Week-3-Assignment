public class Question2NumberClassifier {

    static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        System.out.println("Register No: RA2511026011373");

        int number = 15;

        classifyNumber(number);
    }
}