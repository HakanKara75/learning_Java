import java.util.Scanner;

public class Part8_Functions {
    public static void announcedDeveleperTeaTime(){
        System.out.println("Waiting for developer tea time....");
        System.out.println("Type in and random word and press Enter to start developer tea time");
        Scanner input=new Scanner(System.in);
       input.next();
        System.out.println("ıt's developer tea time");

   }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        announcedDeveleperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announcedDeveleperTeaTime();
        System.out.println("Get promoted!");
    }
}
