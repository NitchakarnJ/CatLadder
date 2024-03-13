package gui;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import javafx.geometry.HPos;

public class SelectPlayer extends GridPane {
    public SelectPlayer(){
        ///setAlignment(Pos.TOP_CENTER);
        Text text = new Text("Select Player");
        text.setFont(Font.font("SOURCE CODE PRO", FontWeight.BOLD,32));
        text.setTextAlignment(TextAlignment.CENTER);
        add(text, 0,1);
        setHalignment(text,HPos.CENTER);

    }
}
