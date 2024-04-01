package gui;

import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import utils.Goto;
import java.awt.*;

public class DescPane extends Pane {
    public DescPane(){
        Text howToPlay = new Text("Rules here");
        //getChildren().add(howToPlay);
        Button selectPlayerButton = new Button("Click");
        VBox vBox = new VBox(5, howToPlay, selectPlayerButton);
        vBox.setAlignment(Pos.CENTER);
        vBox.setTranslateX(420);
        vBox.setTranslateY(250);
        getChildren().add(vBox);

        selectPlayerButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.selectPlayer();
            }
        });

    }

}
