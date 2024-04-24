package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		 AnchorPane root = new AnchorPane();
	        root.setMinHeight(720);
	        root.setMinWidth(1200);
	        
	        Image image = new Image(getClass().getResourceAsStream("Blood.jpg"));
	        ImageView imageView = new ImageView(image);
	        imageView.setLayoutX(400);
            imageView.setLayoutY(680);	
            
	        TextField textField = new TextField();
	        textField.setLayoutX(210);
	        textField.setLayoutY(200);      
	    
	        PasswordField passwordField = new PasswordField();
	       passwordField.setLayoutX(210);
	       passwordField.setLayoutY(230);
	        
	        Button button = new Button("Login");
	        button.setLayoutX(265);
	        button.setLayoutY(300);
	        button.setOnAction(e -> {
	        	
	        	String username = textField.getText();
	        	String password = passwordField.getText();
	        	
	        	 if (isValid(username, password)) {
	        		 System.out.println("Login successful!");
	        		 
	        		 HomePage homePage = new HomePage();
	        		 Scene homeScene = homePage.getScene();
	        		 
	        		 primaryStage.setScene(homeScene);
	        		 primaryStage.setTitle("Home Page");
	        		 
	             }else {
	            	 Alert alert = new Alert(Alert.AlertType.ERROR);
	                 alert.setTitle("Login Error");
	                 alert.setHeaderText(null);
	                 alert.setContentText("Username or password is incorrect!");
	                 alert.showAndWait();
	                 System.out.println("Login Failed!");
	             }
	        	 
	        	
	        });
	        
	        root.getChildren().addAll(imageView,textField,passwordField,button);
	    		       
	       //Parent loginPage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
	        
	        Scene myscene = new Scene(root);
	        primaryStage.setTitle("Blood Bank Management System");
	        primaryStage.setScene(myscene);
	        primaryStage.show();     
	}

	private boolean isValid(String username, String password) {
	
		return username.equals("admin") && password.equals("admin");	}
	}
