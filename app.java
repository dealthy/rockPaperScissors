/**
 * @author Dealthy
 * The programmer is a rock paper scissors programme playing with a bot
 * The winner method aims to generate the robots choice using java.util.Random, and decide the winner
 * The main method output teh result and take in the input
 */
import java.util.Scanner;
import java.lang.Random;
public class app{
    public static String winner(int choice){
        return winner;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while (true){
            System.out.println("welcome to rock paper scissors");
            System.out.println("rock = 0; paper = 1; scissors = 2");
            int choice = scan.nextInt();
            System.out.println("The Winner is:" + winner(choice));
        }
    }
}