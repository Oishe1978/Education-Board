package Examiner;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.AssignedScripts;

public class AssignedScriptsController {
    @FXML private TableView<AssignedScripts> assignedTable;
    @FXML private TableColumn<AssignedScripts, String> bundleIdCol;
    @FXML private TableColumn<AssignedScripts, String> subjectCol;
    @FXML private TableColumn<AssignedScripts, Integer> totalScriptsCol;
    @FXML private Label detailsLabel;

    public void initialize() {
        bundleIdCol.setCellValueFactory(new PropertyValueFactory<>("bundleId"));
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subjectCode"));
        totalScriptsCol.setCellValueFactory(new PropertyValueFactory<>("totalScripts"));
    }

    @FXML
    public void loadAssignedScripts() {
        assignedTable.getItems().clear();
        assignedTable.getItems().add(new AssignedScripts("BNDL-001", "CSE-101", 50, "Pending"));
        assignedTable.getItems().add(new AssignedScripts("BNDL-002", "EEE-102", 40, "Completed"));
    }

    @FXML
    public void handleSelectBundle() {
        AssignedScripts selected = assignedTable.getSelectionModel().getSelectedItem();
        if(selected != null) {
            detailsLabel.setText("Selected Bundle: " + selected.getBundleId() + " | Status: " + selected.getStatus());
        }
    }
}

