package board;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;


import java.net.URL;
import java.util.ResourceBundle;

public class boardControllor  {

    @FXML
    private TilePane tile;

    public void initialize() {
        int numRectangles = 80; // Number of rectangles you want to create

        for (int i = 0; i < numRectangles; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setArcHeight(5.0);
            rectangle.setArcWidth(5.0);
            rectangle.setFill(Color.DODGERBLUE);
            rectangle.setHeight(77.0);
            rectangle.setWidth(77.0);
            rectangle.setStroke(Color.BLACK);
            rectangle.setStrokeType(StrokeType.INSIDE);

            tile.getChildren().add(rectangle);
        }
    }

}
