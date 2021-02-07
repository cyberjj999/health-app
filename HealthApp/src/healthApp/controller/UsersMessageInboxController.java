package healthApp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import healthApp.data.AdminMessageDB;
import healthApp.data.UsersMapDB;
import healthApp.data.UsersMessageDB;
import healthApp.model.AdminMessage;
import healthApp.model.Users;
import healthApp.model.UsersMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UsersMessageInboxController implements Initializable {
	private static String loggedInUser;
	
	public String getLoggedInUser() {
		return loggedInUser;
	}



	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	@FXML
	private VBox vBox;

	private Scene myScene;
	

	@FXML
	private Button refreshBtn;
	

	  @FXML
	  private ImageView backBtn;
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
	// TODO Autogenerated
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/HomepageView.fxml")));
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
			
			
	
	public void addToVbox() throws IOException{
		AdminMessageDB AdminMsgDB = new AdminMessageDB();
		ArrayList <AdminMessage> allAdminMsg = new ArrayList<AdminMessage>(AdminMsgDB.getMap().values());

		//check if the msg belongs to this user
		//put inside a new arraylist
		//then use a for loop to show the msgs
	
		//	for(AdminMessage msg : allAdminMsg)
		if(allAdminMsg.isEmpty())
			vBox.getChildren().add(new Label("You do not have any messages!"));
		
		else {
			ArrayList <UsersMessage> treeviewData = createNewObjects();
			ArrayList <AdminMessage> adminMsgAL = createNewAdminObjects();
			System.out.println(adminMsgAL);

		for(int i=0;i<adminMsgAL.size();i++) {
			//System.out.println(allAdminMsg.get(i	).getUserID());
			Button newButton = new Button("Admin has replied to your msg sent on " + adminMsgAL.get(i).getDate());
			newButton.setWrapText(true);
			newButton.setStyle("-fx-border-color: #17202A; -fx-border-width: 3px;-fx-background-color:pink;");
			UsersMessageDB UsersMsgDB = new UsersMessageDB();
			
		
			UsersMapDB usersDB = new UsersMapDB();
			Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
		
			
			if(UsersMsgDB.getUsersMessage(loggedInUser.getEmail())!=null)   {
			//UsersMsgDB.getUsersMessage("User1");
				Label smallDivisor = new Label("");
				smallDivisor.setMaxHeight(6);
				smallDivisor.setMinHeight(5);
				
				
			vBox.getChildren().add(newButton);
			vBox.getChildren().add(smallDivisor);
			UsersMessage U1 = UsersMsgDB.getUsersMessage(loggedInUser.getEmail());
			System.out.println(U1);
			
			final int innerMi = i;
			newButton.addEventHandler(MouseEvent.MOUSE_CLICKED,e->{
				
				String UserID = treeviewData.get(innerMi).getUserID();
				String userMsgDate = treeviewData.get(innerMi).getDateTV();
				String experience = treeviewData.get(innerMi).getExperienceTV();
				String category = treeviewData.get(innerMi).getCategoryTV();
				String usersMsg = treeviewData.get(innerMi).getMessageTV();
				String adminReply = adminMsgAL.get(innerMi).getMessage();
				String adminDate = adminMsgAL.get(innerMi).getDate();
				
				Stage primaryStage = new Stage();
				FXMLLoader loader=new FXMLLoader();
				loader.setLocation(getClass().getResource("/healthApp/view/UsersMessageInboxDetails.fxml"));		
				Parent root;
				try {
					root = loader.load();
					Scene scene=new Scene(root);
					primaryStage.initModality(Modality.APPLICATION_MODAL);
					primaryStage.setScene(scene);
					primaryStage.show();
					
					UsersMessageInboxDetailsController uMID = loader.getController();
				
					uMID.setAdminDateLabel(adminDate);
					System.out.println(category);
					uMID.setAdminResponseTextArea(adminReply);
					uMID.setCategoryTextField(category);
					uMID.setExperienceTextField(experience);
					uMID.setFeedbackTextArea(usersMsg);
					uMID.setUserDateLabel(userMsgDate);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
					
			
		
				
				
				
				
				});
			}
			
			else {
				System.out.println("Error!");
				System.out.println("Means thr isnt User1");
				}
		
			}
		}
	}







	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		refreshBtn.setStyle("-fx-border-color: #17202A; -fx-border-width: 3px;-fx-background-color:pink;");
		// TODO Auto-generated method stub
		try {
			createNewObjects();
			addToVbox();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
public ArrayList <UsersMessage> createNewObjects() {
		
	
	UsersMapDB usersDB = new UsersMapDB();
	Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
	System.out.println("The logged in User is " + loggedInUser.getName());
	System.out.println("The email of the logged in User is : " + getLoggedInUser());
	
		UsersMessageDB UsersMsgDB = new UsersMessageDB();
		if(UsersMsgDB.getUsersMessage(loggedInUser.getEmail())==null)
			UsersMsgDB.addUsersMessage(new UsersMessage(loggedInUser.getEmail(),new ArrayList <String>(),new ArrayList <String>(),new ArrayList <String>(),new ArrayList <String>()));
		
		
		UsersMessage UserMessage1 = UsersMsgDB.getUsersMessage(loggedInUser.getEmail());
		ArrayList <String> message = UserMessage1.getMessage();
		ArrayList <String> experience = UserMessage1.getExperience();
		ArrayList <String> categoryAL = UserMessage1.getCategory();
		ArrayList <String> date = UserMessage1.getDate();
		//ArrayList <RadioButton> select = UserMessage1.getSelect();
		ArrayList <UsersMessage> userMessageAL = new ArrayList <UsersMessage>();
		//for actual implementation
		//for EACH user , you must run this code
		//then get the SAME user arraylist and store it in
		
		for (int i=0;i<message.size();i++) {	//,select.get(i)
			
			//sub "User1" with loggedInUser.getEmail()
			UsersMessage newUser = new UsersMessage(loggedInUser.getEmail(),experience.get(i),categoryAL.get(i),message.get(i),date.get(i));
		
			
			userMessageAL.add(newUser);
			
			
		}
		
		return userMessageAL;
		
	}


*/

/*
	public ArrayList <AdminMessage> createNewAdminObjects() {
	
	
		UsersMapDB usersDB = new UsersMapDB();
		Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
		System.out.println("The logged in User is " + loggedInUser.getName());
		System.out.println("The email of the logged in User is : " + getLoggedInUser());
		
	AdminMessageDB AdminMsgDB = new AdminMessageDB();
	if(AdminMsgDB.getAdminMessage(loggedInUser.getEmail())==null)
		AdminMsgDB.addAdminMessage(new AdminMessage(loggedInUser.getEmail(),new ArrayList<String>(),new ArrayList<String>()));
	
	
	AdminMessage AdminMessage1 = AdminMsgDB.getAdminMessage(loggedInUser.getEmail());
	ArrayList <String> messageAL = AdminMessage1.getMessageAL();

	ArrayList <String> dateAL = AdminMessage1.getDateAL();
	//ArrayList <RadioButton> select = UserMessage1.getSelect();
	ArrayList <AdminMessage> AdminMessageAL = new ArrayList <AdminMessage>();
	//for actual implementation
	//for EACH user , you must run this code
	//then get the SAME user arraylist and store it in
	
	for (int i=0;i<messageAL.size();i++) {	//,select.get(i)
		
		//sub "User1" with loggedInUser.getEmail()
		AdminMessage newAdmin = new AdminMessage(loggedInUser.getEmail(),messageAL.get(i),dateAL.get(i));
	
		
		AdminMessageAL.add(newAdmin);
		
		
	}
	
	return AdminMessageAL;
	
}

*/

public ArrayList <UsersMessage> createNewObjects() {
		
		
		UsersMapDB usersDB = new UsersMapDB();
		ArrayList <Users> allUsers = new ArrayList<Users>(usersDB.getMap().values());

		Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
		UsersMessageDB UsersMsgDB = new UsersMessageDB();


		
		ArrayList <UsersMessage> userMessageAL = new ArrayList <UsersMessage>();

	
			if(UsersMsgDB.getUsersMessage(loggedInUser.getEmail()) == null){
				System.out.println("There is no such thing");
			}
			
			//that particular user has a msg , or two or more
			//here alr selected that FIRST user or SECOND user
			//now its just to retrieve it based on its email
			else {
				//for(UsersMessage uMsg : UsersMsgDB.getUsersMessage(u.getEmail()).getMessage())  {
				//UsersMessage UserMessageAL = new UsersMessage();
					ArrayList <String> message = UsersMsgDB.getUsersMessage(loggedInUser.getEmail()).getMessage();
					ArrayList <String> experience = UsersMsgDB.getUsersMessage(loggedInUser.getEmail()).getExperience();
					ArrayList <String> categoryAL = UsersMsgDB.getUsersMessage(loggedInUser.getEmail()).getCategory();
					ArrayList <String> date = UsersMsgDB.getUsersMessage(loggedInUser.getEmail()).getDate();
					
					for (int i=0;i<message.size();i++) {	
						
						UsersMessage newUser = new UsersMessage(loggedInUser.getEmail(),experience.get(i),categoryAL.get(i),message.get(i),date.get(i));
				
						userMessageAL.add(newUser);
					}
					
			}
			
			System.out.println("Normal object arraylist: " + userMessageAL);

		return userMessageAL;

	}

		@FXML
		void refresh(ActionEvent event) throws IOException {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation((getClass().getResource("/healthApp/view/UsersMessageInbox.fxml")));
			 myScene=(Scene)((Node)event.getSource()).getScene();
			 Stage stage=(Stage)(myScene).getWindow();
			 Parent nextView=loader.load();
			 stage.setScene(new Scene(nextView));
			 stage.show();
		}

public ArrayList <AdminMessage> createNewAdminObjects() {
	
	//	public UsersMessage(String UserID,String experienceTV,String categoryTV,String messageTV,String dateTV) {
	//public UsersMessage(String userID,ArrayList<String> message,ArrayList <String> experinece, ArrayList <String> category,ArrayList <String> date){
	
	UsersMapDB usersDB = new UsersMapDB();
	ArrayList <Users> allUsers = new ArrayList<Users>(usersDB.getMap().values());
	AdminMessageDB AdminMsgDB = new AdminMessageDB();
	ArrayList <AdminMessage> allAdminMsg = new ArrayList<AdminMessage>(AdminMsgDB.getMap().values());

	ArrayList <AdminMessage> AdminMessageAL = new ArrayList <AdminMessage>();
	Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
	UsersMessageDB UsersMsgDB = new UsersMessageDB();


	
		//check if users has a message - inside usersMsgDB
		//if they never send , means dh , so no need to create
		if(AdminMsgDB.getAdminMessage(loggedInUser.getEmail())==null){
			
		}
		
		//that particular user has a msg , or two or more
		//here alr selected that FIRST user or SECOND user
		//now its just to retrieve it based on its email
		else {
			//for(UsersMessage uMsg : UsersMsgDB.getUsersMessage(u.getEmail()).getMessage())  {
			//UsersMessage UserMessageAL = new UsersMessage();
				ArrayList <String> message = AdminMsgDB.getAdminMessage(loggedInUser.getEmail()).getMessageAL();
				ArrayList <String> date = AdminMsgDB.getAdminMessage(loggedInUser.getEmail()).getDateAL();
				
				
					for (int i=0;i<message.size();i++) {	
					
				AdminMessage newAdmin = new AdminMessage(loggedInUser.getEmail(),message.get(i),date.get(i));
			
				AdminMessageAL.add(newAdmin);
					
					}	
			
				}
		
		System.out.println("Admin object arraylist: " +AdminMessageAL);

	return AdminMessageAL;
	

	}




}