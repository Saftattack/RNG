package com.example.rng;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class RNGCONT {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField inputField;

    private Random rand = new Random();

    @FXML
    protected void onButtonClick() {
        try {

            int range = Integer.parseInt(inputField.getText());

            if (range > 0) {

                int randomInt = rand.nextInt(range);
                welcomeText.setText(String.valueOf(randomInt));
            } else {
                welcomeText.setText("Enter a positive number!");
            }
        } catch (NumberFormatException e) {
            welcomeText.setText("Invalid input!");
        }
    }

    @FXML
    public void onFillField(ActionEvent actionEvent) {
        // This can be used for additional behavior if needed.
    }
}
