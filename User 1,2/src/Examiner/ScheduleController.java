package Examiner;



import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ScheduleController {
    @FXML private ComboBox<String> examSelectCombo;
    @FXML private TextArea scheduleDetailsDisplay;

    public void initialize() {
        examSelectCombo.getItems().addAll("HSC Examination 2026", "SSC Examination 2026");
    }

    @FXML
    public void handleLoadSchedule() {
        String selected = examSelectCombo.getValue();
        if(selected != null) {
            scheduleDetailsDisplay.setText("=== " + selected + " SCHEDULE ===\n" +
                    "- Evaluation Starts: August 01, 2026\n" +
                    "- Scrutiny Deadline: August 20, 2026\n" +
                    "- Final Submission: August 25, 2026");
        }
    }
}
