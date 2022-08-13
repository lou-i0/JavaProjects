//=====================================================================================================================
/* Exception Handling Examples
to see how to deal with the code when an error occurs

Syntax of a try-catch-finally statement:

try
{
     do something
}
catch (type of error)
{
    do something when an error ocurs.
}
finally
{
    do this regardless of what happens above . this step is technically optional :)))
}
*/


//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Assign relevant packages
//======================================================================================================================
package exceptionHandling;

// Import relevant packages
//======================================================================================================================
import java.util.Arrays;
import java.util.Scanner;                                                                                               // Used to allow user input
import java.util.InputMismatchException;                                                                                // Used to handle errors due to incorrect user input.

//initiate the public class code will be under
//======================================================================================================================
public class eh_demo2
{
    // instantiate main method for code to be under for now
    //==================================================================================================================
    public static void main(String[] args)                                                                              // main method to be called where all code goes into.
    {
        //instantiate new objects
        //==============================================================================================================
        Scanner input = new Scanner(System.in);                                                                         //Setting up a new reader to read in user input

        // Variables to place here
        //==============================================================================================================
        int choice = 0;                                                                                                  //
        int [] numbers = {10,11,12,13,14,15};

        System.out.println("-- Start of code -- ");
        System.out.println("Please enter the index of the array you wish to see (1-5)");

        // Example try catch finally statement
        //==============================================================================================================

        try                                                                                                             // try will run the code inside if no errors / sucessful
        {
            choice = input.nextInt();
            if (choice == 0)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);

        }
        catch (ArrayIndexOutOfBoundsException e)                                                                                                          // if an error occurs, will provide a message as to why
        {
            System.out.println(" An error has occurred due to invalid index : " + e.getMessage());
        }
        catch (InputMismatchException e)                                                                                                          // if an error occurs, will provide a message as to why
        {
            System.out.println(" An error has occurred due to not an integer : " + e.getMessage());
        }
        catch (Exception e)                                                                                                          // if an error occurs, will provide a message as to why
        {
            System.out.println(" Qn error has occurred due to : " + e.getMessage());
        }
        finally
        {
            System.out.println( "-- End of the code, thanks -- ");
        }

        // Example to throw an exception
        //==============================================================================================================
    }
}