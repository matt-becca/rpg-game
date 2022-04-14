package characters;

public class UglyApe extends Enemy{

    public UglyApe(String name) {
        super(300, 100,10, name);
    }

    public void smashFlowers() {
        System.out.println("Sniff Flowers and then Smash");
    }

    public void attack() {
        System.out.println("Throw Barrel!");
    }
}
