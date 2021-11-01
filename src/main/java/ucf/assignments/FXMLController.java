/*
 *  UCF COP3330 Fall 2021 Assignment 4 FXMLController Class  file
 *  Copyright 2021 Celina Alzenor
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {


    //list related
    public Button addLi;
    public TextField listField;
    public MenuItem removList;
    public MenuItem saveList;
    public MenuItem loadList;
    public MenuItem saveAll;
    public MenuItem loadMulti;

    //task related
    public Button newTask;
    public TextField descriptionField;
    public TextField dueDateField;
    public MenuItem remTask;
    public RadioButton displayAll;
    public RadioButton displayInc;
    public RadioButton displayComp;


    // table related
    public ListView<HashMap<Lists,Task>> list;
    public TableView<Task> tableView;
    public TableColumn<Task,String> descriptCol;
    public TableColumn<Task,String> dueDateCol;
    public TableColumn<Task,String> CheckCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

       //using setCellValueFactory initialize the columns of the tableView
        //set property value of descriptCol to "description"
        //set property value of dueDateCol to "dueDate"
        //set property value of CheckCol to "completed"

        //initalize togglegroup radioGroup
        //set radio button's group as radioGroup

       //to allow user to edit the columns to change due date, description, and completion status
       //set tableView to editable
       //update each column's setCellFactory to the text field of the cell

   }

    //this method will allow a user to display only completed tasks
    public int displayComp()
   {
       /*
       initialize a fitleredList and display all data
       set the filter predicate when the filter changes
       if no boxes are checked, display none
       compare the row's completion status with a checked check-box
       if it is a match return true to the predicate
       if it doesn't match return false to the predicate
       put the filtered list in a sorted list
       user the comparator to put the sorted list in the tableview
       add the sorted list to the tableview

        return 1 to signify success
       */

   }

   //this method will allow a user to display only incomplete tasks
    public int displayIncomp()
    {
        /*
       initialize a fitleredList and display all data
       set the filter predicate when the filter changes
       if all boxes are checked, display none
       compare the row's completion status with an unchecked check-box
       if it is a match return true to the predicate
       if it doesn't match return false to the predicate
       put the filtered list in a sorted list
       user the comparator to put the sorted list in the tableview
       add the sorted list to the tableview

        return 1 to signify success

       */

    }


   //this method will allow the user to change the description by double-clicking on the cell
    public int changeDescript(TableColumn.CellEditEvent editedCell)
    {
        //initialize the selected cell
        //set the description of the selected cell to the value of the edited cell
        //return 1 to signify success

    }

    //this method will allow the user to change the due date by double-clicking on the cell
    public int changeDate(TableColumn.CellEditEvent editedCell)
    {
        //initialize the selected cell
        //set the description of the selected cell to the value of the edited cell
        //return 1 to signify success

    }

    //this method will allow the user to change the completion status by double-clicking on the cell
    public int changeComp(TableColumn.CellEditEvent editedCell)
    {
        //initialize the selected cell
        //set the description of the selected cell to the value of the edited cell
        //return 1 to signify success

    }


    //adds a list
    @FXML
    public int addListButton() {

       //when addLi is pressed
        // new ArrayList will be generated with the key being the string from the listField and the task being blank
        // copy arrayList to observable List

        //return 1 to signify success

    }

    //removes a list
    public int removeListButton()
    {
        //user right clicks and selects remove list
        //removList is triggered and gets the selected cell and removed it from the listView
        //return 1 to signify success


    }

    //adds a task to a list
    public int addTaskButton()
    {
        //user clicks add task button
        //with selected list highlighted, a new task will be added to that list in tableView
        //using the description field, the complete field, snd the due date field
        //using isValid, valid that the due date is in the correct format
        //return 1 to signify success


    }


    //removes a task from a list
    public int removeTaskButton() {
        //user right clicks and selects remove task
        //remTask is triggered and gets the selected cell and removed it from the tableView
        //return 1 to signify success

    }

    //save a single list
    public int saveListButton()
    {
        //user right clicks on listView and selects save list
        //saveList is triggered
        //open save dialog from desktop
        //save selected cell
        //return 1 to signify success


    }

    //load a single list
    public int loadListButton()
    {
        //user right clicks on listView and selects save list
        //loadList is triggered
        //open open-dialog from desktop
        //open selected file
        //return 1 to signify success

    }

    //save all the lists in the list manager
    public int saveAllButton()
    {
        //user clicks on menubar and selects file
        //user selects save all
        //saveALl is triggered
        //select all cells in listView
        //open save-dialog from desktop
        //save all cells
        //return 1 to signify success

    }

    //load mulitple lists from file explorer
    public int loadMultiButton()
    {
        //user clicks on menubar and selects file
        //user selects load multiple lists
        //loadALl is triggered
        //open open-dialog from desktop
        //allow user to select multiple lists from file explorer
        //open all lists
        //return 1 to signify success

    }

    //checks if user inputted a valid date in the correct format
    public static boolean isValid(String date)
    {
        //if date is null or does not have valid range of months or days
        //return false

        //initialize simpledateformat for yyyy-mm-dd format

        /*set up a try and catch
        try parsing date
        if it matches simpledateformat
        return true*/

        //catch exceptions
        //return false

    }

}
