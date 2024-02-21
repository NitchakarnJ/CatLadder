package main;

import com.sun.javafx.tk.quantum.PrimaryTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application{

    public void start(Stage primaryStage) {
        HBox root = new HBox();
        //set เท่าไหร่ดี
        Scene scene = new Scene(root,800,600);
        primaryStage.setTitle("CatLadder");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();

        //can not Resize
        //primaryStage.setResizable(false);

        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
