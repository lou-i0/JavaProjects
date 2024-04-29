//=====================================================================================================================
// ACCEPTING USER INPUT
// Java file to test accepting input from a user to assgn to variables etc...
//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Assign relevant packages
//======================================================================================================================
package input_demo;

// Import relevant packages
//======================================================================================================================
import java.util.Scanner;                                                                                               // Used to allow user input

//initiate the public class code will be under
//======================================================================================================================
public class user_input
{
    // instantiate main method for code to be under for now
    //==================================================================================================================
    public static void main(String[] args)                                                                              // main method to be called where all code goes into.
    {
        //instantiate new objects
        //==============================================================================================================
        Scanner input = new Scanner(System.in);                                                                         //Setting up a new reader to read in user input

        // Take user input with scripts
        //--------------------------------------------------------------------------------------------------------------
        System.out.print("Well hello there! Please enter an integer to continue: ");
        int uint = input.nextInt();                                                                                     // Stores the integer provided by the user

        System.out.print("Thank you, and now for a double please: ");
        double udbl = input.nextDouble();                                                                               // Stores the double provided by the user.

        System.out.print("So far so good fellow human, now i want some text please: ");
        input.nextLine();
        String ustring = input.nextLine();                                                                              // Stores the string provided by the user. needed a new nextLine, because of the interation with the double above



        System.out.printf("We have seen that you have entered the following integer : %d %n", uint);
        System.out.printf("As well as the following double : %.2f %n", udbl);
        System.out.printf("And finally, the text you blabbered on with : \"%s\" %n", ustring);


    }

}
