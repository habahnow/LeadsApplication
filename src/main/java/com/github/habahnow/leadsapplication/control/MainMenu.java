package com.github.habahnow.leadsapplication.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.github.habahnow.leadsapplication.control.Utilities.getMessageBundle;
import static com.github.habahnow.leadsapplication.control.Utilities.toAddress;

public class MainMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        //converts string to path/address
        String path = toAddress("..", "resources", "fxml"
                , "main_menu.fxml");

        ResourceBundle bundle = CurrentBundle.getCurrentBundle();

        //load the current bundle, and the fxml file
        Parent root = FXMLLoader.load(this.getClass().getResource(path),
                bundle);

        Scene scene = new Scene(root);

        primaryStage.setTitle( bundle.getString("applicationName"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
