
/* 
 Simple code to improve upon the previous code by show a table of conversions between gallons and litres.
*/

public class GalToLitTable 
{
    public static void main(String[] args) 
    {
      double gallons, litres; 
      double conversionRate = 3.7854;   //holds the conversion rate between the two.
      int counter = 0;                  // counter for loop.

      // conversion from gallons to litres based on loop.
      //=================================
      for(gallons = 1; gallons <= 100; gallons++)
      {
        litres = gallons * conversionRate; // the actual conversion.

        System.out.println(gallons + " Gallons is converted into " + litres +" Litres"); // displays conversion back to user

        // @ every 10th line, print a blank space  -  so its separated by a block.
        counter++;
        if(counter ==10)
        {
            System.out.println("");
            counter = 0;
        }
      }
    }
}