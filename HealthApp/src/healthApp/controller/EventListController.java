package healthApp.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import healthApp.data.EventDB;
import healthApp.model.Event;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventListController implements Initializable{
	@FXML
	private VBox eventVB;
	@FXML
	private Label eventLabel;
	@FXML
	private ImageView mainPage;
	@FXML
	private ImageView homePage;
	
	private String category;
	
	Path ERCCpath = FileSystems.getDefault().getPath("locationData", "EastRegionCCs.txt");
	File ERCCfile = new File(ERCCpath.toUri());
	
	Path NRCCpath = FileSystems.getDefault().getPath("locationData", "NorthRegionCCs.txt");
	File NRCCfile = new File(NRCCpath.toUri());
	
	private ArrayList<Event> eventList = new ArrayList<Event>();
	EventDB db = new EventDB();
	
	public void setCategory(String category) {
		this.category = category; 
	}
	
	private static Event eventButton;
	
	public static Event getButtonEvent() {
		return eventButton;
	}
	
	public void toHomepage(MouseEvent event) {
		try {
			Parent homePageLoader = FXMLLoader.load(getClass().getResource("/healthApp/view/HomepageView.fxml"));
			Scene homePageScene = new Scene(homePageLoader);
		
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(homePageScene);
			window.show();
		}
		
		catch(IOException e) {
		}
	}
	
	public void toMainPage(MouseEvent event) {
		// TODO Autogenerated
		try {
			Parent mainPageLoader = FXMLLoader.load(getClass().getResource("/healthApp/view/SocialFunctionView.fxml"));
			Scene mainPageScene = new Scene(mainPageLoader);
		
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(mainPageScene);
			window.show();
		}
		
		catch(IOException e) {
		}
	}
	
	public void toLocationPage(MouseEvent event) {
		try {
			Parent locationPageLoader = FXMLLoader.load(getClass().getResource("/healthApp/view/LocationView.fxml"));
			Scene locationPageScene = new Scene(locationPageLoader);
		
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(locationPageScene);
			window.show();
		}
		
		catch(IOException e) {
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		String category = SocialFunctionController.getCategory();
		System.out.println("Social");
		String regionalLocation = LocationController.getLocation();
		
		if(regionalLocation.equals("Empty")) {
			
			if(category.equals("Community Work")) {
				eventLabel.setText("Community");
			}
			else if(category.equals("Information & Technology")) {
				eventLabel.setText("Technology");
			}
			else {
				eventLabel.setText(category);
			}
			int counter = 0;
			eventList = db.getEventsByCategory(category);
			System.out.println(eventList.toString());
			System.out.println(eventList.get(0).getCategory().toString());
			
			for(Event event : eventList) {
				Button b = new Button();
				b.setText(event.getName());
				b.setPrefSize(320, 70);
				VBox.setVgrow(b, Priority.ALWAYS);
				eventVB.getChildren().add(b);
				
				b.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent e) {
						Parent eventLoader;
						try {
							eventButton = db.getEvent(event.getName());
							
							if(eventButton == null) {
								Alert eAlert = new Alert(Alert.AlertType.ERROR);
								eAlert.setHeaderText("There is an error");
								eAlert.setContentText("The arraylist is null");
								eAlert.show();
							}
							
							eventLoader = FXMLLoader.load(getClass().getResource("/healthApp/view/EventView.fxml"));
							Scene eventScene = new Scene(eventLoader);
							
							Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
							window.setScene(eventScene);
							window.show();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				counter++;
				if(counter > 7) {
					System.out.println("working");
					eventVB.setPrefHeight(eventVB.getHeight() + 70);
				}
			}
		}
		
		else {
			ArrayList<String> CCArray = new ArrayList<String>();
			if(regionalLocation.equals("North")) {
				try(Scanner in = new Scanner(NRCCfile)){
					while(in.hasNextLine()) {
						CCArray.add(in.nextLine());
					}
				}
				catch(FileNotFoundException e ) {
					e.printStackTrace();
				}
			}
		
			if(regionalLocation.equals("East")) {
				try(Scanner in = new Scanner(ERCCfile)){
					while(in.hasNextLine()) {
						CCArray.add(in.nextLine());
					}
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		
			if(category.equals("Community Work")) {
				eventLabel.setText("Community");
			}
			else if(category.equals("Information & Technology")) {
				eventLabel.setText("Technology");
			}
			else {
				eventLabel.setText(category);
			}
		
			for(String s : CCArray) {
				eventList = db.getEventsByCategoryCCs(s, category);
			}
		
			int counter = 0;
		
			for(Event event : eventList) {
				Image eImg = new Image(event.getImagePath());
				ImageView eImgView = new ImageView();
				eImgView.setImage(eImg);
				
				Button b = new Button(event.getName(), eImgView);
				b.setPrefSize(320, 70);
				VBox.setVgrow(b, Priority.ALWAYS);
				eventVB.getChildren().add(b);
			
				b.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent e) {
						Parent eventLoader;
						try {
							eventButton = db.getEvent(event.getName());
						
							if(eventButton == null) {
								Alert eAlert = new Alert(Alert.AlertType.ERROR);
								eAlert.setHeaderText("There is an error");
								eAlert.setContentText("The arraylist is null");
								eAlert.show();
							}
						
							eventLoader = FXMLLoader.load(getClass().getResource("/healthApp/view/EventView.fxml"));
							Scene eventScene = new Scene(eventLoader);
						
							Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
							window.setScene(eventScene);
							window.show();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}	
					}
				});
				counter++;
				if(counter > 7) {
					System.out.println("working");
					eventVB.setPrefHeight(eventVB.getHeight() + 70);
				}
			}
		}
	}
}
