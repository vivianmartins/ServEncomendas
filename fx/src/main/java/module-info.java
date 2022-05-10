module com.example.fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.example.bd;

    opens com.example.fx to javafx.fxml;
    exports com.example.fx;
    exports com.example.fx.controllerAdmin;
    opens com.example.fx.controllerAdmin to javafx.fxml;


}