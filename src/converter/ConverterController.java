package converter;
/**
 * UI controller for events and initializing components.
 * @author Hayato Kawai
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ConverterController {
	@FXML
	private TextField textfield1;
	@FXML
	private TextField textfield2;
	@FXML
	private ComboBox<Length> combobox1;
	@FXML
	private ComboBox<Length> combobox2;

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {

		double number = 0, kilo;
		String text1 = textfield1.getText().trim();
		Length unit1 = combobox1.getValue();
		String text2 = textfield2.getText().trim();
		Length unit2 = combobox2.getValue();
		if (text2.isEmpty()) {
			try {
				number = Double.parseDouble(text1);
			} catch (NumberFormatException nf) {
				textfield2.setText("Invalid number!!!!!");
			}
			kilo = (number * unit1.getValue()) / unit2.getValue();
			textfield2.setText(String.format("%.4g", kilo));
		} else {
			try {
				System.out.println("handleConvert converting" + text2);
				number = Double.parseDouble(text2);
			} catch (NumberFormatException nf) {
				textfield1.setText("Invalid number!!!!!");
			}
			kilo = (number * unit2.getValue()) / unit1.getValue();
			textfield1.setText(String.format("%.4g", kilo));
		}
	}

	/**
	 * clear all the text field.
	 */ 
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
	}

	/**
	 * JavaFX calls the initialize() method of your controller when 
	 * it creates the UI form, after the components have been created 
	 * and @FXML annotated attributes have been set.
	 */
	@FXML
	public void initialize() {
		System.out.println("Running initialize");
		if (combobox1 != null) {
			combobox1.getItems().addAll(Length.values());
			combobox1.getSelectionModel().select(0); // select an item to show
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1); // select an item to show
		}

	}
}
