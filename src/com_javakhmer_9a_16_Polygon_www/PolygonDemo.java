package com_javakhmer_9a_16_Polygon_www;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonDemo extends Application{

	public static void main(String[] args) {
		launch(args);    
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		polygon.setStroke(Color.BLACK);
		polygon.setFill(Color.YELLOW);
		pane.getChildren().add(polygon);
		ObservableList<Double> list = polygon.getPoints();
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		for(int i = 0 ; i< 6 ; i++)
		{
			list.add(centerX + radius * Math.cos(2*i*Math.PI/6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI/6));
		}
		Scene scene = new Scene(pane,WIDTH,HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Polygon java khmer");
		stage.show();
	}

}
