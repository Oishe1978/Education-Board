package Student;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ReScrutinyController {
    @FXML private ListView<String> eligibleSubjectsList;
    @FXML private Label confirmationLabel;

    public void initialize() {
        eligibleSubjectsList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        eligibleSubjectsList.getItems().addAll("Mathematics (Mark: 92)", "Physics (Mark: 81)");
    }

    @FXML
    public void handleSubmitApplication() {
        var selected = eligibleSubjectsList.getSelectionModel().getSelectedItems();
        if(!selected.isEmpty()) {
            confirmationLabel.setText("Re-Scrutiny application recorded for: " + selected.toString());
        } else {
            confirmationLabel.setText("Please select at least one subject.");
        }
    }
}
