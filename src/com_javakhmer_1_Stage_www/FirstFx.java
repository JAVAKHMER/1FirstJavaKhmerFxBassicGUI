package com_javakhmer_1_Stage_www;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FirstFx extends Application {
	@SuppressWarnings("unused")
	private Button btnOk;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage s) throws Exception {
		Scene scene = new Scene(btnOk=new Button("OK"),100,100);
		s.setScene(scene);
		s.setTitle("Java Khmer love you.");
		s.show();
	}

}
