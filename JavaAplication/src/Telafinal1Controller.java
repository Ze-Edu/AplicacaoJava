import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Telafinal1Controller {

    @FXML
    private Button BtnSairapp;

    @FXML
    private Button btnVoltarIni;

    @FXML
    private Pane pane;

    Stage stage;
    @FXML
    void SairApp(ActionEvent event) {
        stage = (Stage) pane.getScene().getWindow();
        System.out.println("Sucesso ao sair!");
        stage.close();
    }

    @FXML
    void VoltarAoIni(ActionEvent event) {

    }

}
