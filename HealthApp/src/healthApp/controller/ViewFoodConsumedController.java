package healthApp.controller;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import healthApp.data.UsersFoodConsumptionDB;
import healthApp.data.UsersMapDB;
import healthApp.model.Food;
import healthApp.model.Users;
import healthApp.model.UsersFoodConsumption;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ViewFoodConsumedController implements Initializable{
	private static String loggedInUser;
	
	public String getLoggedInUser() {
		return loggedInUser;
	}



	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

    @FXML
    private VBox vBox;
    
    @FXML
    private VBox vBox2;

    @FXML
    private Label totalCaloriesLabel;

    @FXML
    private Label totalFatsLabel;

    @FXML
    private Label totalProteinLabel;

    @FXML
    private Label totalCarbsLabel;
    @FXML
    private Label totalSodiumLabel;

    @FXML
    private Label totalSugarLabel;

    @FXML
    private Label totalCholesterolLabel;
    
    @FXML
    private Button testBtn;
    
    @FXML
    private VBox vBox3;
    
    private Scene myScene;

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
	FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/NutritionTrackingHomepage.fxml")));
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
    void doSomething(ActionEvent event) throws IOException {
    	
    	/*here
		 * UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
		 *	Users loggedInUser = UsersFoodDB.checkLoggedIn;
		 * if(UsersFoodDB.getUsers(loggedInUser.getEmail()==null){
		 * new UsersFoodConsumption(loggedInUser.getEmail(),new ArrayList <Food>(),new ArrayList <Integer>(),new ArrayList<String>())
		 * }
		 * 
		 * to here
		 */
    	
    	/*
    	 * if UsersFoodDB.getUsers(loggedInUser.getEmail())==null){
    	 * else
    	 * UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers(loggedInUser.getEmail());
    	 */
    	

		UsersMapDB usersDB = new UsersMapDB();
		Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
	
		
    	UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
    	if(UsersFoodDB.getUsers(loggedInUser.getEmail())==null) {
    		
    	}
    	
    	else {
		UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers(loggedInUser.getEmail());
		ArrayList <Food> FoodArrayList = UserFood1.getFoodArrayList();
		ArrayList <Integer> PortionArrayList = UserFood1.getPortionArrayList();
		ArrayList <String> DateArrayList = UserFood1.getDateArrayList();
    	for(int i=0;i<FoodArrayList.size();i++) {
			if(FoodArrayList.get(i).getName().equals("ERRORxERROR")) {
				FoodArrayList.remove(i);
				
				System.out.println("Some of ur element is named ERRORxERROR");
			}
			else {
				System.out.println("Nothing has changed!");
			}
			
		for(int j=0;j<PortionArrayList.size();j++) {
			
				if(PortionArrayList.get(j)== 99) {
					System.out.println("You have 99 in ur arraylist");
					PortionArrayList.remove(j);
				}
				else 
					System.out.println("Nothing has changed!");
			}
		
		for(int k=0;k<DateArrayList.size();k++) {
			
			if(DateArrayList.get(k).equals("Nothing")){
				System.out.println("You have 99 in ur arraylist");
				DateArrayList.remove(k);
			}
			else 
				System.out.println("Nothing has changed!");
		}
		}
    	System.out.println(UserFood1.getFoodArrayList());
    	UsersFoodDB.updateArrayList(UserFood1);
    	
    	//
    	FXMLLoader loader=new FXMLLoader();
		loader.setLocation((getClass().getResource("/healthApp/view/ViewFoodConsumed.fxml")));
		Scene myScene=(Scene)((Node)event.getSource()).getScene();
		Stage stage=(Stage)(myScene).getWindow();
		Parent nextView=loader.load();
		stage.setScene(new Scene(nextView));
		stage.show();		
		
		ViewFoodConsumedController vFCC = loader.getController();
		
		/*here
		 * UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
		 *	Users loggedInUser = UsersFoodDB.checkLoggedIn;
		 * if(UsersFoodDB.getUsers(loggedInUser.getEmail()==null){
		 * new UsersFoodConsumption(loggedInUser.getEmail(),new ArrayList <Food>(),new ArrayList <Integer>(),new ArrayList<String>())
		 * }
		 * 
		 * to here
		 */
		
		/*
		 * if(UsersFoodDB.getUsers(loggedInUser.getEmail())==null)
		 * else{
		 * 		UsersFoodConsumption testUser = UsersFoodDB.getUsers(loggedInUser.getEmail());

		 */
		if(UsersFoodDB.getUsers(loggedInUser.getEmail())==null) {
			System.out.println("No such user");
		}
		
		else {
		UsersFoodConsumption testUser = UsersFoodDB.getUsers(loggedInUser.getEmail());
		ArrayList <Food> newFoodArrayList = testUser.getFoodArrayList();
		ArrayList <String> newfoodList = new ArrayList <String>();
		
		double totalCalories = 0;
		double totalProtein = 0;
		double totalCarbs = 0;
		double totalFats = 0;
		double totalCholesterol = 0;
		double totalSugar = 0;
		double totalSodium = 0;
		
		for (Food foodItems : newFoodArrayList) {
			newfoodList.add(foodItems.getName());
			totalCalories+=foodItems.getCalories();
			totalProtein+=foodItems.getProtein();
			totalCarbs+=foodItems.getCarbs();
			totalFats+=foodItems.getFats();
			totalCholesterol+=foodItems.getCholesterol();
			totalSugar+=foodItems.getSugar();
			totalSodium+=foodItems.getSodium();
			
		}
		
		vFCC.setCalories(totalCalories);
		vFCC.setProtein(totalProtein);
		vFCC.setCarbs(totalCarbs);
		vFCC.setFats(totalFats);
		vFCC.setCholesterol(totalCholesterol);
		vFCC.setSugar(totalSugar);
		vFCC.setSodium(totalSodium);
		
		vFCC.addToVbox(newfoodList);
    	
    	//
			}
    	}
    	
    }
    
    private int foodCount = 0;
    
	public void setCalories(double totalCalories) {
		totalCaloriesLabel.setText("Calories: " + Double.toString(totalCalories) + "kcal");
		
	}
	public void setProtein(double totalProtein) {
		totalProteinLabel.setText("Protein: " + Double.toString(totalProtein) + "g");
		
	}
	public void setCarbs(double totalCarbs) {
		totalCarbsLabel.setText("Carbs: " + Double.toString(totalCarbs) + "g");
	}
	public void setFats(double totalFats) {
		totalFatsLabel.setText("Fats: " + Double.toString(totalFats) + "g");
	}
	
	public void setSodium(double totalSodium) {
		totalSodiumLabel.setText("Sodium: " + Double.toString(totalSodium) + "mg");
	}
	
	public void setCholesterol(double totalCholesterol) {
		totalCholesterolLabel.setText("Cholesterol: " + Double.toString(totalCholesterol) + "mmol//L");
	}
	
	public void setSugar(double totalSugar) {
		totalSugarLabel.setText("Sugar: " + Double.toString(totalSugar) + "g");
	}


	
/*
	static ArrayList<Integer> portionArrayList = new ArrayList <Integer>();
 
	public ArrayList<Integer> getPortionArrayList() {
		return portionArrayList;
	}



	public void setPortionArrayList(ArrayList<Integer> portionArrayList) {
		this.portionArrayList = portionArrayList;
	}
	*/
	

	ArrayList <String> foodList = new ArrayList <String>();

	   public ArrayList<String> getFoodList() {
			return foodList;
		}



		public void setFoodList(ArrayList<String> foodList) {
			this.foodList = foodList;
		}

		
    @FXML
    void goToConsumptionInfo(MouseEvent event) {

    }



	public void displayFoodConsumed() throws IOException {

		Stage primaryStage = new Stage();
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(getClass().getResource("/nutritionTracking/view/consumedFoodDetails.fxml"));		
		Parent root=loader.load();
		
		
		Scene scene=new Scene(root);
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Nutrition tracking home page");
		primaryStage.show();
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		testBtn.setStyle("-fx-border-color: #17202A; -fx-border-width: 3px;-fx-background-color:pink;");

	
	}
	
	public void addToVbox(ArrayList <String> foodList) {
			//int foodCount = 0;
			Label emptyFood = new Label("You have yet added any food into this tab!");
			emptyFood.setWrapText(true);
			int count =0;
			if (foodList.isEmpty()) {
				vBox.getChildren().add(emptyFood);

			}
					
			else {
			
			for(String food : foodList) {
			
				UsersMapDB usersDB = new UsersMapDB();
				Users loggedInUser = usersDB.checkLoggedIn(getLoggedInUser());
	
				
				
				UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
				
				//check for user here'
				//for checking purposes im just taking the first user
				//check who logged in here
				/*here
				 * UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
				 *	Users loggedInUser = UsersFoodDB.checkLoggedIn;
				 * if(UsersFoodDB.getUsers(loggedInUser.getEmail()==null){
				 * new UsersFoodConsumption(loggedInUser.getEmail(),new ArrayList <Food>(),new ArrayList <Integer>(),new ArrayList<String>())
				 * }
				 * 
				 * to here
				 */
		    	
				/*
				 * 	UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers(loggedInUser.getEmail());

				 * 
				 */
				UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers(loggedInUser.getEmail());
				ArrayList <String> DateArrayList = UserFood1.getDateArrayList();
				
				
				
				Button newButton = new Button(food);
				
				newButton.setMinWidth(125);
				newButton.setMinHeight(20);
				//newButton.setStyle("-fx-background-color: #33f4ff; ");
				newButton.setStyle("-fx-border-color: #17202A; -fx-border-width: 3px;-fx-background-color:pink;");

				Label smallDivisor = new Label("");
				smallDivisor.setMaxHeight(6);
				smallDivisor.setMinHeight(5);
				
				//vBox.getChildren().add(new Button(food));
				vBox.getChildren().add(newButton);
				vBox.getChildren().add(smallDivisor);
				
				//vBox.getChildren().add(new Button(food));
				
				Button deleteButton = new Button("( X )");
				deleteButton.setStyle("-fx-border-color: #17202A; -fx-border-width: 3px;-fx-background-color:pink;");

				vBox2.getChildren().add(deleteButton);
				vBox2.getChildren().add(smallDivisor);

				
				Label newLabel = new Label(DateArrayList.get(count));
				newLabel.setMinHeight(28);
				vBox3.getChildren().add(newLabel);
				vBox3.getChildren().add(smallDivisor);

				final int innerMi = foodCount;
				count++;
				
						
				newButton.addEventHandler(MouseEvent.MOUSE_CLICKED,e->{
					FXMLLoader loader=new FXMLLoader();
					loader.setLocation((getClass().getResource("/healthApp/view/ConsumedFoodInfo.fxml")));
					 Scene myScene = (Scene)((Node)e.getSource()).getScene();
					 Stage stage=(Stage)(myScene).getWindow();
					 Parent nextView;
					try {
						nextView = loader.load();
						 stage.setScene(new Scene(nextView));
						 stage.show();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					ConsumedFoodInfoController cFIC = loader.getController();
					
					//UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
					
					//check for user here'
					//for checking purposes im just taking the first user
					//check who logged in here
					
					//UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers("User1");
					ArrayList <Food> FoodArrayList = UserFood1.getFoodArrayList();
					ArrayList <Integer> PortionArrayList = UserFood1.getPortionArrayList();
					System.out.println(innerMi);
					String foodName = FoodArrayList.get(innerMi).getName();
					double calories = FoodArrayList.get(innerMi).getCalories();
					double carbs = FoodArrayList.get(innerMi).getCarbs();
					double protein = FoodArrayList.get(innerMi).getProtein();
					double fats = FoodArrayList.get(innerMi).getFats();
					double cholesterol = FoodArrayList.get(innerMi).getCholesterol();
					double sugar = FoodArrayList.get(innerMi).getSugar();
					double sodium = FoodArrayList.get(innerMi).getSodium();
					String description = FoodArrayList.get(innerMi).getDescription();
					double servingSize = FoodArrayList.get(innerMi).getServingSize();
					String servingSizeUnit = FoodArrayList.get(innerMi).getServingSizeUnit();
					int portion = 0;
					
					portion = PortionArrayList.get(innerMi);
					
					cFIC.setCalories(calories);
					cFIC.setFoodName(foodName);
					cFIC.setCarbs(carbs);
					cFIC.setProtein(protein);
					cFIC.setFats(fats);
					cFIC.setCholesterol(cholesterol);
					cFIC.setSugar(sugar);
					cFIC.setSodium(sodium);
					cFIC.setDescription(description);
					cFIC.setServingSize(servingSize, servingSizeUnit);
					cFIC.setPortion(portion);
					
					
					
					
					String fileName;
					switch (foodName) {
						
					case "Chicken Rice" :  fileName = "animeChickenRice.jpg";
					break;
					
					case "Chicken Soup(KFC)" : fileName = "animeChickenSoup.jpg";
					break;
					
					case "Fried Chicken" : fileName = "animeFriedChicken.jpg";
					break;
					
					case "Salad" : fileName = "salad.jpg";
					break;
					
					case "Chocolate" : fileName = "chocolate.jpg";
					break;
				
					case "Nasi Lemak" : fileName = "nasiLemak.jpg";
					
					default: fileName = "foodNotFound.jpg";
					break;
					
						
					}
					System.out.println("The file name is " + fileName);

					Path dPath = FileSystems.getDefault().getPath("foodImg",fileName);
					File foodImg = new File(dPath.toUri());
				
					Image image = new Image(foodImg.toURI().toString());
					cFIC.getFoodImage().setImage(image);
					
					
					Random rand = new Random();
			    	int n = rand.nextInt(3) + 1;
			    	cFIC.loadImage(n);

					});
				
				
					deleteButton.addEventHandler(MouseEvent.MOUSE_CLICKED,e->{
						vBox.getChildren().remove(innerMi);
						vBox2.getChildren().remove(innerMi);
						vBox3.getChildren().remove(innerMi);
						//UsersFoodConsumptionDB UsersFoodDB = new UsersFoodConsumptionDB();
						
						
						//Retrieve relevant user here
						//Check if its the one who have logged in here
						//UsersFoodConsumption UserFood1 = UsersFoodDB.getUsers("User1");
						ArrayList <Food> FoodArrayList = UserFood1.getFoodArrayList();
						FoodArrayList.get(innerMi).setName("ERRORxERROR");
						ArrayList <Integer> PortionArrayList = UserFood1.getPortionArrayList();
						PortionArrayList.set(innerMi, 99);
						DateArrayList.set(innerMi, "Nothing");
						
						
						UserFood1.setDateArrayList(DateArrayList);
						UserFood1.setPortionArrayList(PortionArrayList);
						System.out.println(FoodArrayList.get(innerMi).getName());
						System.out.println(FoodArrayList);
						UserFood1.setFoodArrayList(FoodArrayList);
						foodCount--;
						System.out.println(UserFood1.getFoodArrayList().get(innerMi).getName());
						UsersFoodDB.updateArrayList(UserFood1);
					
					});
					
				
				foodCount++;
			
				}	
			}
			
	}
	
	
}


//display no food if thris no food