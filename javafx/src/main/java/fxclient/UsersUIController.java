package fxclient;

import fxclient.to.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersUIController {

    @FXML
    public TextField name;

    @FXML
    public TextField companyId;

    @FXML
    public TextField age;

    @FXML
    Label label;

    @FXML
    Button usersButton;

    @FXML
    ListView<String> listView;

    @FXML
    public void onClickMethod() {
        List<User> users = getUsers();
        label.setText(users.toString());


//        ObservableList<User> data = FXCollections.observableArrayList(users);
//
//        listView.setCellFactory(param -> new ListCell<User>() {
//            @Override
//            protected void updateItem(User user, boolean empty) {
//                super.updateItem(user, empty);
//
//                if (empty || user == null || user.getName() == null) {
//                    setText(null);
//                } else {
//                    setText(user.getName());
//                }
//            }
//        });

        ObservableList<String> data = FXCollections.observableArrayList(
                users.stream()
                        .map(User::getName).toArray(String[]::new));

        listView.setItems(data);

    }

    public List<User> getUsers() {
        final String uri = "http://localhost:8081/users";

        RestTemplate operations = new RestTemplate();

        ResponseEntity<User[]> users = operations.getForEntity(uri, User[].class);

        System.out.println("success");

        return Arrays.asList(users.getBody());

    }



    public void addUserdMethod(ActionEvent actionEvent) {

        System.out.println(age.getText());
        System.out.println(companyId.getText());
        System.out.println(name.getText());


        final String uri = "http://localhost:8081/users/add";

        RestTemplate operations = new RestTemplate();


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("name", name.getText());
        paramsMap.put("companyId", Integer.valueOf(companyId.getText()));
        paramsMap.put("age", Integer.valueOf(age.getText()));


        HttpEntity<Map<String, Object>> entity = new HttpEntity<Map<String, Object>>(paramsMap, headers);

        String result = operations.postForObject(uri, entity, String.class);

        System.out.println(result);

    }
}
