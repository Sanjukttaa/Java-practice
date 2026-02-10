import java.util.*;

class TwoDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> Grocerylist = new ArrayList<>();
        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("Pasta");
        bakerylist.add("Donuts");
        bakerylist.add("Bread");

        ArrayList<String> drinklist = new ArrayList<>();
        drinklist.add("Tequila");
        drinklist.add("Cocacola");
        drinklist.add("Soda");

        Grocerylist.add(bakerylist);
        Grocerylist.add(drinklist);

        // System.out.println(Grocerylist);
        // System.out.println(Grocerylist.get(0));
        System.out.println(Grocerylist.get(0).get(1));
    }
}