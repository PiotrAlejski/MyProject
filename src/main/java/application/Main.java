package application;/**
 * Created by RENT on 2017-03-14.
 */

import controller.LoginController;
import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/MainView.fxml"));
//        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/LoginView.fxml"));
//        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/CompanyCreateView.fxml"));
        MainController mainController = new MainController(primaryStage);
//        LoginController loginController = new LoginController(stackPane);
        loader.setController(mainController);
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Logowanie");
        primaryStage.show();
    }
}
