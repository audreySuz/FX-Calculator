/* doesn't work with source level 1.8:
module com.mycompany.mycalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mycalculator to javafx.fxml;
    exports com.mycompany.mycalculator;
}
*/
