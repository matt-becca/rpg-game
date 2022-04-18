package characters;

import static util.DiceRoll.DiceRolly;

public abstract class Character implements Attackable, Defendable{

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected int defenseDamage = 0;
    protected int spDefenseDamage = 20;
    protected String name = "";

    public Character(int hp, int attackDamage, int denfenseDamage, String name) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defenseDamage = denfenseDamage;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefenseDamage() {
        return defenseDamage;
    }

    public void setDefenseDamage(int defenseDamage) {
        this.defenseDamage = defenseDamage;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        int characterRoll = (int) DiceRolly();
        //int rand = (int) (Math.random() * 6);
        System.out.println(characterRoll);
            if (characterRoll >= 4) {

            }
//        if (attackDamage > baseAttackDamage) {
//            System.out.println("Attacked for " + attackDamage + " damage");
//        } else {
//            System.out.println("Attacked for " + baseAttackDamage + " damage");
//        }
    }

    public void defend() {
        if (defenseDamage > baseDefenseDamage) {
            System.out.println("Defended for " + defenseDamage + " damage");
        } else {
            System.out.println("Defended for " + baseDefenseDamage + " damage");
        }
    }

}