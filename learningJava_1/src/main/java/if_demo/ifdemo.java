//=====================================================================================================================
// ACCEPTING USER INPUT
// Java file to test accepting input from a user to assgn to variables etc...
//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Assign relevant packages
//======================================================================================================================
package if_demo;

// Import relevant packages
//======================================================================================================================
import java.util.Scanner;                                                                                               // Used to allow user input

//initiate the public class code will be under
//======================================================================================================================
public class ifdemo
{
    // instantiate main method for code to be under for now
    //==================================================================================================================
    public static void main(String[] args)                                                                              // main method to be called where all code goes into.
    {
        //instantiate new objects
        //==============================================================================================================
        Scanner input = new Scanner(System.in);                                                                         //Setting up a new reader to read in user input

        System.out.println("Please enter your age: ");
        int age = input.nextInt();                                                                                      //Stores Integer provided by the user

        // Standard if statement examples
        //==============================================================================================================
        if (age < 0 || age > 100)                                                                                        //Check age is within the range of 0 and 100 (Positive)
        {
            System.out.println("Wrong answer!");
            System.out.println("Answer must be Grater than 0 and less than 100");
        }
        else if (age < 18)
        {
          System.out.println("Sorry Chief, but you are underage for this program, go away!");
        }
        else if (age < 21)
        {
            System.out.println("No worries Chief, but you will need parental consent before using this program :)");
        }
        else
        {
            System.out.println("Congratulations!");
            System.out.println("You are old enough to attend the program, enjoy!");
        }
        // Ternary operator
        //==============================================================================================================
        //condition ? values to return if condition is true:
        // value to return if condition is false.

        int num = (3 > 2) ? 10 : 5;
        System.out.println(num);

        // Switch statements
        //==============================================================================================================
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



    }

}
