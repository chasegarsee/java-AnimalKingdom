package animalKingdomApp;

public class Birds extends AbstractAnimal {
    public Birds(String name, int year) {

        super(name, year);
    }

    @Override
    public String move() {
        return "Flies";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }

    @Override
    public String breath() {
        return "Lungs";
    }

    @Override
    public String toString() {
        return (this.getName() + " is a bird, and was named in " + this.getYear());
    }
}
