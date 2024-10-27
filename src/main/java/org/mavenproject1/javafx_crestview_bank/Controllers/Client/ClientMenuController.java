package org.mavenproject1.javafx_crestview_bank.Controllers.Client;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.mavenproject1.javafx_crestview_bank.Models.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button account_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();

    }
        private void addListeners() {
            dashboard_btn.setOnAction(event -> onDashboard());
            transaction_btn.setOnAction(event -> OnTransaction(event));

        }

        private void OnTransaction (ActionEvent event)  {
            Model.getInstance().getViewsFactory().getClientSelectedProperty().set("Transaction");
        }

        private void onDashboard () {
            Model.getInstance().getViewsFactory().getClientSelectedProperty().set("Dashboard");
        }


    }

