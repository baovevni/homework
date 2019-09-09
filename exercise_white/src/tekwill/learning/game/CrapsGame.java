package tekwill.learning.game;

import java.util.Random;

public class CrapsGame {
    private int firstDiceRolledResult;
    private int secondDiceRolledResult;
    private int establishedPoint;
    private int sumOfRolledDices;
    private Random r = new Random();

    public void play() {
        playAHand();
        if (isCraps()) {
            printMessageWithScores("You loose");
        } else if (isNatural()) {
            printMessageWithScores("You win");
        } else {
            printRolledResults();
            establishedPoint = sumOfRolledDices;
            System.out.println("Point is " + establishedPoint);
            continuePlayingWhileConditionIsMet();
        }
        reset();
    }

    public void reset(){
        firstDiceRolledResult = 0;
        secondDiceRolledResult = 0;
        establishedPoint = 0;
        sumOfRolledDices = 0;
    }

    private void continuePlayingWhileConditionIsMet(){
        boolean conditionIsMet;
        do {
            playAHand();
            if (isSevenOut()) {
                printMessageWithScores("You lose");
                conditionIsMet = true;
            } else if (isTheSamePoint()) {
                printMessageWithScores("You win");
                conditionIsMet = true;
            } else {
                conditionIsMet = false;
            }

        } while (!conditionIsMet);
    }

    public void playAHand(){
        firstDiceRolledResult = rollADice();
        secondDiceRolledResult = rollADice();
        sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
    }

    public int rollADice() {
        return r.nextInt(6) + 1;
    }

    public boolean isCraps(){
        return sumOfRolledDices == 2 || sumOfRolledDices == 3 || sumOfRolledDices == 12;
    }

    public boolean isNatural(){
        return sumOfRolledDices == 7 || secondDiceRolledResult == 11;
    }

    public boolean isTheSamePoint(){
        return establishedPoint == sumOfRolledDices;
    }

    public boolean isSevenOut(){
        return sumOfRolledDices == 7;
    }

    public void printRolledResults(){
        System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
    }

    public void printMessageWithScores(String message){
        printRolledResults();
        System.out.println(message);
    }
}


//public class Demo {
//    public static void main(String[] args) {
//        Random r = new Random();
//        int firstDiceRolledResult = r.nextInt(6) + 1;
//        int secondDiceRolledResult = r.nextInt(6) + 1;
//        int establishedPoint = 0;
//
//        int sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
//
//        if (sumOfRolledDices == 2 || sumOfRolledDices == 3 || sumOfRolledDices == 12) {
//            System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
//            System.out.println("You lose");
//        } else if (sumOfRolledDices == 7 || secondDiceRolledResult == 11) {
//            System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
//            System.out.println("You win");
//        } else {
//            System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
//            establishedPoint = sumOfRolledDices;
//            System.out.println("Point is " + establishedPoint);
//            boolean conditionIsMet = false;
//            do {
//                firstDiceRolledResult = r.nextInt(6) + 1;
//                secondDiceRolledResult = r.nextInt(6) + 1;
//                sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
//                if (sumOfRolledDices == 7) {
//                    System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
//                    System.out.println("You lose");
//                    conditionIsMet = true;
//                } else if (establishedPoint == sumOfRolledDices) {
//                    System.out.println("You rolled: " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
//                    System.out.println("You win");
//                    conditionIsMet = true;
//                } else {
//                    conditionIsMet = false;
//                }
//
//            } while (!conditionIsMet);
//        }
//
//    }
//}