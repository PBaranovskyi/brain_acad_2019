package tereshchenko_roman.sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignupButton;

    @FXML
    void initialize() {

        authSignInButton.setOnAction(event -> {
//            System.out.println("Вы нажали на кнопку Войти");
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("app.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 700, 400);
                Stage stage = new Stage();
                stage.setTitle("Home");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                System.out.println("Failed to create new window");
            }

        });

        loginSignupButton.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("signUp.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 700, 400);
                Stage stage = new Stage();
                stage.setTitle("Sign Up");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}

