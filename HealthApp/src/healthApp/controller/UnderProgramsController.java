package healthApp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import healthApp.model.healthApp;
import javafx.event.ActionEvent;

public class UnderProgramsController {
	@FXML
	private Button Favourites;
	@FXML
	private Button WorkoutHistory;
	@FXML
	private Button CusWrkout;
	@FXML
	private Button FixedWrkout;
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
			loader.setLocation((getClass().getResource("/healthApp/view/HomeView.fxml")));
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
	public void loadPreviousHome(ActionEvent event) throws IOException {
		
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/HomeView.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on Button[#Favourites].onAction
	@FXML
	public void goFav(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#WorkoutHistory].onAction
	@FXML
	public void goWrkoutHist(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/WorkoutHistory.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on Button[#CusWrkout].onAction
	@FXML
	
	public void goCusWrkout(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/CustConditionSelection.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		 Stage stage=(Stage)(myScene).getWindow();
		 Parent nextView=loader.load();
		 stage.setScene(new Scene(nextView));
		 stage.show();
	}
	// Event Listener on Button[#FixedWrkout].onAction
	@FXML
	public void goFixedWorkout(ActionEvent event) {
		// TODO Autogenerated
	}
}