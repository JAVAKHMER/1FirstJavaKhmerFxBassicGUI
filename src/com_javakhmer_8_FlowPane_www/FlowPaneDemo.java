package com_javakhmer_8_FlowPane_www;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FlowPane pane = new FlowPane();
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setPadding(new Insets(11,12,13,14));
		pane.getChildren().addAll(new Label("FirstName:"),
				new TextField(), new Label("MI:"));
		TextField tfi =new TextField();
		tfi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfi,new Label("LastName"),new TextField());
		Scene scene = new Scene(pane,300,100);
		stage.setScene(scene);
		stage.setTitle("Flow Pane Demo ");
		stage.show();
	}

}
