package com_javakhmer_9a_15_Arc_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Arc arc = new Arc(100,100,80,80,30,35);
		arc.setType(ArcType.ROUND);
		arc.setFill(Color.GREEN);
		pane.getChildren().add(arc);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Arc java khmer");
		stage.show();
	}

}
