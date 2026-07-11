package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class HelloApplication {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Locate and load the Goal-1 UI (Login Page)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root = loader.load();

            // Set up the window scene window
            Scene scene = new Scene(root, 400, 400);

            primaryStage.setTitle("Education Board Portal Simulation");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX Runtime Environment
    }
}