package ung.mccb.csci.csci3300.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ung.mccb.csci.csci3300.model.Student;


import java.io.IOException;

public class Controller {
    @FXML
    TextField txtFirstname, txtLastname, txtCardinfo, txtCarmake, txtCarmodel, txtCaryear, txtCarcolor, txtCartag;

    public void submitRecord(ActionEvent actionEvent) throws IOException {

        Student student1 = new Student();
        student1.setFirstname(txtFirstname.getText());
        student1.setLastname(txtLastname.getText());
        student1.setCardinfo(txtCardinfo.getText());
        student1.setCarmake(txtCarmake.getText());
        student1.setCarmodel(txtCarmodel.getText());
        student1.setCaryear(txtCaryear.getText());
        student1.setCarcolor(txtCarcolor.getText());
        student1.setCartag(txtCartag.getText());


        int result = student1.saveRecord();


    }


}