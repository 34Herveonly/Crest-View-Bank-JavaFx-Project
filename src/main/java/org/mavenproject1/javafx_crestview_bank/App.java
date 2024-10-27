package org.mavenproject1.javafx_crestview_bank;

import javafx.application.Application;
import javafx.stage.Stage;
import org.mavenproject1.javafx_crestview_bank.Models.Model;
import org.mavenproject1.javafx_crestview_bank.Views.ViewsFactory;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewsFactory viewsFactory = new ViewsFactory();
        viewsFactory.showLoginForm(); // This should be the method call to show the login page
    }
    }

