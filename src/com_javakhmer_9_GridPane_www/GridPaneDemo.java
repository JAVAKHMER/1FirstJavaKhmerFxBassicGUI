package com_javakhmer_9_GridPane_www;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(16,16,16,16));
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
		pane.add(new Label("FirstName:"),0,0);
		pane.add(new TextField(),1,0);
		pane.add(new Label("LastName:"),0,1);
		pane.add(new TextField(),1,1);
		Button btn = new Button("Button");
		pane.add(btn,1,2);
		pane.setHalignment(btn, HPos.RIGHT);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Grid Pane JavaKhmer");
		stage.show();
	}

}
