package com.example.labterminal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private RadioButton Assignment;

    @FXML
    private DatePicker Date;

    @FXML
    private RadioButton Quiz;

    @FXML
    private RadioButton examination;

    @FXML
    private TextField obtainedMarks;

    @FXML
    private TextField regNumber;

    @FXML
    private TextField totalMarks;

    @FXML
    void oncalculateTotalMarks(ActionEvent event) {

    }

    @FXML
    void onsaveMarks(ActionEvent event) {
        Double inputObtainedMarks=Double.parseDouble(obtainedMarks.getText());
        Double inputTotalMarks=Double.parseDouble(totalMarks.getText());
        String dateOfMarks=Date.getValue().toString();
        System.out.println("Registration Number: " + regNumber.getText() + " Date: " + dateOfMarks + " Total Marks " + inputTotalMarks + " Obtained Marks " + inputObtainedMarks);




    }

}