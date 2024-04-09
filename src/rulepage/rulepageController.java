package rulepage;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class rulepageController implements Initializable {
    public ImageView bgImg;
    public ImageView playButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bgImg.setImage(new Image("bgAutumn.png"));
        playButton.setImage(new Image("PLAY.png"));
        playButton.setScaleX(0.5);
        playButton.setScaleY(0.5);
    }
    public void onMouseEnter(MouseEvent mouseEvent) {
        playButton.setScaleY(0.65);
        playButton.setScaleX(0.65);
    }

    public void onMouseExit(MouseEvent mouseEvent) {
        playButton.setScaleY(0.5);
        playButton.setScaleX(0.5);
    }

    public void gotoBoard(MouseEvent mouseEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../board/board.fxml"));
            Stage stage = (Stage) playButton.getScene().getWindow();

            Parent root = fxmlLoader.load();

            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
