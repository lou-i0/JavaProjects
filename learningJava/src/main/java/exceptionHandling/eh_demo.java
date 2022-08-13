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
import java.util.Scanner;                                                                                               // Used to allow user input

//initiate the public class code will be under
//======================================================================================================================
public class eh_demo
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
        int num, deno;                                                                                                  // variables for numerator and denominator (division)

        // Example try catch finally statement
        //==============================================================================================================
        try                                                                                                             // try will run the code inside if no errors / sucessful
        {
            System.out.println("-- Start of code -- " );
            System.out.println(" Please enter the numerator please: ");
            num = input.nextInt();

            System.out.println(" Great, now enter the denominator please: ");
            deno  = input.nextInt();

            System.out.println(" Thank you, and the answer is : " + (num / deno));
        }
        catch (Exception e)                                                                                                          // if an error occurs, will provide a message as to why
        {
            System.out.println(" an error has occurred : " + e.getMessage());
        }
        finally
        {
         System.out.println( "-- End of the code, thanks -- ");
        }
    }
}