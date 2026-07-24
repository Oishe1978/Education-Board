package Student;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class NoticeController {
    @FXML private ListView<String> noticeTitleListView;
    @FXML private TextArea noticeDetailsText;

    public void initialize() {
        noticeTitleListView.getItems().addAll("Notice #1: Exam Registration Extension", "Notice #2: Center Rules Modification");
    }

    @FXML
    public void handleSelectNotice() {
        String selected = noticeTitleListView.getSelectionModel().getSelectedItem();
        if(selected != null) {
            if(selected.contains("#1")) {
                noticeDetailsText.setText("The board has extended the form fill-up timeline up to August 15, 2026 without any extra fine.");
            } else {
                noticeDetailsText.setText("All students must bring clear clipboards and valid board admit cards to the centers.");
            }
        }
    }

    @FXML
    public void handleReturnHome() {

        System.out.println("Returning back to Dashboard scene state.");
    }
}
