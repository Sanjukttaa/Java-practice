import java.util.Scanner;

class Logicaloperator {
    public static void main(String[] args) {

        // && = (AND) both condition should be true
        // int temp = 15;
        // if (temp > 30) {
        // System.out.println("It is hot outside");
        // } else if (temp >= 20 && temp <= 30) {
        // System.out.println("It is warm outside");
        // } else {
        // System.out.print("It is cold outside");
        // }

        // || = (OR) either condition should be true
        // ! = (NOT) reverse boolean value of a condition
        Scanner sc = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q for quit");
        String response = sc.next();

        // if (response.equals("q") || response.equals("Q")) {
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing");
        }
        sc.close();
    }
}