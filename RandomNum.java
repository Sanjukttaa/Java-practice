import java.util.Random;

class RandomNum {
    public static void main(String[] args) {
        Random rm = new Random();

        // int x = rm.nextInt(9) + 1; // using + 1 so we will get random no from 1 to 9
        // here; without this from 0 we will get
        // double x = rm.nextDouble(3);
        boolean x = rm.nextBoolean();
        System.out.println(x);
    }
}
