package com_javakhmer_9a_13_Rectangle_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		for(int i = 0 ;i < 8 ;i++ )
		{
			Rectangle r = new Rectangle(30,50,100,10);
			r.setRotate(i*360/16);
			r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
			r.setFill(Color.color(Math.random(),Math.random(),Math.random()));
			pane.getChildren().add(r);
		}
		Scene scene = new Scene(pane,150,110);
		stage.setScene(scene);
		stage.setTitle("Rectangle java khmer ");
		stage.show();
	}

}
