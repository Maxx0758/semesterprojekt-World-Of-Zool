package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import gameEngine.Run;

public class GenericController {

    protected static Run r;
    protected static Stage primaryStage;

    public GenericController(Run r, Stage primaryStage){
        this.r = r;
        this.primaryStage = primaryStage;
    }

    public GenericController(){

    }

    @FXML
    private ImageView backgroundImage;

    @FXML
    void goRoom(MouseEvent event) {
        System.out.print("Test\n");
    }

    @FXML
    void darkenText(MouseEvent event) {

        Text text = (Text)event.getTarget();
        text.setStroke(Color.WHITE);
    }

    @FXML
    void highlightText(MouseEvent event) {

        Text text = (Text)event.getTarget();
        text.setStroke(Color.YELLOW);

    }

    @FXML
    void goOutside(MouseEvent event) throws Exception{
        changeScene("outside");
    }

    @FXML
    void changeScene(String fxmlFileName) throws Exception{
        r.changeScene(fxmlFileName);
    }
}
