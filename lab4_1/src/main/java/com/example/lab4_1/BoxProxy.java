package com.example.lab4_1;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Material;
import javafx.scene.shape.Box;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BoxProxy {
    private Box box = null;
    private String fileName = null;

    private double height;
    private double width;
    private Material material;

    public BoxProxy(Box box, String imageName){
        this.fileName = imageName;
        this.box = box;
    }

    public void setHeight(double height){
//        if (box==null)
//        {
//            box = new Box();
//        }
//        box.setHeight(height);
        this.height = height;
    }

    public void setWidth(double width){
//        if (box==null)
//        {
//            box = new Box();
//        }
//        box.setWidth(width);
        this.width = width;
    }

    public void setMaterial(Material material){
//        if (box==null)
//        {
//            box = new Box();
//        }
//        box.setMaterial(material);
        this.material = material;
    }

    private double anchorX;
    private double anchorY;
    private double mouseOffsetFromNodeZeroX;
    private double mouseOffsetFromNodeZeroY;

    private double lastX;
    private double lastY;

    public void setOnMousePressed(){
        if (box==null)
        {
            box = new Box();
            box.setMaterial(material);
            box.setWidth(width);
            box.setHeight(height);
        }
        box.setOnMousePressed( event -> {
            anchorX = event.getSceneX();
            anchorY = event.getSceneY();
            mouseOffsetFromNodeZeroX = event.getSceneX() - box.getLayoutX();
            mouseOffsetFromNodeZeroY = event.getSceneY() - box.getLayoutY();
        });
    }

    public void setOnMouseDragged(){
        if (box==null)
        {
            box = new Box();
            box.setMaterial(material);
            box.setWidth(width);
            box.setHeight(height);
        }
        box.setOnMouseDragged( event -> {
            box.setTranslateX(event.getSceneX() - anchorX);
            box.setTranslateY(event.getSceneY() - anchorY);
        });

    }

    public void setOnMouseReleased(){
        if (box==null)
        {
            box = new Box();
            box.setMaterial(material);
            box.setWidth(width);
            box.setHeight(height);
        }
        box.setOnMouseReleased(event -> {
            box.setLayoutX(event.getSceneX() - mouseOffsetFromNodeZeroX);
            box.setLayoutY(event.getSceneY() - mouseOffsetFromNodeZeroY);
            //clear changes from TranslateX and TranslateY
            box.setTranslateX(0);
            box.setTranslateY(0);
            lastX = event.getSceneX() - mouseOffsetFromNodeZeroX;
            lastY = event.getSceneY() - mouseOffsetFromNodeZeroY;
        });
    }

    public ImageView setOnMouseClicked(Pane root, double imageHeight, double imageWeight){
        FileInputStream input = null;
        try {
            input = new FileInputStream("D:\\Architecture\\lab4_1\\src\\main\\java\\com\\example\\lab4_1\\"
                    +fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        if (box==null)
        {
            box = new Box();
            box.setMaterial(material);
            box.setWidth(width);
            box.setHeight(height);
        }
        box.setOnMouseClicked(mouseEvent -> {
                if (mouseEvent.getButton().equals(MouseButton.SECONDARY)) {
                    if (mouseEvent.getClickCount() == 2) {
                        double X = box.getLayoutX() - imageHeight / 2;
                        double Y = box.getLayoutY() - imageWeight / 2;
                        System.out.print(X + "; " + Y);
                        box.setVisible(false);
                        imageView.setLayoutX(X);
                        imageView.setLayoutY(Y);
                        root.getChildren().removeAll();

                        root.getChildren().add(imageView);

                    }
                }
        });

        return imageView;
    }

//    public double getX() {return lastX;}
//    public double getY() {return lastY;}
    public Box getBox() {return box;}
}
