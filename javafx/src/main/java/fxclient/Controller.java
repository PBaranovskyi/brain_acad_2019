package fxclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class Controller {

    @FXML
    Label label;

    @FXML
    Button usersButton;

    @FXML
    ListView<User> listView;

    @FXML
    public void onClickMethod() {
        List<User> users = getUsers();
        label.setText(users.toString());


        ObservableList<User> data = FXCollections.observableArrayList(users);

        listView.setCellFactory(param -> new ListCell<User>() {
            @Override
            protected void updateItem(User user, boolean empty) {
                super.updateItem(user, empty);

                if (empty || user == null || user.getName() == null) {
                    setText(null);
                } else {
                    setText(user.getName());
                }
            }
        });

        listView.setItems(data);
//
//        ObservableList<String> data = FXCollections.observableArrayList(
//                users.stream()
//                        .map(User::getName).toArray(String[]::new));

    }

    public List<User> getUsers() {
        final String uri = "http://localhost:8080/users";

        RestTemplate operations = new RestTemplate();
        String json = operations.getForObject(uri, String.class);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            User[] users = objectMapper.readValue(json, User[].class);
            return Arrays.asList(users);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }


}
