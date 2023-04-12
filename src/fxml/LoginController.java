package fxml;

import org.controlsfx.control.Notifications;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {
	@FXML 
	private TextField emailField;
	@FXML 
	private PasswordField passwordField;
	
	public void login(ActionEvent e) {
		
		boolean emailInput = emailField.getText().equals("inunes@gml.com");
		boolean passwordInput = passwordField.getText().equals("pass12345");
		
		System.out.println(emailInput + " " + passwordInput);
		if(emailInput && passwordInput) {
			Notifications.create().title("Login FXML").
					text("Login successful!").showInformation();
		}else {
			Notifications.create().title("Login FXML").
			text("Incorrect Password or Email!").showInformation();
		}
	}
}
