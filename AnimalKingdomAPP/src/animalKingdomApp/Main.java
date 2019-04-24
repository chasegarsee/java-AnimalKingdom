package animalKingdomApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Panda", "Zebra", "Koala", "Sloth", "Armadillo", "Raccoon", "Bigfoot", "Pigeon", "Peacock",
                "Toucan", "Parrot", "Swan", "Salmon", "Catfish", "Perch" };
        String[] types = { "mammals", "mammals", "mammals", "mammals", "mammals", "mammals", "mammals", "birds",
                "birds", "birds", "birds", "birds", "fish", "fish", "fish" };
        int[] years = { 1869, 1778, 1816, 1804, 1758, 1758, 2021, 1837, 1821, 1758, 1824, 1758, 1758, 1817, 1758 };

        ArrayList<AbstractAnimal> animalsArrayList = new ArrayList<AbstractAnimal>();

        for (int i = 0; i < names.length; i++) {
            if (types[i].equals("mammals")) {
                animalsArrayList.add(new Mammals(names[i], years[i]));

            } else if (types[i].equals("birds")) {
                animalsArrayList.add(new Birds(names[i], years[i]));
            } else {
                animalsArrayList.add(new Fish(names[i], years[i]));
            }
        }

        for (AbstractAnimal a : animalsArrayList) {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getYear() + " " + a.move() + " " + a.reproduce()
                    + " " + a.breath());
        }
        System.out.println("**  ALL AMIMALS IN DECENDING ORDER BY YEAR NAMED  **");
        animalsArrayList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animalsArrayList.forEach(a -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println("\n");
    }
}