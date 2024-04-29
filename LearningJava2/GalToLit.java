

/* 
 Simple code to convert from Gallons to litres in Java.
*/

public class GalToLit 
{
    public static void main(String[] args) 
    {
      double gallons;                   // holds number of gallons
      double litres;                    // holds number of litres

      double conversionRate = 3.7854;   //holds the conversion rate between the two.

      // conversion from gallons to litres
      //=================================
      gallons               = 10;

      litres                = gallons * conversionRate;

      System.out.println(gallons  + " gallons into litres is: " + litres + " litres." );
    }
}
