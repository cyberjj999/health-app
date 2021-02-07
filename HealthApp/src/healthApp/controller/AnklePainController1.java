package healthApp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import healthApp.model.WorkoutAnklePain;
import healthApp.model.healthApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import healthApp.controller.AnklePainController1;
import healthApp.data.WorkoutAnklePainDB;





public class AnklePainController1 extends ExerciseListController{
	
	@FXML
	private Button CalfStretch;
	
	@FXML
	private Button HeelSitBacks;
		
	@FXML
	private Button BallRoll;
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
   
	private Scene myScene;
	   @FXML
	    void goBack(MouseEvent event) throws IOException {

	    	FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/CustConditionSelection.fxml")));
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
	
	
	String count;
	
	WorkoutAnklePain WAP = new WorkoutAnklePain();
	WorkoutAnklePainDB WAPDB = new WorkoutAnklePainDB();	
	
	
	
	ArrayList<WorkoutAnklePain> Exercises = WAPDB.getAllAnkleExercises();
	
	private ArrayList<String> Anklelist = new ArrayList<String>();
	
	public void loadCust(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/CustConditionSelection.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
		
	}
	
//	ArrayList<WorkoutAnklePain> AnkleList = new ArrayList<>();
	
	// Event Listener on Button.onMouseClicked
	@FXML
	public void addCalfStretch(MouseEvent event) {
		Anklelist.add("Calf Stretch");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void addHeelSitBacks(MouseEvent event) {
		Anklelist.add("Heel Sit Backs");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void addBallRoll(MouseEvent event) {
		Anklelist.add("Ball Roll");
	}
	
	@FXML
	public void addAnkleExercises(MouseEvent event) throws IOException {
		
         WorkoutAnklePain Ankledata = new WorkoutAnklePain();
         ArrayList <String> AnkleList = Ankledata.getAnklelist();
       
         Ankledata.setID("AnklePain1");
       AnkleList = Anklelist;
       Ankledata.setAnklelist(AnkleList);
       WAPDB.addAnkleExerciseX(Ankledata);
       
         System.out.print(Ankledata);
         
         

		//AnkleExercise.goCustomisedWorkout();

	}
	
	

}
