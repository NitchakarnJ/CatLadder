package homepage;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.Goto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homepageController implements Initializable {

    public ImageView bgImg;
    public ImageView gameName;
    public ImageView start;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bgImg.setImage(new Image("bgAutumn.png"));
        gameName.setImage(new Image("catLadder1.png"));
        start.setImage(new Image("START.png"));
        setSizeBig(gameName);
        setSizeSmall(start);
    }

    public void setSizeBig(ImageView imageView){
        imageView.setScaleX(1.5);
        imageView.setScaleY(1.5);
    }
    public void setSizeSmall(ImageView imageView){
        imageView.setScaleX(0.5);
        imageView.setScaleY(0.5);
    }

    public void setSizeNormal(ImageView imageView){
        imageView.setScaleX(0.5);
        imageView.setScaleY(0.5);
    }


    public void onMouseEnter(MouseEvent mouseEvent) {
        start.setScaleY(0.65);
        start.setScaleX(0.65);
    }

    public void onMouseExit(MouseEvent mouseEvent) {
        start.setScaleY(0.5);
        start.setScaleX(0.5);
    }

    public void gotoRule(MouseEvent mouseEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../rulepage/rulePage.fxml"));
            Stage stage = (Stage) start.getScene().getWindow();

            Parent root = fxmlLoader.load();

            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
