package com_javakhmer_9a_14_Ellipse_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		for(int i = 0 ;i < 16 ; i++){
			Ellipse e = new Ellipse(150,100,100,50);
			e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			e.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			e.setRotate(i*180/16);
			pane.getChildren().add(e);
		}
		Scene scene = new Scene(pane,300,210);
		stage.setScene(scene);
		stage.setTitle("Ellipse java khmer");
		stage.show();
	}

}
