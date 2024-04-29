/* 
An example of showing the difference between int and double data types 
*/

public class Example3 
{
    public static void main(String[] args) 
    {
        int var; //declares an integer variable
        double x;       // declares a double variable

        var = 10;       //assign value to var

        x = 10.0;       // assign value to x 

        System.out.println("Original Value of var: " + var);
        System.out.println(); //blank line
        System.out.println("Original Value of x: " + x);
        System.out.println(); //blank line

        // divide both by 4
        var = var / 4;
        x = x / 4;

        System.out.println("new value of var: " + var);
        System.out.println(); //blank line
        System.out.println("new value of x " + x); 


    }
}
