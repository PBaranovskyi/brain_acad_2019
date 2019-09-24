package tereshchenko_roman.myWindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MyWindow extends Application {

    static Scene scene;

    public static void main(String[] args) {

        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MyFlow.fxml"));
        Scene buttonScene = new Scene(root, 500, 300, Color.RED);
        scene = buttonScene;

//        for (int i = 0; i < 10; i++) {
//            Button newButton = new Button("My Button " + i);
////            newButton.setLayoutX(i*10 + 100);
////            newButton.setLayoutY(100);
////            newButton.setOnAction(new EventHandler<ActionEvent>() {
////                @Override
////                public void handle(ActionEvent event) {
////                    primaryStage.setTitle(newButton.getText());
////                    buttonScene.setFill(Paint.valueOf("#008B8B"));
////                }
////            });
//            newButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent event) {
//                    buttonScene.setFill(Color.BLACK);
//                }
//            });
//            ourParent.getChildren().add(newButton);
//        }





        primaryStage.setScene(buttonScene);

        primaryStage.setMaxWidth(1000);
        primaryStage.setMaxHeight(500);
        primaryStage.show();

    }

    public void click(ActionEvent actionEvent) {
        scene.setFill(Color.BLACK);
    }
}
