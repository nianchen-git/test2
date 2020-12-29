package com.nc.test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;


public class Main extends Application {
    private static final double SCREEN_WIDTH = Screen.getPrimary().getVisualBounds().getWidth();
    private static final double SCREEN_HEIGHT = Screen.getPrimary().getVisualBounds().getHeight();
    private Node imageView;

    private String name = "再改一次";
    private String one = "角色1";

    @Override
    public void start(Stage primaryStage) throws Exception {
        int tpNum = (int) (Math.random() * 5) + 1;
        Image bgImg = new Image("file:images/tp" + tpNum + ".jpg");
        ImageView imageView = new ImageView(bgImg);
        double width = bgImg.getWidth()/5;
        double height = bgImg.getHeight()/5;
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        Group rootNode = new Group();
        rootNode.getChildren().add(imageView);
        Scene scene = new Scene(rootNode,SCREEN_WIDTH,SCREEN_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();
//        primaryStage.setTitle("随机显示图像");
        primaryStage.setResizable(false);
        primaryStage.setHeight(SCREEN_HEIGHT);
        primaryStage.setWidth(SCREEN_WIDTH);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        for (Object o: map.values()) {

        }


    }

    private static int two() {
        int[] nums = {1,1,2,3,3};
        if(nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    private static void one() {
        int[] arr = {0,1,0,3,12};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[j] = arr[i];
                if(i != j){
                    arr[i] = 0;
                }
                j++;
            }
        }
        for (int i: arr) {
            System.out.print(i + ",");
        }
    }
}
