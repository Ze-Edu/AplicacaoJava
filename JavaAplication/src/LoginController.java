import java.io.IOException;

import org.xml.sax.ext.Locator2Impl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    private Button Btn;

    @FXML
    private TextField CampoUser;

    @FXML
    void fazerLogin(ActionEvent event) {
        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("TelaAlertAplication.fxml"));
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
