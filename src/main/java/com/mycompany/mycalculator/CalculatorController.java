/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mycalculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asuzu Audrey
 */
public class CalculatorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Label label;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button zero;
    @FXML
    Button clear;
    @FXML
    Button divide;
    @FXML
    Button add;
    @FXML
    Button subtract;
    @FXML
    Button multiply;
    @FXML
    Button equals;
    @FXML
    TextField textfield;

    long num1;
    long num2;
    double decnum1;
    double decnum2;
    String op = "";

    public void clear() {
        textfield.clear();
        label.setText("");
    }

    public void point_click() {
        if(!textfield.getText().endsWith(".")){
        String oldvalue = textfield.getText();
        String entry = ".";
        textfield.setText(oldvalue + entry);}
    }

    public void one_click() {
        String oldvalue = textfield.getText();
        String entry = "1";
        textfield.setText(oldvalue + entry);
    }

    public void two_click() {
        String oldvalue = textfield.getText();
        String entry = "2";
        textfield.setText(oldvalue + entry);
    }

    public void three_click() {
        String oldvalue = textfield.getText();
        String entry = "3";
        textfield.setText(oldvalue + entry);
    }

    public void four_click() {
        String oldvalue = textfield.getText();
        String entry = "4";
        textfield.setText(oldvalue + entry);
    }

    public void five_click() {
        String oldvalue = textfield.getText();
        String entry = "5";
        textfield.setText(oldvalue + entry);
    }

    public void six_click() {
        String oldvalue = textfield.getText();
        String entry = "6";
        textfield.setText(oldvalue + entry);
    }

    public void seven_click() {
        String oldvalue = textfield.getText();
        String entry = "7";
        textfield.setText(oldvalue + entry);
    }

    public void eight_click() {
        String oldvalue = textfield.getText();
        String entry = "8";
        textfield.setText(oldvalue + entry);
    }

    public void nine_click() {
        String oldvalue = textfield.getText();
        String entry = "9";
        textfield.setText(oldvalue + entry);
    }

    public void zero_click() {
        String oldvalue = textfield.getText();
        String entry = "0";
        textfield.setText(oldvalue + entry);
    }

    public void add_click() {
        try{
        String firstvalue;
        long num1;

        if (textfield.getText().contains(op)) {
            equal_click();
        }
        firstvalue = textfield.getText();

        if (textfield.getText().isEmpty()) {
            firstvalue = "0";
            num1 = Integer.parseInt(firstvalue);
            this.num1 = num1;
            textfield.setText(firstvalue + "+");
        }

            if (firstvalue.contains(".")) {
                double decnum1 = Double.parseDouble(firstvalue);
                this.decnum1 = decnum1;
                textfield.setText(firstvalue + "+");
            } else {
                num1 = Integer.parseInt(firstvalue);
                this.num1 = num1;
                textfield.setText(firstvalue + "+");
            }
          
        
        op = "+";
        } catch (NumberFormatException e){
        }
    }

    public void sub_click() {
      try{
        String firstvalue;
        long num1;

        if (textfield.getText().contains(op)) {
            equal_click();
        }
        firstvalue = textfield.getText();

        if (textfield.getText().isEmpty()) {
            firstvalue = "0";
            num1 = Integer.parseInt(firstvalue);
            this.num1 = num1;
            textfield.setText(firstvalue + "-");
        }

            if (firstvalue.contains(".")) {
                double decnum1 = Double.parseDouble(firstvalue);
                this.decnum1 = decnum1;
                textfield.setText(firstvalue + "-");
            } else {
                num1 = Integer.parseInt(firstvalue);
                this.num1 = num1;
                textfield.setText(firstvalue + "-");
            }
          
        
        op = "-";
        } catch (NumberFormatException e){
        }
    }

    public void div_click() {
          try{
        String firstvalue;
        long num1;

        if (textfield.getText().contains(op)) {
            equal_click();
        }
        firstvalue = textfield.getText();

        if (textfield.getText().isEmpty()) {
            firstvalue = "0";
            num1 = Integer.parseInt(firstvalue);
            this.num1 = num1;
            textfield.setText(firstvalue + "/");
        }

      
            if (firstvalue.contains(".")) {
                double decnum1 = Double.parseDouble(firstvalue);
                this.decnum1 = decnum1;
                textfield.setText(firstvalue + "/");
            } else {
                num1 = Integer.parseInt(firstvalue);
                this.num1 = num1;
                textfield.setText(firstvalue + "/");
            }
          
        
        op = "/";
        } catch (NumberFormatException e){
        }
    }

    public void multi_click() {
        try{
        String firstvalue;
        long num1;

        if (textfield.getText().contains(op)) {
            equal_click();
        }
        firstvalue = textfield.getText();

        if (textfield.getText().isEmpty()) {
            firstvalue = "0";
            num1 = Integer.parseInt(firstvalue);
            this.num1 = num1;
            textfield.setText(firstvalue + "X");
        }

  
            if (firstvalue.contains(".")) {
                double decnum1 = Double.parseDouble(firstvalue);
                this.decnum1 = decnum1;
                textfield.setText(firstvalue + "X");
            } else {
                num1 = Integer.parseInt(firstvalue);
                this.num1 = num1;
                textfield.setText(firstvalue + "X");
            }
          
        
        op = "X";
        } catch (NumberFormatException e){
        }
    }

    public void equal_click() {
        try{
        switch (op) {

            case "+":
                String secondvalue = StringUtils.substringAfter(textfield.getText(), op);
                String firstvalue = StringUtils.substringBefore(textfield.getText(), op);
                if (secondvalue.contains(".") || firstvalue.contains(".")) {
                    this.num2 = new Double(Double.parseDouble(secondvalue)).longValue();
                    double decsystem = Double.parseDouble(firstvalue) + Double.parseDouble(secondvalue);
                    textfield.setText(String.valueOf(decsystem));
                    label.setText(firstvalue + op + Double.parseDouble(secondvalue));
                } else {
                    this.num2 = Integer.parseInt(secondvalue);
                    long system = this.num1 + this.num2;
                    textfield.setText(String.valueOf(system));
                    //     String oldlabel = label.getText();
                    label.setText(num1 + op + num2);
                }
                break;
            case "-":
                String subvalue2 = StringUtils.substringAfter(textfield.getText(), op);
                String subvalue1 = StringUtils.substringBefore(textfield.getText(), op);
                //  String subvalue1 = firstinput

                if (subvalue2.contains(".") || subvalue1.contains(".")) {
                    double decsystem = Double.parseDouble(subvalue1) - Double.parseDouble(subvalue2);
                    textfield.setText(String.valueOf(decsystem));
                    label.setText(subvalue1 + op + Double.parseDouble(subvalue2));
                } else {
                    this.num2 = Integer.parseInt(subvalue2);
                    long subsystem = this.num1 - this.num2;
                    textfield.setText(String.valueOf(subsystem));
                    //  String suboldlabel = label.getText();
                    label.setText(num1 + op + num2);
                }
                break;
            case "/":
                try {
                String divvalue2 = StringUtils.substringAfter(textfield.getText(), op);
                String divvalue1 = StringUtils.substringBefore(textfield.getText(), op);
                //  String subvalue1 = StringUtils.substringAfter(textfield.getText(), op);

                if (divvalue1.contains(".") || divvalue2.contains(".")) {
                    double divsystem = Double.parseDouble(divvalue1) / Double.parseDouble(divvalue2);
                    textfield.setText(String.valueOf(divsystem));
                    label.setText(divvalue1 + op + Double.parseDouble(divvalue2));
                } else {
                    this.num2 = Integer.parseInt(divvalue2);
                  
                    long divsystem = this.num1 / this.num2;
                    textfield.setText(String.valueOf(divsystem));
                    //  String divoldlabel = label.getText();
                    label.setText(num1 + op + num2);
                }
            } catch (ArithmeticException e) {
                textfield.setText("Syntax error!");
            }
            break;
            case "X":
                String multivalue2 = StringUtils.substringAfter(textfield.getText(), op);
                String multivalue1 = StringUtils.substringBefore(textfield.getText(), op);
                //  String subvalue1 = StringUtils.substringAfter(textfield.getText(), op);

                if (multivalue2.contains(".") || multivalue1.contains(".")) {
                    this.num2 = new Double(Double.parseDouble(multivalue2)).longValue();
                    double decsystem = Double.parseDouble(multivalue1) * Double.parseDouble(multivalue2);
                    textfield.setText(String.valueOf(decsystem));
                    label.setText(multivalue1 + op + Double.parseDouble(multivalue2));
                } else {
                    this.num2 = Integer.parseInt(multivalue2);
                    long multisystem = this.num1 * this.num2;
                    textfield.setText(String.valueOf(multisystem));
                    //  String multioldlabel = label.getText();
                    label.setText(num1 + op + num2);
                }
                break;

        }}catch(NumberFormatException e){}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       textfield.setFocusTraversable(false);
    }

}
