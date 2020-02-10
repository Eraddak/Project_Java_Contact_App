

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



public class ContactApp extends Application{

	private Stage primaryStage;
	
    public static void main(String[] args) {
        Application.launch(ContactApp.class, args);
    }
    public void Init() {
    	try {
        	Parent root = FXMLLoader.load(getClass().getResource("interface.fxml"));
        	Scene scene = new Scene(root, 300, 275);
        	primaryStage.setScene(scene);
        	primaryStage.show();
        } catch(Exception e) {
        	e.printStackTrace();
        }
    }
    @Override
    public void start(Stage primaryStage) {
    	this.primaryStage = primaryStage;
        Init();
        
        
    }

}
