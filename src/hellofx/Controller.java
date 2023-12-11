package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private void handleButtonClick(ActionEvent event) {
        System.out.println("Hello World!");
    }
}
