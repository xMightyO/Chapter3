import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        if (num1 < num2) {
            int swap = num1;
            num2 = swap;
        }
        System.out.print(num1 + " - " + num2 + " = ");
        int answer = input.nextInt();

        int correct = num1 - num2;

        if (answer == correct) {
            System.out.println("Correct! well done.");
        } else {
            System.out.println("Oops! The correct answer was " + correct);
        }

        input.close();
    }
}