package com.example.buttoncuztomizations;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Button_cuztomizations extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("button_css.fxml"));
            Parent root = loader.load();

            // Set the controller for the FXML file
            ButtonController controller = loader.getController();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Button Cuztomization");
            stage.show();
            stage.setResizable(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}