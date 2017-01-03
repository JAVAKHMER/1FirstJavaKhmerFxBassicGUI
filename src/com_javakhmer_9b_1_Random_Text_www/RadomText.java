package com_javakhmer_9b_1_Random_Text_www;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadomText extends Application {

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Scene scene = new Scene(pane,300,300,Color.GRAY);
		Random random = new Random(System.currentTimeMillis());
		for(int i = 0 ; i< 100 ; i++){
			int x = random.nextInt((int)scene.getWidth());
			int y = random.nextInt((int)scene.getHeight());
			int red = random.nextInt(255); 
			int green = random.nextInt(255); 
			int blue = random.nextInt(255); 
			Text text = new Text(x, y, "Java khmer 2015"); 
			int rot = random.nextInt(360); 
			text.setFill(Color.rgb(red, green, blue, 0.99)); 
			text.setRotate(rot);
			pane.getChildren().add(text);
		}
		primaryStage.setTitle("Random Text java khmer");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
