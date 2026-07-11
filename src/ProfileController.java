package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Student;

public class ProfileController {
    // JavaFX UI Bindings
    @FXML private Label nameLabel;
    @FXML private TextField phoneField;
    @FXML private TextField emailField;
    @FXML private Label successLabel;

    private Student currentStudent;


    public void initialize() {

        currentStudent = new Student("STU123", "pass123", "John Doe", "john@board.edu", "+1234567");

        // Displaying properties onto the UI elements
        nameLabel.setText("Student Name: " + currentStudent.getName());
        phoneField.setText(currentStudent.getPhone());
        emailField.setText(currentStudent.getEmail());
    }


    @FXML
    public void handleSaveChanges() {

        String updatedPhone = phoneField.getText();
        String updatedEmail = emailField.getText();


        currentStudent.setPhone(updatedPhone);
        currentStudent.setEmail(updatedEmail);

        // Updating UI with success notification status
        successLabel.setText("Profile information updated successfully!");
    }
}