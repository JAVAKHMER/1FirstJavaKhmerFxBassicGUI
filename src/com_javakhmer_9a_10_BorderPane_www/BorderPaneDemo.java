package com_javakhmer_9a_10_BorderPane_www;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		
		pane.setTop(new customPane("Border Top"));
		pane.setRight(new customPane("Borde Right"));
		pane.setLeft(new customPane("Border Left"));
		pane.setBottom(new customPane("Border Bottom"));
		pane.setCenter(new customPane("Border Center"));
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("BorderPane javakhemr");
		stage.show();
	}

}
 class customPane extends StackPane{
	public customPane(String title) {
		// TODO Auto-generated constructor stub
		getChildren().add(new Label(title));
		setStyle("-fx-border-color:green");
		setPadding(new Insets(10,10,10,10));
	}
}
