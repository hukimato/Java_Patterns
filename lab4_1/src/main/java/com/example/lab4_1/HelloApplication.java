package com.example.lab4_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;

public class HelloApplication extends Application {
    public String imageFileName = null;



    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("title");
        stage.setWidth(300);
        stage.setHeight(300);

        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);

        TextField fileName = new TextField();
        fileName.setPrefColumnCount(20);
        fileName.setPrefWidth(200);
        GridPane.setConstraints(fileName, 2,2);
        grid.getChildren().add(fileName);

        Button submit = new Button("Submit");

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                imageFileName = fileName.getText();

                // Получаем файл картинки
                FileInputStream input = null;
                try {
                    input = new FileInputStream("D:\\Architecture\\lab4_1\\src\\main\\java\\com\\example\\lab4_1\\"
                            +imageFileName);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image image = new Image(input);
                double imageHeight = image.getHeight();
                double imageWeight = image.getWidth();

                // Освобождаем ресурсы (хотя JAVA и сама может)
                image = null;
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Box box = null;
                // Создаем объект прокси для бокса
                BoxProxy boxProxy = new BoxProxy(box, imageFileName);

                boxProxy.setHeight(imageHeight);
                boxProxy.setWidth(imageWeight);

                PhongMaterial material = new PhongMaterial();
                material.setDiffuseColor(Color.DARKBLUE);
                boxProxy.setMaterial(material);




                boxProxy.setOnMousePressed();

                boxProxy.setOnMouseDragged();

                boxProxy.setOnMouseReleased();

                Pane root = new Pane();
                Stage newWindow = new Stage();

                ImageView imageView = boxProxy.setOnMouseClicked(root, imageHeight, imageWeight);



                box = boxProxy.getBox();
                root.getChildren().addAll(box);



                Scene secondScene = new Scene(root, 1000, 800);
                newWindow.setScene(secondScene);
                newWindow.initModality(Modality.WINDOW_MODAL);
                newWindow.initOwner(stage);
                newWindow.setFullScreen(true);
                newWindow.show();
            }
        });

        GridPane.setConstraints(submit, 2,3);
        grid.getChildren().add(submit);

        Scene scene = new Scene(grid, 300,300);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}