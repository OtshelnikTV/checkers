module checkers.checkers {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens checkers.checkers to javafx.fxml;
    exports checkers.checkers;
}