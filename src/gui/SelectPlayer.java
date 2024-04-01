package gui;

import javafx.geometry.Pos;
import javafx.scene.image.Image;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import javafx.geometry.HPos;

import java.awt.*;

import static javafx.scene.layout.GridPane.setHalignment;
import javafx.scene.layout.*;

public class SelectPlayer extends GridPane {
    public SelectPlayer(){
        ///setAlignment(Pos.TOP_CENTER);
        Text text = new Text("Select Player");
        text.setFont(Font.font("SOURCE CODE PRO", FontWeight.BOLD,32));
        text.setTextAlignment(TextAlignment.CENTER);
        add(text, 0,1);
        setHalignment(text,HPos.CENTER);

        Button button2Player = new Button("2 Player");
        Button button3Player = new Button("3 Player");

        HBox twoButton = new HBox(5,button2Player,button3Player);


    }
}
