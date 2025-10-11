module com.slsf.crud_usuarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires java.dotenv;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.slsf.crud_usuarios to javafx.fxml;
    opens com.slsf.crud_usuarios.controller to javafx.fxml;
    opens com.slsf.crud_usuarios.model to javafx.base;

    exports com.slsf.crud_usuarios;
}