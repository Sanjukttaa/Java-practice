class Arrays {
    public static void main(String[] args) {
        // String[] cars = { "BMW", "Porsech", "Mustang", "Audi" };

        // cars[0] = "Corvette";
        // System.out.print(cars[0]);
        // -------Another way--------

        String[] cars = new String[3];
        cars[0] = "Mustang";
        cars[1] = "Audi";
        cars[2] = "BMW";
        // System.out.print(cars[2]);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
