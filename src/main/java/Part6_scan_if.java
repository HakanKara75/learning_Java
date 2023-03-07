import java.util.Locale;
import java.util.Scanner;

public class Part6 {
    public static void main(String[] args) {
        String question="What is the largest planet in our solar system?";
        String choiceOne="earth";
        String choiceTwo="jupiter";
        String choiceThree="saturn";

        String correctAnswer=choiceTwo;


        System.out.println(question);

        System.out.println("Choose on eof yhe following: "+ choiceOne+ choiceTwo+choiceThree);

        Scanner scanner=new Scanner(System.in);
        String input=scanner.next().toLowerCase();

        if (correctAnswer.equals(input)){
            System.out.println("Congrats! That's the correct answer");
        }else {
            System.out.println("You are incorrect.");
        }
    }
}
