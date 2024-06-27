package application;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import java.util.Calendar;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

public class UserInterfaceOption1 extends Application {
	
	

	
	@Override
	public void start(Stage applicationStage) {

	
		GridPane mainPane = new GridPane();
		Scene mainScene = new Scene(mainPane);
		Canvas mainCanvas = new Canvas(750, 750);
		
	    mainPane.setPadding(new Insets(10, 10, 10, 10));
	    mainPane.setHgap(12);
	    mainPane.setVgap(12);



		
		Button firstButton = new Button("Date and Time");
		Button secondButton = new Button("Write to File");
		Button thirdButton = new Button("Randomize Background Color");
		Button fourthButton = new Button("Exit");
		
		Label dateLabel = new Label("Current Date and Time :");

        final Menu menu1 = new Menu("File");
        final Menu menu2 = new Menu("Options");
        final Menu menu3 = new Menu("Help");

	    
	    mainPane.add(firstButton, 0, 0);
	    mainPane.add(secondButton, 1, 0);
	    mainPane.add(thirdButton, 2, 0);
	    mainPane.add(fourthButton, 3, 0);
	    mainPane.add(dateLabel, 0, 1);
	    


		firstButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Calendar currentDate;

				currentDate = Calendar.getInstance();
				Label dateLabel = new Label("Current Date and Time :" + currentDate);
				
				
				
			}
			
		});
		
		GraphicsContext graphicsContext = mainCanvas.getGraphicsContext2D();
		
		mainPane.getChildren().add(mainCanvas);               
	    applicationStage.setTitle("Menu"); 
	    applicationStage.setScene(mainScene);              
	    applicationStage.show();
		
		
	}
	public static void main(final String[] args) {
        UserInterfaceOption1.launch(UserInterfaceOption1.class, args);
	}
	

}
