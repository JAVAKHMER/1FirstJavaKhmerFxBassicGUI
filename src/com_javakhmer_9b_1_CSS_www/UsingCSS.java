package com_javakhmer_9b_1_CSS_www;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class UsingCSS extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new Group()); 
		//scene.getStylesheets().add(“test.css”); 
		Rectangle rect = new Rectangle(100,100); 
		rect.setLayoutX(50); 
		rect.setLayoutY(50); 
		rect.setStyle("-fx-fill: yellow;  -fx-stroke: green; "
				+ "-fx-stroke-width: 5; -fx-stroke-dash-array: 12 2 4 2;"
				+ "-fx-stroke-dash-offset: 6;-fx-stroke-line-cap: butt");
		((Group)scene.getRoot()).getChildren().add(rect);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
