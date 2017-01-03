package com_javakhmer_5_common_Property_and_Method_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RotatePane extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		StackPane pane = new StackPane();
		Button btnOk = new Button("khmer");
		btnOk.setStyle("-fx-border-color: green;");
		pane.getChildren().add(btnOk);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
		pane.setRotate(45);
		Scene scene = new Scene(pane,200,100);
		stage.setScene(scene);
		stage.show();
	}

}
