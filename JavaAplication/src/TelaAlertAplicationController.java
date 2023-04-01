import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class TelaAlertAplicationController {

    @FXML
    private Button btnAvancar;

    @FXML
    private Label lblOlaUser;

    @FXML
    private Label lblText;

    @FXML
    private Pane Fundo;

    Stage stage;
    @FXML
    void AvancarSintomas(ActionEvent event) {

        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("TelaSintomas.fxml"));
        try {
            stage = (Stage) Fundo.getScene().getWindow();
            System.out.println("Sucesso ao passar de tela!");
            stage.close();

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
