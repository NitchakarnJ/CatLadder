package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
//        BGPane bgPane = new BGPane();
        //RootPane root = RootPane.getRootPane();
        //root.setAlignment(Pos.TOP_CENTER);
        //set เท่าไหร่ดี
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../homepage/homepage.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root,1080,720));
//
//        Scene scene = new Scene(bgPane,1080,720);
//        primaryStage.setTitle("CatLadder");
//        primaryStage.setScene(scene);
//        primaryStage.sizeToScene();

        //Background//
//        Image image1 = new Image("bg.png");
//        BackgroundImage bgImage = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(100,100,true,true,true,true));
//        Background bg =new Background(bgImage);
//        root.setBackground(bg);
        //---------------------//


        primaryStage.show();
    }

}
