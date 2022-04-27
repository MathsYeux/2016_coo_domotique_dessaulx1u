module com.example.td1_dessaulx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.td1_dessaulx to javafx.fxml;
    exports com.example.td1_dessaulx;
}