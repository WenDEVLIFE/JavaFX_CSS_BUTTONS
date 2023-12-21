package com.example.buttoncuztomizations;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.awt.Desktop;
import java.net.URI;
import java.net.URI;

public class ButtonController {


    @FXML
    private Label buttonsettext;

    @FXML
    void SetText_Action(ActionEvent event) {
        String buttonset= "Button1:Follow me on github";
        buttonsettext.setText(buttonset);

    }

    @FXML
    void SetText_Action1(ActionEvent event) {
        String buttonset1= "Button2:WenDEVLIFE";
        buttonsettext.setText(buttonset1);

    }

    @FXML
    void SetText_Action2(ActionEvent event) {
        String buttonset2= "Button3:Credits to Channel Ai";
        buttonsettext.setText(buttonset2);

    }

    @FXML
    void SetText_Action3(ActionEvent event) {
        String buttonset3= "ButtonALL: JAVAFX AND CSS";
        buttonsettext.setText(buttonset3);

    }
    @FXML
    void OpenWebsite(ActionEvent event) {
    try{
        String youtubeurl ="https://www.youtube.com/watch?v=8QVocm9VbK4";

        URI uri = new URI(youtubeurl);

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();

            desktop.browse(uri);
        }
        else {
            System.out.println("Desktop is not supported. Please open the browser manually and navigate to: " + youtubeurl);
        }


    }catch(Exception e){

    }
    }
    @FXML
    void alertmessage(ActionEvent event){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Button Message");
        alert.setContentText("Hello World");
        alert.showAndWait();
    }


}