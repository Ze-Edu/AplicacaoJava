import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    private Button Btn;

    @FXML
    public TextField CampoUser;

    @FXML
    private Button btnSair;

    @FXML
    private AnchorPane scenePane;

    Stage stage;
    @FXML
    private void SairSistema(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("Sucesso ao sair!");
        stage.close();
    }

    @FXML
    void fazerLogin(ActionEvent event) {

        String campoText = CampoUser.getText();

        if(campoText.equals("")){
            JOptionPane.showMessageDialog(null,"É necessário preencher o nome!");
        }else{

        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("TelaAlertAplication.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("AplicaçãoJava-Covid19");
            st.setScene(s);
            st.show();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    }
    
}

