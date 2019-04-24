package animalKingdomApp;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

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

        System.out.println("** ALL ANIMALS APHABETICALLY **");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalsArrayList.forEach(a -> System.out.println(a.getName()));
        System.out.println("\n");

        System.out.println("** ANIMALS ORDERED BY HOW THEY MOVE **");
        animalsArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalsArrayList.forEach(a -> System.out.println(a.getName() + " " + a.move()));
        System.out.println("\n");

        System.out.println("**ALL ANIMALS THAT BREATHE WITH LUNGS **");
        ArrayList<AbstractAnimal> filteredAnimals = new ArrayList<>(animalsArrayList);
        filteredAnimals.removeIf(a -> !a.breath().equals("Lungs"));
        filteredAnimals.forEach(a -> System.out.println(a.getName() + " breaths with " + a.breath()));
        System.out.println("\n");

        System.out.println("** ALL ANIMALS THAT BREATH WITH LUNGS AND WERE NAMED IN 1758 **");
        ArrayList<AbstractAnimal> filteredAnimals2 = new ArrayList<>(animalsArrayList);
        filteredAnimals2.removeIf(a -> !(a.breath().equals("Lungs") && a.getYear() == 1758));
        filteredAnimals2.forEach(a -> System.out
                .println(a.getName() + " breaths with " + a.breath() + " and was named in " + a.getYear()));
        System.out.println("\n");

        System.out.println("** ALL ANIMALS THAT LAY EGGS AND BRETHE WITH LUNGS **");
        ArrayList<AbstractAnimal> filteredAnimals3 = new ArrayList<>(animalsArrayList);
        filteredAnimals3.removeIf(a -> !(a.breath().equals("Lungs") && a.reproduce().equals("Eggs")));
        filteredAnimals3.forEach(
                a -> System.out.println(a.getName() + " breaths with " + a.breath() + " lays " + a.reproduce()));
        System.out.println("\n");

        System.out.println("** ALL ANIMALS NAMED IN 1758 **");
        ArrayList<AbstractAnimal> filteredAnimals4 = new ArrayList<>(animalsArrayList);
        filteredAnimals4.removeIf(a -> a.getYear() != 1758);
        filteredAnimals4.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals4.forEach(a -> System.out.println(a.getName() + " was named in " + a.getYear()));
        System.out.println("\n");

    }
}