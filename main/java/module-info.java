module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jsapi;
    requires java.sql;
    requires freetts;
    requires java.datatransfer;
    requires java.desktop;
    requires mysql.connector.java;
    requires org.jsoup;


    opens Application to javafx.fxml;
    exports Application;
}