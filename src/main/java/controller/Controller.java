package controller;

import javafx.scene.control.Alert;

/**
 * Created by RENT on 2017-03-16.
 */
public class Controller {
    protected MainController getMainController() {
        return mainController;
    }

    protected MainController mainController;

    protected void showErrorAlert(String message) {
        showAlert(Alert.AlertType.ERROR, message);
    }

    protected void showConfirmationAlert(String message){
        showAlert(Alert.AlertType.CONFIRMATION, message);
    }

    private void showAlert(Alert.AlertType alertType, String message){
        new Alert(alertType, message).show();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;

    }
}
