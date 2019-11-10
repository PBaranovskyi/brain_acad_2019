package tereshchenko_roman.sampleApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if(!loginText.equals("") && !loginPassword.equals(""))
                loginUser (loginText, loginPassword);
            else System.out.println("Please, enter login and password");


//            System.out.println("Вы нажали на кнопку Войти");
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(getClass().getResource("app.fxml"));
//                Scene scene = new Scene(fxmlLoader.load(), 700, 400);
//                Stage stage = new Stage();
//                stage.setTitle("Home");
//                stage.setScene(scene);
//                stage.show();
//            } catch (IOException e) {
//                System.out.println("Failed to create new window");
//            }

        });

        loginSignupButton.setOnAction(event -> {
            loginSignupButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("signUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(getClass().getResource("signUp.fxml"));
//                Scene scene = new Scene(fxmlLoader.load(), 700, 400);
//                Stage stage = new Stage();
//                stage.setTitle("Sign Up");
//                stage.setScene(scene);
//                stage.show();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        });
    }

    private void loginUser(String loginText, String loginPassword) {
    }
}


