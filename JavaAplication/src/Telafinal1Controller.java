import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class Telafinal1Controller {

    @FXML
    private Button BtnSairapp;

    @FXML
    private Button btnVoltarIni;

    @FXML
    private Pane Pane;

    Stage stage;
    @FXML
    void SairApp(ActionEvent event) {
        // stage = (Stage) Pane.getScene().getWindow();
        // System.out.println("Sucesso ao sair!");
        // stage.close();
        System.exit(0);
    }

    @FXML
    void VoltarAoIni(ActionEvent event) {
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
