package gui;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import utils.Goto;

import java.util.Random;

public class Dice extends StackPane {
    private int num1 = -1;
    private static final String[] imagePath = new String[]{"defaultDice.png","dice1.png","dice2.png","dice3.png","dice4.png","dice5.png","dice6.png"};

    public Dice() {

        //default dice when not click
        String classLoaderPath = ClassLoader.getSystemResource("defaultDice.png").toString();
        Image img1 = new Image(classLoaderPath);
        ImageView imageView = new ImageView(img1);
        Text text = new Text();

        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Random random = new Random();

                    num1 = random.nextInt(1, 7);

                    imageView.setImage(new Image(setClassLoaderString(imagePath[num1])));


                    text.setText(Integer.toString(num1));
//                    Goto.welcomePage(Integer.toString(num1));

                } catch (Exception error) {
                    return;
                }
            }
        });
        getChildren().addAll(imageView,text);
    }

    public String setClassLoaderString(String imagePath) {
        return ClassLoader.getSystemResource(imagePath).toString();
    }
}



//                    switch (num1) {
//                        case 1: {
//                            imageView.setImage(new Image(setClassLoaderString("dice1.png")));
//                            break;
//                        }
//                        case 2: {
//                            imageView.setImage(new Image(setClassLoaderString("dice2.png")));
//                            break;
//                        }
//                        case 3: {
//                            imageView.setImage(new Image(setClassLoaderString("dice3.png")));
//                            break;
//                        }
//                        case 4: {
//                            imageView.setImage(new Image(setClassLoaderString("dice4.png")));
//                            break;
//                        }
//                        case 5: {
//                            imageView.setImage(new Image(setClassLoaderString("dice5.png")));
//                            break;
//                        }
//                        case 6: {
//                            imageView.setImage(new Image(setClassLoaderString("dice6.png")));
//                            break;
//                        }
//                    }