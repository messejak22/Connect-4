import java.util.Scanner;

public class PlayerTwo {


    public static int gamePlay() {
        // method to retrieve playerTwo input
        Scanner scan = new Scanner(System.in);
        String letter;
        int choice;
        System.out.println("Enter column letter PlayerTwo: ");
        letter = scan.nextLine();
        letter = letter.toUpperCase();
        // changes letter choice to a number
        if (letter.equals("A")) {
            choice = 1;
        } else if (letter.equals("B")) {
            choice = 2;
        }  else if (letter.equals("C")) {
            choice = 3;
        }  else if (letter.equals("D")) {
            choice = 4;
        }  else if (letter.equals("E")) {
            choice = 5;
        }  else if (letter.equals("F")) {
            choice = 6;
        } else {
            choice = 7;
        }
        return choice;

    } // end of gamePlay method



}
