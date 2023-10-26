package com.example.myfirstgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ListView list;

    @FXML
    private TextField inputText;

    @FXML
    protected void onAddButtonClick() {
        list.getItems().add(inputText.getText());

    }

    @FXML
    protected void onViewSelect(){
        inputText.setText("Zhenishbek");
    }

    @FXML
    protected void closeApp(){
        javafx.application.Platform.exit();
    }

}