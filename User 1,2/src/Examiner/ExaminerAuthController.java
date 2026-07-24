package Examiner;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ExaminerAuthController {
    @FXML private TextField examinerIdField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    @FXML
    public void handleLogin() { // UIE & UID
        String id = examinerIdField.getText();
        String pass = passwordField.getText();

        if("EXM456".equals(id) && "pass456".equals(pass)) { // VR
            statusLabel.setText("Login Success! Opening Dashboard..."); // OP
        } else {
            statusLabel.setText("Invalid Examiner Credentials!");
        }
    }

    @FXML
    public void handleLogout() { // Goal 8
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to logout?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.YES) {
                System.out.println("Redirecting to Login Scene State."); // OP
            }
        });
    }
}

