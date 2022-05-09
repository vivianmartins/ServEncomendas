module com.example.fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.example.bd;

    opens com.example.fx to javafx.fxml;
    exports com.example.fx;
    //exports com.example.fx.controller;
    //opens com.example.fx.controller to javafx.fxml;
    // opens com.example.fx.controller to javafx.fxml;
    //exports com.example.fx.controller;


}