import java.util.Scanner;

class Nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter no of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter no of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = sc.next();

        for (int i = 0; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.println(symbol);
            }
        }
        sc.close();
    }
}
