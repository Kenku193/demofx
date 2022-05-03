package com.example.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;

import java.io.*;

public class HelloController {
    @FXML
    private Label mode1insertKeyLabel;

    @FXML
    private TextField mode1insertKeyField;


    @FXML
    protected void onChooseFileClick(ActionEvent event) throws IOException{
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {

        FileWriter fileWriter = new FileWriter("coded.txt");
            fileWriter.write(String.valueOf(mode1insertKeyField.getText()));
            fileWriter.flush();
    }

}