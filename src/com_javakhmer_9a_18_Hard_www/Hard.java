package com_javakhmer_9a_18_Hard_www;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Hard extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.setRadius(80);
		circle.setCenterX(150);
		circle.setCenterY(150);
		circle.setStroke(Color.PINK);
		circle.setFill(Color.WHITE);
		
		Circle circleEyeLefe = new Circle();
		circleEyeLefe.setRadius(15);
		circleEyeLefe.setCenterX(111);
		circleEyeLefe.setCenterY(130);
		circleEyeLefe.setStroke(Color.BLACK);
		circleEyeLefe.setFill(Color.WHITE);
			Circle inEyeLefe = new Circle();
			inEyeLefe.setRadius(8);
			inEyeLefe.setCenterX(110);
			inEyeLefe.setCenterY(130);
			inEyeLefe.setStroke(Color.PINK);
			inEyeLefe.setFill(Color.BLACK);
		
		Circle circleEyeRight = new Circle();
		circleEyeRight.setRadius(15);
		circleEyeRight.setCenterX(180);
		circleEyeRight.setCenterY(130);
		circleEyeRight.setStroke(Color.BLACK);
		circleEyeRight.setFill(Color.WHITE);
			Circle inEyeRight = new Circle();
			inEyeRight.setRadius(8);
			inEyeRight.setCenterX(180);
			inEyeRight.setCenterY(130);
			inEyeRight.setStroke(Color.PINK);
			inEyeRight.setFill(Color.BLACK);
		
		Ellipse mouth = new Ellipse(150,200,20,10);
		mouth.setStroke(Color.PINK);
		mouth.setFill(Color.PINK);
		
		Polygon nose = new Polygon();
		nose.setStroke(Color.PINK);
		nose.setStrokeWidth(3);
		nose.setFill(Color.WHITE);
		ObservableList<Double> nlist = nose.getPoints();
		nlist.add(135.0);
		nlist.add(180.0);
		
		nlist.add(165.0);
		nlist.add(180.0);
		
		nlist.add(150.0);
		nlist.add(140.0);
		
		pane.getChildren().addAll(circle,circleEyeLefe,inEyeLefe,circleEyeRight,
				inEyeRight , mouth , nose);
		Scene scene = new Scene(pane,300,300);
		stage.setScene(scene);
		stage.setTitle("java khmer");
		stage.show();
	}

}
