package Examiner;


import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarksSubmissionController {
    @FXML private ListView<String> evaluatedScriptsList;
    @FXML private CheckBox verifyCheck;
    @FXML private Label confirmationLabel;

    public void initialize() {
        evaluatedScriptsList.getItems().addAll("Script #98211 - Marks: 78.5", "Script #98212 - Marks: 88.0", "Script #98213 - Marks: 64.0");
    }

    @FXML
    public void handleSubmitMarks() {
        if (verifyCheck.isSelected()) {
            confirmationLabel.setText("Marks stored and final submission complete!");
        } else {
            confirmationLabel.setText("Please check accuracy and check the verification box.");
        }
    }
}
