import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class QuizExamMain {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select 1 for Adding a question \nSelect 2 for giving a quiz exam.");
            System.out.println("1. Add Question\n" + "2. Start Quiz");
            System.out.println("Your Options:");
            int options = sc.nextInt();


            if (options == 1) {
                CreateQuestion.createQuestion();
                System.out.println("Thank you for adding Question to our Database.");
            } else if (options == 2) {
                GiveQuiz.giveQuiz();
                System.out.println("Thanks for Participating in the quiz.");
            } else {
                System.out.println("Invalid Option");
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println("Exception!!!");
        }
    }
}
