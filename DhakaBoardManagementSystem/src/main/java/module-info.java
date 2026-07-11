module cse213.dhakaboardmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.dhakaboardmanagementsystem to javafx.fxml;
    exports cse213.dhakaboardmanagementsystem;
}