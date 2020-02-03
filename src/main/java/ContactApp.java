import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContactApp extends Application{

    Contacts contacts = new Contacts();
    
    public static void main(String[] args) {
        Application.launch(ContactApp.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 800, Color.WHITE);
        BorderPane pane = new BorderPane();
        ListView<Person> contactList = new ListView<Person>();
        Person p;
        for(int i =0; i < 5; i++){
            p = new Person("Michel", "Jean", "JeanMi", "111111111",
                    "test", "test", new Date());
            contacts.addPerson(p);
        }
        ObservableList<Person> items = FXCollections.observableArrayList(contacts.getContacts());
        contactList.setItems(items);
        root.getChildren().add(pane);
        root.getChildren().add(contactList);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
