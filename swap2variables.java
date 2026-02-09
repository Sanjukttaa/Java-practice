class swap2variables {
    public static void main(String[] args) {
        String x = "water";
        String y = "milk";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x value swaped: " + x);
        System.out.println("y value swaped: " + y);
    }
}
