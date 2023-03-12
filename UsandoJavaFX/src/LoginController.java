import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class LoginController {
    
    @FXML
    private Button Btn;

    @FXML
    private TextField CampoSenha;

    @FXML
    private TextField CampoUser;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = CampoUser.getText();
        String senha = CampoSenha.getText();

        if(usuario.equals("zezin") && senha.equals("123456")){
            System.out.println("Fez login com sucesso!");
        }else{
            System.out.println("Erro com senha ou usuario!");

        }
    }

}
