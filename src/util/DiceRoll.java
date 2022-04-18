package util;

public class DiceRoll {

    public static int DiceRolly() {
        int dieSides = 6;
        int min = 1;
        int range = dieSides - min + 1;

        int rand = (int) (Math.random() * range) + min;
        return rand;
    }

    public static boolean isHigherRoll(int character1Roll, int character2Roll) {
        return character1Roll > character2Roll;
    }
}