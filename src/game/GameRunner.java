package game;

import characters.*;
import characters.Character;
import util.DiceRoll;
import util.Input;

import static util.DiceRoll.DiceRolly;

public class GameRunner {

    public static void main(String[] args) {
        String heroChoice = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");

        Attackable hero;
        // Character hero;
        //Character opponent = new Zombie;
        if (heroChoice.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else if (heroChoice.equalsIgnoreCase("knight")) {
            hero = new Knight("Knight");
        }else {
            hero = new Mage(2000, 150, 5,"zappy boi aka Samuel Moore");
        }

        String defenderChoice = Input.getString("Please select a Defender(Zombie/ Dragon/ UglyApe): ");

        Defendable defender;

        if (defenderChoice.equalsIgnoreCase("zombie")) {
            defender = new Zombie("Zombie");
        } else if (defenderChoice.equalsIgnoreCase("dragon")) {
            defender = new Dragon("Dragon");
        } else if (defenderChoice.equalsIgnoreCase("uglyape")) {
            defender = new UglyApe("UglyApe");
        }else {
            defender = new DeviousAstronaut("DeviousAstronaut");
        }

        do {
            //GamePlay.takeTurn(hero, opponent);
        } while(hero.getHp() <= 0 && opponent.getHp() > 0);
        //hero.attack();
        //defender.defend();

        int heroRoll = DiceRoll.DiceRolly();
        int opponentRoll = DiceRoll.DiceRolly();

        if(DiceRoll.isHigherRoll(heroRoll, opponentRoll)){
            hero.attack();
        }

//        hero.setAttacker(!hero.isAttacker());
//        opponent.setAttacker(!opponent.isAttacker());
    }

//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        String heroName = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
//
//        Hero hero;
////        WE DONT KNOW WHICH HERO WILL BE CHOSEN UNTIL RUNTIME
//        if (heroName.equalsIgnoreCase("warrior")) {
//            hero = new Warrior("Warrior");
//        } else {
//            hero = new Knight("Knight");
//        }
//
////        WE DONT KNOW WHICH HERO ATTACKS UNTIL RUN TIME
//        hero.attack();
//
//        Enemy[] enemies = {new Zombie(), new Dragon()};
//
//        int randomIndex = random.nextInt(enemies.length);
//        Enemy enemyToAttack = enemies[randomIndex];
//
//        System.out.println(enemyToAttack.getClass().getName());
//
//
//
//
//
//    }


}
