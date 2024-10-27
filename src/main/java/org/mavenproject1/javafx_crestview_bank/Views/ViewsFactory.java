package org.mavenproject1.javafx_crestview_bank.Views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.mavenproject1.javafx_crestview_bank.Controllers.Client.ClientController;
import org.mavenproject1.javafx_crestview_bank.App;

import java.io.IOException;

public class ViewsFactory {

    private final StringProperty clientSelectedProperty;
    private AnchorPane dashBoardView;
    private AnchorPane transactionView;

    public ViewsFactory() {
        this.clientSelectedProperty = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedProperty() {
        return clientSelectedProperty;
    }

    public AnchorPane getDashBoardView() throws IOException {
        if (dashBoardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/mavenproject1/javafx_crestview_bank/Fxmls/Client/Dashboard.fxml"));
                dashBoardView = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException("Failed to load Dashboard FXML", e);
            }
        }
        return dashBoardView;
    }

    public AnchorPane getTransactionView() throws IOException {
        if (transactionView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/mavenproject1/javafx_crestview_bank/Fxmls/Client/Transaction.fxml"));
                transactionView = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException("Failed to load Transactions FXML", e);
            }
        }
        return transactionView;
    }

    public void showLoginForm() throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("/org/mavenproject1/javafx_crestview_bank/Fxmls/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("/org/mavenproject1/javafx_crestview_bank/Fxmls/Client/Client.fxml"));

        // Assuming the controller is set in the FXML file. Otherwise, you would need to set it here.
        // ClientController controller = new ClientController();
        // loader.setController(controller);

        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        try {
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Herve CrestView Bank");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
