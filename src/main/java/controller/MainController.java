package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.omg.CORBA.INITIALIZE;

import java.io.IOException;

/**
 * Created by RENT on 2017-03-18.
 */
public class MainController {

    private Stage stage;
    private FXMLLoader loader;

    @FXML
    public void initialize() {
        loader = new FXMLLoader(this.getClass().getResource("/LoginView.fxml"));

        try {
            StackPane loginPane = loader.load();
            LoginController loginController = loader.getController();
            loginController.setMainController(this);
            mainStackPane.getChildren().add(loginPane);
//            loader.setController(loginController);
//            Scene scene = new Scene(mainStackPane);
//            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public MainController(Stage primaryStage) {
        setStage(primaryStage);
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public StackPane getMainStackPane() {
        return mainStackPane;
    }

    @FXML
    private StackPane mainStackPane;

}
