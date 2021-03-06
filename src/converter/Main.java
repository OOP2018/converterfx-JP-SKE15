package converter;
	/**
	 * @author Hayato Kawai
	 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Converter");
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
