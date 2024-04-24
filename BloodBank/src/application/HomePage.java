package application;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;

public class HomePage {

	private AnchorPane root;
	
	  public HomePage() {
	        root = new AnchorPane();     
	    	
	        Image image = new Image(getClass().getResourceAsStream("Bank.jpg"));
	        ImageView imageView = new ImageView(image);
	        imageView.setLayoutX(0);
            imageView.setLayoutY(0);
	        
	    	   MenuBar menuBar = new MenuBar();
	    	   
	    	   Menu donorMenu =new Menu("Donor");   	 
	    	   MenuItem addItem = new MenuItem("Add Donor");
	    	   MenuItem updateItem = new MenuItem("Update Details");
	    	   MenuItem allItem = new MenuItem("All Donor Details");
	  	 
	    	   donorMenu.getItems().addAll(addItem,updateItem,allItem);
	    
	    	   Menu searchMenu = new Menu("Search Menu");
	    	   MenuItem locationItem = new MenuItem("Location");
	    	   MenuItem bloodItem = new MenuItem("Blood Group");
	    	   
	    	   searchMenu.getItems().addAll(locationItem,bloodItem);
	    	   
	    	   Menu stockMenu = new Menu("Stock");
	    	   MenuItem increaseItem = new MenuItem("Increase");
	    	   MenuItem decreaseItem = new MenuItem("Decrease");
	    	   MenuItem detailsItem  = new MenuItem("Details");
	    	   
	    	   stockMenu.getItems().addAll(increaseItem,decreaseItem,detailsItem);
	    	   
	    	   Menu deleteMenu = new Menu("Delete Menu");
	    	   MenuItem listItem = new MenuItem("List");
	    	   
	    	   deleteMenu.getItems().addAll(listItem);
	    	   
	    	   Menu exitMenu = new Menu("Exit");
	    	   MenuItem logoutItem = new MenuItem("Logout");
	    	   
	    	   exitMenu.getItems().addAll(logoutItem);
	    	   
	    	   menuBar.getMenus().addAll(donorMenu,searchMenu,stockMenu,deleteMenu,exitMenu);
	    	      	  
	    	   menuBar.setPrefWidth(600);   
	    	   menuBar.setLayoutX(0);   
	    	   menuBar.setLayoutY(0);
	    	   
	    	   
//	    	   Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
//	           root.setPrefSize(screenBounds.getWidth(), screenBounds.getHeight());
//
//	           menuBar.setPrefWidth(screenBounds.getWidth());
//	           menuBar.setLayoutX(0);
//	           menuBar.setLayoutY(0);
	    	   
	      root.getChildren().addAll(imageView,menuBar);
	       }
	public Scene getScene() {
		
        return new Scene(root, 600, 400);
        
	}
}
