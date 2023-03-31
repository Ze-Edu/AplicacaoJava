import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Telafinal2Controller {

    @FXML
    private Button BtnSairApp;

    @FXML
    private Pane pane;

    @FXML
    private Button BtnVoltar;

    Stage stage;
    @FXML
    void SairAplicacao(ActionEvent event) {
        stage = (Stage) pane.getScene().getWindow();
        System.out.println(" Sucesso ao sair! ");
        stage.close();
    }

    @FXML
    void VoltarAoInicio(ActionEvent event) {

    }

}
