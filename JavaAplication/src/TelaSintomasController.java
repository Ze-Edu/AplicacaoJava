import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class TelaSintomasController {

    @FXML
    private Button btnAva;

    @FXML
    public CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check8;

    @FXML
    private CheckBox check9;

    @FXML
    private void Action() {}

    @FXML
    void btnSintomas(ActionEvent event) {
    
        if(check1.isSelected() && check5.isSelected() && check6.isSelected() && check7.isSelected() == true){
        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("Telafinal2.fxml"));
         try {
             Scene s = new Scene(fx.load());
             Stage st = new Stage();
             st.setTitle("AplicaçãoJava-Covid19");
             st.setScene(s);
             st.show();

         } catch (IOException e) {
             e.printStackTrace();
         }
        }else{
        FXMLLoader fx = new FXMLLoader(LoginController.class.getResource("Telafinal1.fxml"));
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
