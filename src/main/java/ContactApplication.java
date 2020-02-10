import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Contacts;
import model.Person;

import java.io.IOException;
import java.util.Date;


public class ContactApplication extends Application{

    Contacts contacts = new Contacts();

    private Stage primaryStage;
    private GridPane sample;

    public static void main(String[] args) {
        Application.launch(ContactApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ContactApp");

        Init();

    }

    public void Init() {

        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("test.fxml"));
            sample = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(sample);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

/*
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 800, Color.WHITE);
        BorderPane pane = new BorderPane();
        ListView<Person> contactList = new ListView<model.Person>();
        model.Person p;
        for(int i =0; i < 5; i++){
            p = new model.Person("Michel", "Jean", "JeanMi", "111111111",
                    "test", "test", new Date());
            contacts.addPerson(p);
        }
        ObservableList<Person> items = FXCollections.observableArrayList(contacts.getContacts());
        contactList.setItems(items);
        root.getChildren().add(pane);
        root.getChildren().add(contactList);
        primaryStage.setScene(scene);
        primaryStage.show();
        */

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

}
