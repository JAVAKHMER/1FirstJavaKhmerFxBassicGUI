package com_javakhmer_7_imgeView_com;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class ImageViewClass extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		Pane p = new HBox(10);
		p.setPadding(new Insets(5,5,5,5));
		Image imge = new Image("img/win1.jpg");
		ImageView imgView = new ImageView(imge);
		p.getChildren().add(imgView);
		ImageView imgViewRotate = new ImageView(imge);
		imgViewRotate.setRotate(90);
		p.getChildren().add(imgViewRotate);
		ImageView imgViewFit = new ImageView(imge);
		imgViewFit.setFitHeight(200);
		imgViewFit.setFitWidth(200);
		p.getChildren().add(imgViewFit);
		Scene s = new Scene(p);
		stage.setScene(s);
		stage.show();
	}

}
