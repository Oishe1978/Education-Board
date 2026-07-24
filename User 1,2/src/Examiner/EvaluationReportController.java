package Examiner;


import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EvaluationReportController {
    @FXML private ComboBox<String> subjectCombo;
    @FXML private Label progressLabel;

    public void initialize() {
        subjectCombo.getItems().addAll("Mathematics (101)", "Physics (102)", "Chemistry (103)");
    }

    @FXML
    public void handleGenerateReport() {
        if(subjectCombo.getValue() != null) {
            progressLabel.setText("Analyzing evaluation data... Report generated successfully!");
        } else {
            progressLabel.setText("Please pick a subject first.");
        }
    }
}