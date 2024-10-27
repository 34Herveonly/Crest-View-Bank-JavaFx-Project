
        package org.mavenproject1.javafx_crestview_bank;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.mavenproject1.javafx_crestview_bank.Models.Model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox acc_selector;
    public Label payee_adress_lbl;
    public TextField payee_adress_fld;
    public Label password_lbl;
    public PasswordField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> {
            try {
                OnLogin();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    private void OnLogin() throws IOException {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewsFactory().closeStage(stage);
        Model.getInstance().getViewsFactory().showClientWindow();
    }
}
