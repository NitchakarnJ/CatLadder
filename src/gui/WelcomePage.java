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

import javax.swing.Popup;


public class WelcomePage extends Pane {

    private static WelcomePage instance;
    private Image image;

    public WelcomePage(){

        Text welcomeTo = new Text("Welcome to\nCat And Ladders");

        welcomeTo.setFill(Color.BLACK);
        welcomeTo.setFont(Font.font("VERDANA", FontWeight.BOLD,32));
        welcomeTo.setTextAlignment(TextAlignment.CENTER);

        Button playButton = playButton();

        VBox vbox = new VBox(5,welcomeTo,playButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setTranslateX(420);
        vbox.setTranslateY(250);

//        welcomeTo.setLayoutX(220);
//        welcomeTo.setLayoutY(158);
//
//        playButton.setLayoutX(261);
//        playButton.setLayoutY(360);
        playButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.descPage();
            }
        });

        getChildren().addAll(vbox);




    }

    private Button playButton(){
        Button button = new Button("Play");
        button.setPrefWidth(200);
        button.setPrefHeight(50);
        Font font = new Font(40);
        Paint color = Color.web("#F2F5FA");
        button.setFont(font);
        button.setBackground(Background.fill(color));
        button.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, new CornerRadii(10), BorderWidths.DEFAULT)));
        return button;
    }

    public static WelcomePage getWelcomePage(){
        if (instance == null) {
            instance = new WelcomePage();
        }
        return instance;
    }
    public void setImageByPath(String imagePath) {
        String classLoaderPath = ClassLoader.getSystemResource(imagePath).toString();
        this.image = new Image(classLoaderPath);

//        try {
//            this.image = new Image(new FileInputStream(imagePath));
//        } catch (FileNotFoundException e1) {
//            try {
//                this.image = new Image(new FileInputStream("res/6.png"));
//            } catch (FileNotFoundException e2) {
//                this.image = null;
//            }
//        }
    }


}
