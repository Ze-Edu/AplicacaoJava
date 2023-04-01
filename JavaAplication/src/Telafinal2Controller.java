import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Telafinal2Controller {

    @FXML
    private Button BtnSairApp;

    @FXML
    private Pane Penene;

    @FXML
    private Button BtnVoltar;

    Stage stage;
    @FXML
    void SairAplicacao(ActionEvent event) {
        // stage = (Stage) Penene.getScene().getWindow();
        // System.out.println(" Sucesso ao sair! ");
        // stage.close();

        System.exit(0);
    }

    @FXML
    void VoltarAoInicio(ActionEvent event) {
        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("AtualScene.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("AplicaçãoJava-Covid19");
            st.setScene(s);
            st.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
