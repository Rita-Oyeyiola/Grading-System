import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student grade:");
        int score = scanner.nextInt();
        scanner.nextLine();
        char grade = 'X';


    if (score <= 100)  {
        switch (score / 100) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
            case 6:
                grade = 'D';

            default:
                grade = 'F';
                break;

        }

    }
        System.out.println("Your grade score" + score + "is" + grade);

    }
}