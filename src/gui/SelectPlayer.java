package gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.image.Image;

import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import javafx.geometry.HPos;

import java.awt.*;

import static javafx.scene.layout.GridPane.setHalignment;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import utils.Goto;

public class SelectPlayer extends GridPane {
    public SelectPlayer(){
        ///setAlignment(Pos.TOP_CENTER);
        Text text = new Text("Select Player");
        text.setFont(Font.font("SOURCE CODE PRO", FontWeight.BOLD,32));
        text.setTextAlignment(TextAlignment.CENTER);
        add(text, 0,1);
        setHalignment(text,HPos.CENTER);

        Button button = new Button("----");
        add(button,0,2);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.Dice();
            }
        });




    }
}
