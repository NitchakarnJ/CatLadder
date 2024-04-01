package gui;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import utils.Goto;

public class BGPane extends StackPane {
    // สร้าง GridPane
    private static BGPane instance;

    public BGPane(){
        Image image1 = new Image("bg.png");
//        BackgroundImage bgImage = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,new BackgroundSize(100,100,true,true,true,true));
//        Background bg =new Background(bgImage);
//        setBackground(bg);

        Goto.setRootPane(this);
        Goto.welcomePage();


    }



}
