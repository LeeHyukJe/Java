package application;
	


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox hbox=new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);
		
		TextField textfield=new TextField();
		textfield.setPrefWidth(200);
		
		Button btn=new Button();
		btn.setText("confirm");
		
		ObservableList<Node> list=hbox.getChildren();
		list.add(textfield);
		list.add(btn);
		Scene scene=new Scene(hbox);
		
		
		primaryStage.setTitle("HBOxExam");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
