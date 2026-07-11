package controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class RegistrationController {
    @FXML private ComboBox<String> examTypeCombo;
    @FXML private ListView<String> subjectListView;
    @FXML private CheckBox verifyCheck;
    @FXML private Label confLabel;

    public void initialize() {
        examTypeCombo.getItems().addAll("HSC Examination", "SSC Examination");
        subjectListView.getItems().addAll("Mathematics", "Physics", "Chemistry", "English");
    }

    @FXML
    public void handleSubmitRegistration() {
        if (verifyCheck.isSelected() && examTypeCombo.getValue() != null) {
            confLabel.setText("Registration complete! Info securely generated and stored.");
        } else {
            confLabel.setText("Please verify your profile information before submitting.");
        }
    }
}
