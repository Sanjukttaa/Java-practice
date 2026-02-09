import java.util.Scanner;

class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = sc.nextLine();
        System.out.println("My name is: " + name);

        System.out.println("What's your age? ");
        int age = sc.nextInt();
        System.out.println("My age is: " + age);

        sc.nextLine(); // using buffer to remove the extra line
        String food = sc.nextLine();
        System.out.println("My fav food is: " + food);

        sc.close();
    }
}
