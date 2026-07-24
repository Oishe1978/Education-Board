package Student;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RoutineController {
    @FXML private ComboBox<String> examTypeCombo;
    @FXML private TableView<ExamSchedule> routineTable;
    @FXML private TableColumn<ExamSchedule, String> subjectCol;
    @FXML private TableColumn<ExamSchedule, String> dateCol;
    @FXML private TableColumn<ExamSchedule, String> timeCol;

    public void initialize() {
        examTypeCombo.getItems().addAll("HSC Routine", "SSC Routine");
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    @FXML
    public void loadRoutine() {
        routineTable.getItems().clear();
        routineTable.getItems().add(new ExamSchedule("Mathematics", "2026-08-10", "10:00 AM"));
        routineTable.getItems().add(new ExamSchedule("Physics", "2026-08-12", "10:00 AM"));
    }

    @FXML
    public void handleDownloadRoutine() {
        System.out.println("Routine downloaded locally.");
    }
}
