module org.mavenproject1.javafx_crestview_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.mavenproject1.javafx_crestview_bank to javafx.fxml;
    exports org.mavenproject1.javafx_crestview_bank;
    exports org.mavenproject1.javafx_crestview_bank.Controllers.Admin;
    exports org.mavenproject1.javafx_crestview_bank.Controllers.Client;
    exports org.mavenproject1.javafx_crestview_bank.Models;
    exports org.mavenproject1.javafx_crestview_bank.Views;
}