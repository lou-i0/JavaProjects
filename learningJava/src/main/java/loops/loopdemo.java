//=====================================================================================================================
/* Loop statement examples
to see how for loops, enhanced for loops,while loops , and do-while loops are done in java

--example syntax of for loops:
------------------------------------------------------------------------------------------------------------------------
for (initial value: test condition: mod to value)
{
  do something
}
--example syntax for echanced for loop statement is:
------------------------------------------------------------------------------------------------------------------------
for (variables declaration: name of array)
{
 do something
}

--example syntax for while loop:
------------------------------------------------------------------------------------------------------------------------
while(condition is true)
{
    do something
}

-- exmaple do while statement
------------------------------------------------------------------------------------------------------------------------
do
{
    do something
}
while
{condition is true}

*/


//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Assign relevant packages
//======================================================================================================================
package loops;

// Import relevant packages
//======================================================================================================================
import java.util.Scanner;                                                                                               // Used to allow user input

//initiate the public class code will be under
//======================================================================================================================
public class loopdemo {
    // instantiate main method for code to be under for now
    //==================================================================================================================
    public static void main(String[] args)                                                                              // main method to be called where all code goes into.
    {
        //instantiate new objects
        //==============================================================================================================
        Scanner input = new Scanner(System.in);                                                                         //Setting up a new reader to read in user input

        // Variables to place here
        //==============================================================================================================
        int i;                                                                                                          // create variable i (for iteration in for loops usually)
        int i2;
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        int counter = 5;                                                                                                // counter that is need for while loops usually
        int counter2 = 100;

/*
        // Simple for loop example
        //==============================================================================================================
        for (i = 0; i < 6; i++)
        {
            System.out.println("The number is: " + i);
        }

        // Simple for loop example with array
        //==============================================================================================================
        for (i = 0; i< numbers.length; i++)
        {
            System.out.println("The number is : " + numbers[i]);
        }

        // Enhanced for loop example
        //==============================================================================================================
        for (int item:numbers)
        {
            System.out.println(item);
        }

        // Example while loop example
        //==============================================================================================================
        while (counter > -1)
        {
            System.out.println(" Counter is : " + counter);
            counter = counter - 1;
        }
        // Do while loop example
        //==============================================================================================================
        do
        {
            System.out.println("Counter = " + counter2);
            counter2++;
        }
        while(counter2 < 105);


        // for loop with branching statement - break (exit a loop early if condition is met)
        //==============================================================================================================
        for (i2 = 0; i2 < 5; i2++)
        {
            System.out.println("i = " + i2);
            if (i2 == 4)
            {
                break;
            }
        }

 */
        // for loop with branching statement - continue (skip the rest of the loop for the next iteration)
        //==============================================================================================================
        for (i2 = 0; i2 < 10; i2++)
        {
            System.out.println("i = " + i2);
            if (i2 == 5)
            {
                continue;

            }
            System.out.println(" I will not be printed if i  = 5");
        }
    }
}