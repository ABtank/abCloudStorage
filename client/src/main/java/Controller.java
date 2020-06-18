import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.nio.file.Path;


public class Controller {
    private IOClient client;


    public void menuItemFileExitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void filesListClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {

        }
    }

    public void copyAction(ActionEvent actionEvent) {

    }

    public void moveAction(ActionEvent actionEvent) {
    }

    public void deleteAction(ActionEvent actionEvent) {
    }

    public void connect(ActionEvent actionEvent) {
    }
}
