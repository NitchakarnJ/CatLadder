package main;

import com.sun.javafx.tk.quantum.PrimaryTimer;
import gui.BGPane;
import gui.RootPane;
import gui.WelcomePage;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.InputStream;

public class Main extends Application{

    public void start(Stage primaryStage) {
        BGPane bgPane = new BGPane();
        //RootPane root = RootPane.getRootPane();
        //root.setAlignment(Pos.TOP_CENTER);
        //set เท่าไหร่ดี
        Scene scene = new Scene(bgPane,720,720);
        primaryStage.setTitle("CatLadder");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();

        //Background//
//        Image image1 = new Image("bg.png");
//        BackgroundImage bgImage = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100,true,true,true,true));
//        Background bg =new Background(bgImage);
//        root.setBackground(bg);
        //---------------------//


        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
