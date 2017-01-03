package com_javakhmer_9a_19_wave_www;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WaveDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		pane.setPadding(new Insets(20,20,20,20));
		
		Polyline wave = new Polyline();
		wave.setLayoutX(50.5);
		wave.setLayoutY(300.5);
		wave.setStrokeWidth(1);
		//wave.setRotate(60);
		wave.setStroke(Color.GREEN);
		ObservableList<Double> wlist = wave.getPoints();
		for(double i = 0 ; i<750 ; i++)
		{
			wlist.add(i);
			wlist.add(100*Math.sin(2*i*Math.PI/180));
		}
		Line lineX = new Line(20.0, 300.0, 850, 300.0);
		lineX.setStroke(Color.BLACK);
		
		Line lineY = new Line(410.0 , 20.0 , 410.0 , 600);
		lineY.setStroke(Color.BLACK);
		
		Polygon hardX = new Polygon();
		hardX.setStroke(Color.BLACK);
		hardX.setFill(Color.WHITE);
		ObservableList<Double> hx = hardX.getPoints();
		
		hx.add(850.0);
		hx.add(310.0);
		
		hx.add(850.0);
		hx.add(290.0);
		
		hx.add(860.0);
		hx.add(300.0);
		
		Polygon hardY = new Polygon();
		hardY.setStroke(Color.BLACK);
		hardY.setFill(Color.WHITE);
		ObservableList<Double> hy = hardY.getPoints();
		
		hy.add(410.0);
		hy.add(5.0);
		
		hy.add(400.0);
		hy.add(20.0);
		
		hy.add(420.0);
		hy.add(20.0);
		
		String i ="";
		for(int k = 0 ; k < 5 ; k++){
			i = k+"";
			Text numXR = new Text(400+95*k,295,i);
			pane.getChildren().add(numXR);
		}
		String a = "";
		for(int b = 1 ; b < 4 ; b ++)
		{
			a = "-" + b;
			Text numXL = new Text(400 - 95*b , 295 , a);
			pane.getChildren().add(numXL);
		}
		
		Text arcX = new Text(850.0, 280.0 , "X");
		arcX.setStroke(Color.RED);
		
		Text arcY = new Text(430.0 , 20.0 , "Y");
		arcY.setStroke(Color.RED);
		
		pane.getChildren().addAll(wave,lineX,lineY,hardX,hardY,arcX,arcY);
		Scene scene = new Scene(pane,900,650);
		stage.setScene(scene);
		stage.setTitle("java khmer By huot panharith");
		stage.show();
		
	}

}
