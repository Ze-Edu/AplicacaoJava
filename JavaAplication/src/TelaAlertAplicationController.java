import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    void AvancarSintomas(ActionEvent event) {

        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("TelaSintomas.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("AplicaçãoJava");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
