package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("테스트 용");
		Button btn=new Button();
		btn.setText("누르지마");
		btn.setOnAction(new EventHandler<actionevent>() {

			@Override
			public void handle(actionevent event) {
				// TODO Auto-generated method stub
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("alert!");
				alert.setContentText("alll");
				alert.setHeaderText(null);
				alert.show();
			}
			
		});
		
		StackPane sp=new StackPane();
		sp.getChildren().addAll(btn);
		stage.setScene(new Scene(sp,500,300));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
