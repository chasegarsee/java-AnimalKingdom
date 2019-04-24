package animalKingdomApp;

public class Fish extends AbstractAnimal {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "Swims";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }

    @Override
    public String breath() {
        return "Gills";
    }

    @Override
    public String toString() {
        return (this.getName() + " is a fish, was named in " + this.getYear());
    }

}