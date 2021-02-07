package healthApp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import healthApp.data.WorkoutAnklePainDB;
import healthApp.data.WorkoutBackPainDB;
import healthApp.data.WorkoutNeckPainDB;
import healthApp.model.healthApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;


public class CustConditionSelectionController implements Initializable{
	
	

	private String typeOfCondition;
	@FXML
	private ChoiceBox<String> custConditionList;
	// Event Listener on Button.onAction
	@FXML
	private Button ConfirmationButton;
	@FXML
	private Button BeginWorkout;
	@FXML
	private Scene myScene;
	@FXML
	private Stage stage;
	@FXML
	private Button Physio;
	@FXML
	private Button Programs;
    @FXML
    private ImageView backBtn;
    @FXML
    private ImageView locationBtn;
    @FXML
	private ImageView reminderBtn;
	@FXML
	private ImageView exerciseBtn;
	@FXML
	private ImageView homeBtn;
	@FXML
	private ImageView foodBtn;
	@FXML
	private ImageView socialBtn;
   
	   @FXML
	    void goBack(MouseEvent event) throws IOException {

	    	FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/UnderPrograms.fxml")));
			 myScene=(Scene)((Node)event.getSource()).getScene();
			 Stage stage=(Stage)(myScene).getWindow();
			 Parent nextView=loader.load();
			 stage.setScene(new Scene(nextView));
			 stage.show();
	    }
    
	@FXML
	public void goLocation(MouseEvent event) throws IOException {

		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on ImageView[#reminderBtn].onMouseClicked
	@FXML
	public void goReminder(MouseEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on ImageView[#exerciseBtn].onMouseClicked
	@FXML
	public void goExercise(MouseEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on ImageView[#homeBtn].onMouseClicked
	@FXML
	public void goHome(MouseEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/HomepageView.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on ImageView[#foodBtn].onMouseClicked
	@FXML
	public void goFood(MouseEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on ImageView[#socialBtn].onMouseClicked
	@FXML
	public void goSocial(MouseEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
		 myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	@FXML
	public void goPrograms(ActionEvent event) throws IOException {

		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/UnderPrograms.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}

	// The choices for the drop down button
	ObservableList<String> Conditions = FXCollections.observableArrayList("Back Pain","Ankle Pain", "Neck Pain");
	
	
	
	// getting data from choice box, meaning when they click
	
	private String getconditionList() {
		String condition = custConditionList.getValue();
		 if(condition == null) {
				Alert alert2 = new Alert(AlertType.WARNING);
	            alert2.setTitle("Validate Input");
	            alert2.setHeaderText (null);
	            alert2.getDialogPane().setPrefSize(335, 600);
	            alert2.setContentText("Please select your condition.");
	            alert2.showAndWait();
	            alert2.close();
	            
	            return condition;
		 } 
		 
		this.typeOfCondition = condition;
		return this.typeOfCondition;
		
	}
	// Putting the data in the choice box
	private void loadData() {
		Conditions.removeAll(Conditions);
		String backpain = "Back Pain";
		String anklepain = "Ankle Pain";
		String neckpain = "Neck Pain";
		Conditions.addAll(backpain,anklepain,neckpain);
		custConditionList.getItems().addAll(Conditions);
		
	}
	@FXML
	public void displayExercise(ActionEvent event) throws IOException {
		//mayb is this one? //idk how did uload it
		//at first?
		// this method is once they click finish ok i forgot where brb
		//loadConditionExercise(getconditionList());
		if(getconditionList() == null) {
			
		}
		
		if(typeOfCondition.equals("Back Pain")) {
			
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/BackPain.fxml")));
			Scene myScene=(Scene)((Node)event.getSource()).getScene();
			Stage stage=(Stage)(myScene).getWindow();
			Parent nextView=loader.load();
			stage.setScene(new Scene(nextView));
			stage.show();
			
			/*FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("/healthApp/view/BackPain.fxml"));
			Parent root=loader.load();
			Scene scene = new Scene(root);
			Stage stage=(Stage)(scene).getWindow();
			stage.setScene(scene);
			stage.show();
			*/
			//i tink the code no issue leh
			 
		}
		if(typeOfCondition.equals("Ankle Pain")) {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/AnklePain.fxml")));
			Scene myScene=(Scene)((Node)event.getSource()).getScene();
			Stage stage=(Stage)(myScene).getWindow();
			Parent nextView=loader.load();
			stage.setScene(new Scene(nextView));
			stage.show();
			
			
		}
		if(typeOfCondition.equals("Neck Pain")) {
			//healthApp NeckExercise = new healthApp();
			//NeckExercise.goNeckPain();
			
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/NeckPain.fxml")));
			Scene myScene=(Scene)((Node)event.getSource()).getScene();
			Stage stage=(Stage)(myScene).getWindow();
			Parent nextView=loader.load();
			stage.setScene(new Scene(nextView));
			stage.show();
			
		}
		
	}
	/*
	public void loadConditionExercise(String exercises) throws IOException {
		if(typeOfCondition.equals("Back Pain")) {
			
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("/healthApp/view/BackPain.fxml"));
			Parent root=loader.load();
			Scene scene = new Scene(root);
			Stage stage=(Stage)(scene).getWindow();
			stage.setScene(scene);
			stage.show();
			//i tink the code no issue leh
			 
		}
		if(typeOfCondition.equals("Ankle Pain")) {
			//healthApp AnkleExercise = new healthApp();
			//AnkleExercise.goAnklePain();
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("/healthApp/view/AnklePain.fxml"));
			Parent root=loader.load();
			Scene scene = new Scene(root);
			Stage stage=(Stage)(scene).getWindow();
			stage.setScene(scene);
			stage.show();
			
		}
		if(typeOfCondition.equals("Neck Pain")) {
			//healthApp NeckExercise = new healthApp();
			//NeckExercise.goNeckPain();
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(getClass().getResource("/healthApp/view/NeckPain.fxml"));
			Parent root=loader.load();
			Scene scene = new Scene(root);
			Stage stage=(Stage)(scene).getWindow();			
			stage.setScene(scene);
			stage.show();
			
		}
		

		

	}
	*/
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		loadData();

	}
	
    @FXML
    void startWorkout(ActionEvent event) throws IOException {
    	
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/ExerciseList.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
		 
		 // 
		 ExerciseListController eLC = loader.getController();
		 
		WorkoutAnklePainDB WAPDB = new WorkoutAnklePainDB();	
		WorkoutBackPainDB WBPDB = new WorkoutBackPainDB();
		WorkoutNeckPainDB WNPDB = new WorkoutNeckPainDB();
			
		
		 // this is the method to add the content to vbox
		if(WAPDB == null && WBPDB == null && WNPDB == null) {
			
		} 
		if(WAPDB !=null) {
		 eLC.addToVbox(WAPDB.getAnkleExercise("AnklePain1").getAnklelist(),WBPDB.getBackExercise("BackPain1").getBacklist(),WNPDB.getNeckExercise("NeckPain1").getNecklist());
		}
    }
}
