package utils;

import gui.*;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Goto {
    private static BGPane rootPane;
    public static void setRootPane(BGPane rootPane){
        Goto.rootPane = rootPane;
    }
    public static void clear(){
//        for(int i = 0;i < rootPane.getChildren().size()-2;i++){
//            rootPane.getChildren().remove(rootPane.getChildren().size()-1-i);
//        }
        //Node r = rootPane.getChildren().get(0);
        if(!rootPane.getChildren().isEmpty()){
            rootPane.getChildren().clear();
            //rootPane.getChildren().add(r);
        }
    }
    public static void selectPlayer(){
        clear();
        SelectPlayer selectPlayer = new SelectPlayer();

        rootPane.getChildren().add(selectPlayer);
    }
    public static void welcomePage(){
        clear();
        WelcomePage welcomePage = new WelcomePage();
        //welcomePage.setAlignment(Pos.TOP_CENTER);
        rootPane.getChildren().add(welcomePage);

    }
    public static void welcomePage(String numToTest){
        clear();
        WelcomePage welcomePage = new WelcomePage();
        //welcomePage.setAlignment(Pos.TOP_CENTER);
        rootPane.getChildren().addAll(welcomePage,new Text(numToTest));

    }
    public static void descPage(){
        clear();
        DescPane descPane = new DescPane();
        rootPane.getChildren().add(descPane);
    }
    public static void Dice(){
        clear();
        Dice dice = new Dice();
        rootPane.getChildren().add(dice);
    }
}
