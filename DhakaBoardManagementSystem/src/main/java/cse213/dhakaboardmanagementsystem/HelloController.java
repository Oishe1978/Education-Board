package cse213.dhakaboardmanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label statusLabel;

    // --- Examination Controller Methods ---
    @FXML
    protected void onPublishExamRoutineClick() {
        statusLabel.setText("Examination Controller: Exam Routine Published Successfully!");
    }

    @FXML
    protected void onApproveResultsClick() {
        statusLabel.setText("Examination Controller: Results Approved!");
    }

    // --- School/College Administrator Methods ---
    @FXML
    protected void onRegisterNewStudentClick() {
        statusLabel.setText("School Admin: New Student Registered Successfully!");
    }

    @FXML
    protected void onSubmitExamFormClick() {
        statusLabel.setText("School Admin: Exam Forms Submitted to Board!");
    }
}