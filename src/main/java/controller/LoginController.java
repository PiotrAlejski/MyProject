package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

import java.io.IOException;

/**
 * Created by RENT on 2017-03-14.
 */
public class LoginController extends Controller {
    private StackPane stackPane;

    public LoginController(StackPane stackPane) {
        this.stackPane = stackPane;
    }

    @FXML
    private Button submit;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginTextField;

    public LoginController() {
    }

    @FXML
    void submitOnAction(ActionEvent event) {
        System.out.println(loginTextField.getText());
        System.out.println(passwordField.getText());
//        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hello");
//        alert.show();
        getMainController().loadView("menuView");
//        getMainController().getMainStackPane().getChildren().add(new Label("Test zadziałania"));
        /**
         * 1. Powołujemy do życia UserService
         * 2. Tworzymy Usera z polami pobranymi z fieldów

         * 3. metoda Authenticate
         * 4. Sprawdzenie, czy hasło jest ok (if)
         */
    }


}

