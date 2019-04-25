package animalKingdomApp;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "Walks";
    }

    @Override
    public String reproduce() {
        return "Live Births";
    }

    @Override
    public String breath() {
        return "Lungs";
    }

    @Override
    public String toString() {
        return (this.getName() + " is a mammal, was named in " + this.getYear());
    }
}
