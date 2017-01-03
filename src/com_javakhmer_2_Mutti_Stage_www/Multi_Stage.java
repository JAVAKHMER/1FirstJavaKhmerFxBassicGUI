package com_javakhmer_2_Mutti_Stage_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Multi_Stage extends Application{
	@SuppressWarnings("unused")
	private Button btnOk;
	public static void main(String[] args) {
		launch(args);
	}
	public Multi_Stage() {
		// TODO Auto-generated constructor stub
		System.out.println("Java khmer");
	}
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(btnOk = new Button("OK"),100,100);
		stage.setScene(scene);
		stage.setTitle("www.javakhmer/Multi_Stage.com");
		stage.show();
		Stage stage2 = new Stage();
		stage2.setTitle("Second Stage");
		Scene scene2 = new Scene(btnOk = new Button("OK"),100,100);
		stage2.setScene(scene2);
		stage2.setResizable(false);
		stage2.show();
		System.out.println("seconde java khmer");
	}

}
