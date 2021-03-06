package tereshchenko_roman.sampleApplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpCountry;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpLogin;

    @FXML
    private PasswordField signUpPassword;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {
        DatabaseHandler dbHaldler = new DatabaseHandler();

        signUpButton.setOnAction(event -> {
            dbHaldler.signUpUser(signUpName.getText(), signUpLastName.getText(),
                    signUpLogin.getText(), signUpPassword.getText(), signUpCountry.getText(),
                    "Male");
        });

    }
}

