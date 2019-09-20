package com.github.habahnow.leadsapplication;

import java.io.*;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class GUIControl extends Application{

	String bundleText;

	@Override
	public void start(Stage primaryStage) throws Exception{

		final Locale enLocale = new Locale("en", "US");
		final Locale esLocale = new Locale("es", "MX");

		ResourceBundle bundle = ResourceBundle.getBundle(
				"com.github.habahnow.leadsapplication.resources.MessageBundle", esLocale);
    	//System.out.println("Message in "+ bundle.getString("new"));

		Text mainTitle = new Text(); 
		mainTitle.setFont(new Font(30));
		mainTitle.setX(500);
		mainTitle.setY(75);
		bundleText = bundle.getString("selection");
		mainTitle.setText(bundleText);
		mainTitle.setUnderline(true);

		Text conSelectionTitle = new Text(); 
		conSelectionTitle.setFont(new Font(30));
		conSelectionTitle.setX(500);
		conSelectionTitle.setY(75);
		bundleText = bundle.getString("selection");
		conSelectionTitle.setText(bundleText);
		conSelectionTitle.setUnderline(true);

		Group root = new Group(mainTitle);
		Group listOfConsGroup = new Group(conSelectionTitle);
		
		Scene scene = new Scene(root, 1200, 600);

		Button newConventionBtn = new Button();
		Button oldConventionBtn = new Button();
		Button settingsBtn = new Button();



		bundleText = bundle.getString("new");
		newConventionBtn.setText(bundleText);
		newConventionBtn.setOnAction( new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event){
				System.out.println("Create a new Convention");
			}
		});

		newConventionBtn.setLayoutX(300);
		newConventionBtn.setLayoutY(275);

		bundleText = bundle.getString("old");
		oldConventionBtn.setText(bundleText);
		oldConventionBtn.setOnAction( new EventHandler<ActionEvent>(){
		// things done when old convention button is selected
			@Override
			public void handle(ActionEvent event) {
				System.out.println("old Convention");

								
				//display list of old conventions
				try {

					String path = File.separator + "resources" + File.separator + "Conventions" + File.separator;

					//TODO: move below steps to a function.
                    InputStream in = this.getClass().getResourceAsStream(path);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));

                    String file = br.readLine();
                    while (file != null){
                        System.out.println(file);
                        file = br.readLine();
                    }

					//open new window
					path = File.separator + "resources" + File.separator + "fxml" + File.separator +
							"Conventions.fxml";
					Parent root = FXMLLoader.load(this.getClass().getResource(path));
					primaryStage.setTitle("Conventions List");
					primaryStage.setScene(new Scene(root) );
					primaryStage.show();

				} catch(IOException e){
					e.printStackTrace();
				}

			}
		});

		oldConventionBtn.setLayoutX(500);
		oldConventionBtn.setLayoutY(275);

		bundleText = bundle.getString("settings");
		settingsBtn.setText(bundleText);
		settingsBtn.setOnAction( new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event){
				System.out.println("Settings Button");
			}
		});

		settingsBtn.setLayoutX(700);
		settingsBtn.setLayoutY(275);

		root.getChildren().add(newConventionBtn);
		root.getChildren().add(oldConventionBtn);
		root.getChildren().add(settingsBtn);

		scene.setFill(Color.DARKGRAY);

		bundleText = bundle.getString("applicationName");

		primaryStage.setTitle(bundleText);
		primaryStage.setScene(scene);

		primaryStage.show();

	}

	public static void main(String[] args){
	 	launch(args);

	 }

}