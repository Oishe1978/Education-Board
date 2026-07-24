package Examiner;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.ScriptEvaluation;

public class ScriptEvaluationController {
    @FXML private TextField scriptIdInput;
    @FXML private TextField marksAInput;
    @FXML private TextField marksBInput;
    @FXML private Label totalMarksLabel;
    @FXML private Label statusLabel;

    @FXML
    public void handleCalculateAndSave() {
        try {
            String sId = scriptIdInput.getText();
            double marksA = Double.parseDouble(marksAInput.getText());
            double marksB = Double.parseDouble(marksBInput.getText());

            ScriptEvaluationController eval = new ScriptEvaluation(sId, marksA, marksB);
            totalMarksLabel.setText("Calculated Total: " + eval.getTotalMarks());
            statusLabel.setText("Evaluation saved successfully for " + sId);
        } catch (NumberFormatException e) {
            statusLabel.setText("Error: Please enter valid numbers for marks.");
        }
    }
}