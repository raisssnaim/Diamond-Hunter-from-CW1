package application;
	
import java.io.File; 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class Main extends Application  {
	
	//  AnchorPane mainLayout;
	Button button;
	Button OK;
	static GraphicsContext gc;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	 @Override
	    public void start(Stage primaryStage) throws Exception{
		 
	        Parent root = FXMLLoader.load(getClass().getResource("Map.fxml"));
	        primaryStage.setTitle("Hello World");
	        primaryStage.setScene(new Scene(root, 400, 400));
	        primaryStage.show();
	        
	    }
	/*@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==OK){
			System.out.println("Hi");
		}
		
	}
*/

	
	
}
