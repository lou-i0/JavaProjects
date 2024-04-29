//=====================================================================================================================
// SWITCH STATEMENTS EXAMPLES
// Java file to test accepting using switch statements (think of them as CASE statements in SQL)
//similar to if (think case statement in SQL)
//switch (variable for switching)
//{
//  case firstcase:
//  do A;
//  break;
//  case secondcase:
//  do B;
//  break;
//  default:
//  do C;
//  break;
//}

//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Assign relevant packages
//======================================================================================================================
package switch_demo;

// Import relevant packages
//======================================================================================================================
import java.util.Locale;
import java.util.Scanner;                                                                                               // Used to allow user input

//initiate the public class code will be under
//======================================================================================================================
public class switchdemo {
    // instantiate main method for code to be under for now
    //==================================================================================================================
    public static void main(String[] args)                                                                              // main method to be called where all code goes into.
    {
        //instantiate new objects
        //==============================================================================================================
        Scanner input = new Scanner(System.in);                                                                         //Setting up a new reader to read in user input

        System.out.println("Please enter your grade: ");
        String ugrade = input.nextLine().toUpperCase();                                                                 //Stores Integer provided by the user

        // Switch statements based on grade received
        //==============================================================================================================
        switch (ugrade) {
            case "A+":
                System.out.println("You have earned the grade of Distinction");
                break;
            case "A":
                System.out.println("You have earned the grade of Distinction");
                break;
            case "B":
                System.out.println("You have earned the grade of Merit");
                break;
            case "C":
                System.out.println("You have earned the grade of Pass");
                break;
            default:
                System.out.println("Unfortunately this will constitute as a fail");
                break;
        }

    }
}