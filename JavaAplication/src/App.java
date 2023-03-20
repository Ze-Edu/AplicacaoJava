
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;

public class App extends Application{

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception { 
        Parent root = FXMLLoader.load(getClass().getResource("AtualScene.fxml"));
        Scene tela = new Scene(root);

        primaryStage.setTitle("AplicaçãoJava-Covid19");
        primaryStage.setScene(tela);
        primaryStage.show();
    }

    public static Stage getStage(){
        return primaryStage;
    }
}
