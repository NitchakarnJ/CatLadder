package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import utils.Goto;

public class RootPane extends VBox{
    private static RootPane instance;

    private RootPane(){
        setAlignment(Pos.TOP_CENTER);
        setSpacing(16);
        setPadding(new Insets(32,0,32,0));

        Image image1 = new Image("bg.png");
        BackgroundImage bgImage = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,new BackgroundSize(100,100,true,true,true,true));
        Background bg =new Background(bgImage);
        setBackground(bg);

        ///////////////////////////
        //Goto.setRootPane(this);
        //Goto.welcomePage();
        GridPane gridPane = new GridPane();
        gridPane.setPrefHeight(720);
        gridPane.setPrefWidth(720);
        //gridPane.setHgap(10);
        //gridPane.setVgap(10);

        // เพิ่ม Node ลงใน GridPane
        Label label1 = new Label("Label 1");
        GridPane.setConstraints(label1, 0, 0);

        Label label2 = new Label("Label 2");
        GridPane.setConstraints(label2, 1, 1);

        Label label3 = new Label("Label 3");
        GridPane.setConstraints(label3, 2, 2);

        gridPane.getChildren().addAll(label1, label2, label3);
        //setAlignment(gridPane, Pos.CENTER);
        getChildren().add(gridPane);

    }

    public static RootPane getRootPane() {
        if (instance == null)
            instance = new RootPane();
        return instance;
    }
}
