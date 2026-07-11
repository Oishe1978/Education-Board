package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class AdmitcardController {
    @FXML private ComboBox<String> examSelectCombo;
    @FXML private TextArea admitCardDisplay;

    public void initialize() {
        examSelectCombo.getItems().addAll("HSC Exam 2026");
    }

    @FXML
    public void handleDownload() {
        String selected = examSelectCombo.getValue();
        if(selected != null) {
            admitCardDisplay.setVisible(true);
            admitCardDisplay.setText("== ADMIT CARD ==\n" +
                    "Roll No: 987213\n" +
                    "Exam: " + selected + "\n" +
                    "Status: VERIFIED & COMPLIANT\n" +
                    "================");
        }
    }
}
