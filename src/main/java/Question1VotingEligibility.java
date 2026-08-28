public class Question1VotingEligibility {

    static void checkVotingEligibility(int age) {
        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        System.out.println("Register No: RA2511026011373");

        int age = 20;

        checkVotingEligibility(age);
    }
}