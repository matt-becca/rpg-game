package characters;

public class Hero extends Character {

    private String name;

    public Hero(int hp, int attackDamage, int defenseDamage, String name) {
        super(hp, attackDamage, defenseDamage, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    public void spDefense(){
        System.out.println("Used Special Defend for " + spDefenseDamage + " damage");
    }
}
