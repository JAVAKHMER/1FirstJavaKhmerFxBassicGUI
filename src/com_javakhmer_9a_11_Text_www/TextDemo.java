package com_javakhmer_9a_11_Text_www;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		
		Pane pane = new Pane();
		pane.setPadding(new Insets(10,10,10,10));
		Text text = new Text(20,50,"java Khmer");
		pane.getChildren().add(text);
		Text text1 = new Text(20,20,"I love cambodia.");
		text1.setUnderline(true);
		text1.setStyle("-fx-forgroun-color:green");
		text1.setFill(Color.BLUE);
		pane.getChildren().add(text1);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

}
