package com_javakhmer_6_Font_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class Font extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setRadius(90);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Label label = new Label("java Khmer");
		label.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		StackPane pane = new StackPane();
		pane.getChildren().addAll(circle,label);
		Scene scene = new Scene(pane,300,300);
		stage.setScene(scene);
		stage.setTitle("Java Khmer Font");
		stage.show();
	}

}
