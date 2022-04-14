package characters;

public class DeviousAstronaut extends Enemy{

    public DeviousAstronaut (String name) {
        super(600, 250,50, name);
    }

    public void floats() {
        System.out.println("Floats aimlessly");
    }

    public void attack() {
        System.out.println("Throw moon rocks -_-");
    }
}
