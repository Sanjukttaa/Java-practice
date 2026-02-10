class TwoDArrays {
    public static void main(String[] args) {
        String[][] cars = {
                { "BMW", "Ferrari", "Lambo" },
                { "Mustang", "Ranger", "Camaro" },
                { "Prosch", "Audi", "Corvette" }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j] + "    ");
            }
        }
    }
}
