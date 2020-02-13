package app;

import app.view.PersonOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import app.model.Contacts;
import app.model.Person;

import java.io.IOException;
import java.time.LocalDate;


public class ContactApplication extends Application{

    Contacts contacts = new Contacts();

    private Stage primaryStage;
    private BorderPane rootLayout;

    /**
     * The data as an observable list of Persons.
     */
    private ObservableList<Person> personData = FXCollections.observableArrayList();



    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ContactApp");

        personData.add(new Person("Michel", "Jean", "Jean-Mi", "numero",
                "test", "test", LocalDate.of(1999, 2, 12)));
        personData.add(new Person("Charles", "Jean", "Jean-Charles", "numero",
                "test", "test", LocalDate.of(1999, 2, 12)));
        personData.add(new Person("Bobby", "Jean", "Jean-Bobby", "numero",
                "test", "test", LocalDate.of(1999, 2, 12)));

        initRootLayout();

        showPersonOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ContactApplication.class.getResource("RootLayout.fxml"));
            rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ContactApplication.class.getResource("PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
