package org.mavenproject1.javafx_crestview_bank.Controllers.Client;


import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import org.mavenproject1.javafx_crestview_bank.Models.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class ClientController implements Initializable {


    public BorderPane client_parent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewsFactory().getClientSelectedProperty().addListener((observable, oldValue, newValue)
                -> {
            switch (newValue){
                case "Transaction"-> {
                    try {
                        client_parent.setCenter(Model.getInstance().getViewsFactory().getTransactionView());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                default -> {
                    try {
                        client_parent.setCenter(Model.getInstance().getViewsFactory().getDashBoardView());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        });
            }
}
