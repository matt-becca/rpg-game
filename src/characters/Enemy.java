package characters;

import characters.Character;

public class Enemy extends Character {

    private String name;

    public Enemy(int hp, int attackDamage, int defenseDamage, String name) {
        super(hp, attackDamage, defenseDamage, name);
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    public void defend() {
        System.out.println("Enemy Defend!");
    }

    public void spDefense(){
        System.out.println("Used Special Defend for " + spDefenseDamage + " damage");
    }
}
