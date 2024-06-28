package application;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class UserInterfaceOption1 extends Application {
	
	

	
	@Override
	public void start(Stage appStage) {

		
		
		
		
		appStage.setTitle("Menu");
		MenuItem menuItem1 = new MenuItem("Date and Time");
		MenuItem menuItem2 = new MenuItem("Write to File");
		MenuItem menuItem3 = new MenuItem("Randomize Hue");
		MenuItem menuItem4 = new MenuItem("Exit");


		TextField text1 = new TextField();
		
		Label dateLabel = new Label("Current Date and Time : ");
		
		MenuButton menuButton = new MenuButton("Menu", null, menuItem1, menuItem2, menuItem3);
		HBox hbox = new HBox(menuButton);
		


		menuItem1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				LocalDateTime now = LocalDateTime.now();
				System.out.print(now.toString());
				text1.setText(now.toString());
				text1.setFont(new Font("ARIAL", 20));
				text1.setStyle("-fx-font-weight: bold;");
				
			}
			});
		
						
		Scene scene1 = new Scene(hbox,400,400,Color.BLACK);
		appStage.setScene(scene1);
		appStage.show();
		
	}
	public static void main(final String[] args) {
        UserInterfaceOption1.launch(UserInterfaceOption1.class, args);
	}
	

}
