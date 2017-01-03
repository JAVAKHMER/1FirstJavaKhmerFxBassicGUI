package com_javakhmer_9a_17_TestClockPane_www;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainClock extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ClockPane clockpane = new ClockPane();
		String timeString = clockpane.getHour() + ":" + clockpane.getMinute()+
				":" + clockpane.getSecond();
		Label lblTime = new Label(timeString);
		BorderPane pane = new BorderPane();
		pane.setCenter(clockpane);
		pane.setBottom(lblTime);
		BorderPane.setAlignment(lblTime, Pos.TOP_CENTER);
		Scene scene = new Scene(pane,250,250);
		stage.setScene(scene);
		stage.setTitle("clock java khmer");
		stage.show();
	}

}
