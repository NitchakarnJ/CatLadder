package logic;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import java.util.Random;

public class GameLogic {
    private static GameLogic instance = null;

    private static boolean isATurn;

    public static GameLogic getInstance() {
        if(instance == null) {
            instance = new GameLogic();
        }
        return instance;
    }

    public boolean isAturn() {
        return isATurn;
    }
    public void setAturn(boolean aTurn) {
        isATurn = aTurn;
    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(1, 7);
    }

    public String updateRollDiceNumber(int newRollNumber){
        return Integer.toString(newRollNumber);
    }


}
