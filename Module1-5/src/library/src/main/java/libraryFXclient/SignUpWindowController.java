package library.src.main.java.libraryFXclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import library.src.main.java.repository.ReaderRepository;

public class SignUpWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField getSignUpLastName;

    @FXML
    private TextField SignUpLastName;

    @FXML
    private TextField SignUpRole;

    @FXML
    private TextField SignUpPhone;

    @FXML
    private TextField SignUpAddress;

    @FXML
    private Button signUpButton;

    @FXML
    private PasswordField signUpPassword;}

//    public SignUpWindowController() {
//    }


//    @FXML
//    void initialize() {
//        ReaderRepository readerRepository = new ReaderRepository();
//
//        signUpButton.setOnAction(event -> {
//            readerRepository.signUpUser(signUpFirstName.getText(), signUpLastName.getText(),
//                    signUpRole.getText(), signUpPassword.getText(), signUpCountry.getText(),
//                    "Male");
//        });
//
//    }
//
//
//}
