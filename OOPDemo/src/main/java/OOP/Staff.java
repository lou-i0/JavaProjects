// ==================================================================================================================
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//===================================================================================================================
/*
Creating a class

classes are like blueprint of a building , with the object being the building itself.

how to declare a class:
Access Modifier class Classname
{
    // contents of the class
    // including fields, constructors and methods.
    // methods  -  think of them like functions
    // fields  -  variables used within a method / class
    // constructor - code used to 'construct' an object from the class - always name as class. initialises class fields
}
*/
//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ====================================================================================================================
// Assign relevant packages
//======================================================================================================================
package OOP;

// Import relevant packages
//======================================================================================================================


import java.util.concurrent.TimeUnit;

//initiate the public class code will be under
//======================================================================================================================
public class Staff
{                                                                                                                       // private indicates that only this class can access/modify it

    private String staff_name;
    private final int  hour_rate = 30;                                                                                  // final indicates that the value CANNOT be changed  after creation.
    private int hours_worked;
    // =================================================================================================================
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // =================================================================================================================
    // METHODS
    // =================================================================================================================
    // public   - the method can be accessed everywhere (not just this class).
    //------------------------------------------------------------------------------------------------------------------
    // void     - when a method does not return any result after performing its task.
    //------------------------------------------------------------------------------------------------------------------
    // simple method to print a message once activated
    //------------------------------------------------------------------------------------------------------------------

    public void print_msg()                                                                                             // () is where we would put parameters for the method to pass in
    {
        System.out.println("Calculating Pay...");
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    // Method to calculate pay  of each emp, and returns result of calc
    //------------------------------------------------------------------------------------------------------------------
    public int calc_pay()
    {
        print_msg();
        int staff_pay;                                                                                                  // A Local variable that only exists in the method.
        staff_pay = hours_worked * hour_rate;

        if (hours_worked > 0)
        {
            return staff_pay;
        }
        else
        {
            return -1;                                                                                                  // to execute the method when there is nothing to return
        }
    }
    // Another  Method to calculate pay  of each emp, and returns result of calc (for overloading purposes)
    //------------------------------------------------------------------------------------------------------------------
    public int calc_pay(int bonus, int allowance)
    {
        print_msg();
        if (hours_worked > 0)
        {
            return hours_worked * hour_rate + bonus + allowance;
        }
        else
        {
            return 0;
        }
    }
    // Method to set the hours worked for an employee
    //------------------------------------------------------------------------------------------------------------------
    public void set_hours_worked(int hours)
    {
        if (hours >0)
        {
            hours_worked = hours;
        }
        else
        {
            System.out.println("Error: Hours worked cannot be smaller than zero I'm afraid.");
            System.out.println("Therefore, hours worked has not been updated at present.");
        }
    }
    // Method to set the hours worked for an employee
    //------------------------------------------------------------------------------------------------------------------
    public int get_hours_worked()
    {
        return hours_worked;
    }
    // =================================================================================================================
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // =================================================================================================================
    // CONSTRUCTORS
    //==================================================================================================================
    // Constructor to initialise the name of staff
    //------------------------------------------------------------------------------------------------------------------
    public Staff (String name)                                                                                          // takes name variable as input for constructor
    {
        staff_name = name;
        System.out.println("\n" + staff_name);
        System.out.println("=======================================================================================");
    }

    // Constructor to get first and last name of staff (similar to above, but different)
    //------------------------------------------------------------------------------------------------------------------
    public Staff( String first_name, String last_name)
    {
        staff_name = first_name + " "  + last_name;
        System.out.println("\n" + staff_name);
        System.out.println("=======================================================================================");

    }
}