package application;


import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.TextField;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class UserInterfaceOption1 extends Application {
	
	
	TextField dateField = new TextField("Date and Time...");
	static TextField fileField = new TextField();
	
	BorderPane layout = new BorderPane();;

	
	@Override
	public void start(Stage appStage) {
		String date = java.time.LocalDateTime.now().toString();
		
	
		
		BorderPane layout = new BorderPane();

		
		layout.setStyle(String.format("-fx-background-color: green"));
		
		//Option 1
		Menu mainMenu = new Menu("Menu");
		MenuItem option1 = new MenuItem("Date and Time");
		option1.setOnAction(e -> dateField.setText(date));
		mainMenu.getItems().add(option1);
		dateField.setEditable(false);
		
		//Option 2
		MenuItem option2 = new MenuItem("Write to File");
		option2.setOnAction(e -> writeToFile());
		
		mainMenu.getItems().add(option2);
		
		//Option 3
		MenuItem option3 = new MenuItem("Randomize Hue");
		Random random = new Random();
		int r = 0;
		int g = random.nextInt(256); 
		int b = 0;
		option3.setOnAction(e -> layout.setStyle(String.format("-fx-background-color: rgb(%d,%d,%d)", r, g, b)));

		mainMenu.getItems().add(option3);
		
		//Option 4
		MenuItem option4 = new MenuItem("Exit");
		option4.setOnAction(e -> Platform.exit());
		mainMenu.getItems().add(option4);
		
		//Bar
		MenuBar mainBar = new MenuBar();
		mainBar.getMenus().add(mainMenu);
		


		layout.setTop(mainBar);
		layout.setLeft(dateField);
		layout.setRight(fileField);
		Scene mainScene = new Scene(layout, 500, 500);
		appStage.setScene(mainScene);
		appStage.show();
		

	}
	public static void writeToFile() {
		FileOutputStream out = null;
		String fileText = fileField.getText();
		try {
			out = new FileOutputStream("GUIText.txt");
			byte[] f = fileText.getBytes();
			out.write(f);
			out.close();
		} catch (FileNotFoundException e1) {
			System.out.println("File does not exist.");
		} catch (IOException e1) {
			System.out.println("File cannot be written.");
		}}
	public static void randomizeHue() {
		
	}
	
	public static void main(final String[] args) {
        UserInterfaceOption1.launch(UserInterfaceOption1.class, args);
	}
	

}
