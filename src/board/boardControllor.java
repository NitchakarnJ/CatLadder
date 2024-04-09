package board;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;


import java.net.URL;
import java.util.ResourceBundle;

public class boardControllor  {

    public ImageView rollDice;
    @FXML
    private TilePane tileBox;

    public void initialize() {
        rollDice.setImage(new Image("dice1.png"));
//        int numRectangles = 81; // Number of rectangles you want to create
        int tileSize = 77;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                Rectangle rectangle = new Rectangle();

                rectangle.setHeight(tileSize);
                rectangle.setWidth(tileSize);
                rectangle.setStroke(Color.BLACK);
                rectangle.setStrokeType(StrokeType.INSIDE);
                int tileNumber;

                if (i % 2 == 0) {
                    tileNumber = 82 - ((i * 9) + (j + 1));
                } else  {
                    tileNumber = 82 - (((i + 1) * 9) - j);
                }

                if (tileNumber % 2 == 0) {
                    rectangle.setFill(Color.LIGHTGRAY);
                } else {
                    rectangle.setFill(Color.WHITE);
                }
                Text text = new Text(Integer.toString(tileNumber));
                text.setX(j * tileSize + 30);
                text.setY(i * tileSize + 20);
                text.setTranslateZ(30);

//                tileBox.getChildren().add(text);
                tileBox.getChildren().add(rectangle);
            }






        }
    }

}
