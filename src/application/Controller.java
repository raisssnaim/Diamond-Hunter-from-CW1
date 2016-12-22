package application;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL; 
import java.util.ResourceBundle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.neet.DiamondHunter.Entity.Item;
import com.neet.DiamondHunter.TileMap.TileMap;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Controller implements Initializable {
    
	private int[][] map;
	private int mapWidth;
	private int mapHeight;
	static GraphicsContext gc;
	Item items;
	
	
	@FXML
    private Button OK;

    @FXML
    private TextField axex;

    @FXML
    private TextField axey;

    @FXML
    private TextField boatx;

    @FXML
    private TextField boaty;
    
    @FXML ImageView myImage;
    private TileMap tileMap;
    
    @FXML
    private Canvas canvas;
    
	
	 public void initialize(URL location, ResourceBundle resources) {
	        System.out.println("View is now loaded!");
	 }
	 @SuppressWarnings("resource")
	public void OkButtonClicked() throws FileNotFoundException{
		 /*Scanner file = new Scanner (new File("C:/Users/vaio/Documents/Computer Science/Year 2/Software Maintenance/Diamond Hunter/Resources/Maps/map2.map"));
		
		 System.out.println(file.nextLine());
		 System.out.println(file.nextLine());
		 System.out.println("Value Added");		*/
		 //getWindow();
	           // Label secondLabel = new Label("Hello");
	           /* StackPane secondaryLayout = new StackPane();
	            secondaryLayout.getChildren();
	            Scene secondScene = new Scene(secondaryLayout, 400, 400);*/
	            Stage secondStage = new Stage();
	           /* secondStage.setTitle("Map Viewer");
	            secondStage.setScene(secondScene);             
	            secondStage.show();*/
	            
	                secondStage.setTitle("Hello World");
	                StackPane root = new StackPane();
	                Scene scene = new Scene(root, 300, 250);
	                
	                tileMap.loadMap("/Maps/map2.map");
	                
	                //tileMap = new TileMap(mapHeight);

	                File file = new File("C:/Users/vaio/Documents/Computer Science/Year 2/Software Maintenance/Diamond Hunter/Resources/Maps/map2.map");
	                Image image = new Image(file.toURI().toString());
	                ImageView iv = new ImageView(image);

	                root.getChildren().add(iv);
	                secondStage.setScene(scene);
	                secondStage.show();
	 }
	/* DropShadow shadow = new DropShadow();
	 myImage.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent e)->{
		 myImage.setEffect(shadow);	});*/
	public void OnMouseClicked(){
		
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillRect(30,30,100,100);
		
		//tileMap.draw(gc);
		System.out.println("Hi");
		
	}
	 
	
	/*	@FXML public void onLoadImage() {
			Image i = new Image("map.png");
			myImage.setImage(i);
			tileMap.loadMap("/Maps/testmap.map");
		}*/
	
	    
	 
		
		public void nAxexInput(){
			System.out.println("");
		}

		
	
	}

