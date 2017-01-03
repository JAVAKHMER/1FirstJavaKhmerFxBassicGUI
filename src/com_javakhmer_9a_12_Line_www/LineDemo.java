package com_javakhmer_9a_12_Line_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new LinePane(),100,100);
		stage.setScene(scene);
		stage.setTitle("Line Pane java khmer");
		stage.show();
	}

}
class LinePane extends Pane{
	public LinePane() {
		
		// TODO Auto-generated constructor stub
		Line line1 = new Line(0,0,0,0);
		line1.endXProperty().bind(widthProperty());
		line1.endYProperty().bind(heightProperty());
		//System.out.println(widthProperty().subtract(10).doubleValue());
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);
		
		Line line2 = new Line(0,0,0,0);
		line2.startXProperty().bind(widthProperty());
		//System.out.println(widthProperty().subtract(10).doubleValue());
		line2.endYProperty().bind(heightProperty());
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		getChildren().add(line2);
	}
}
