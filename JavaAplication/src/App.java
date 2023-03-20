
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception { 
        FXMLLoader floader = new FXMLLoader(getClass().getResource("AtualScene.fxml"));
        Parent root = (Parent) floader.load();

        

        Scene tela = new Scene(root);
        primaryStage.setTitle("AplicaçãoJava-Covid19");
        primaryStage.setScene(tela);
        primaryStage.show();
    }

    public static Stage getStage(){
        return primaryStage;
    }
}
