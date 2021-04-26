module it.edu.isspitagora.provagithub {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.edu.isspitagora.provagithub to javafx.fxml;
    exports it.edu.isspitagora.provagithub;
}
