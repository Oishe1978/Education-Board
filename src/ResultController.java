package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.ExamResult;

public class ResultController {
    @FXML private ComboBox<String> yearCombo;
    @FXML private TableView<ExamResult> resultTable;
    @FXML private TableColumn<ExamResult, String> subCol;
    @FXML private TableColumn<ExamResult, String> gradeCol;
    @FXML private TableColumn<ExamResult, Double> marksCol;
    @FXML private Button downloadBtn;

    public void initialize() {
        yearCombo.getItems().addAll("2025", "2024");
        subCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        gradeCol.setCellValueFactory(new PropertyValueFactory<>("grade"));
        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
    }

    @FXML
    public void handleFetchResult() {
        if(yearCombo.getValue() != null) {
            resultTable.getItems().clear();
            resultTable.getItems().add(new ExamResult("Mathematics", "A+", 92.0));
            resultTable.getItems().add(new ExamResult("Physics", "A", 81.5));
            resultTable.setVisible(true);
            downloadBtn.setVisible(true);
        }
    }

    @FXML
    public void handleDownloadResult() {
        System.out.println("Marksheet PDF file generated successfully.");
    }
}
