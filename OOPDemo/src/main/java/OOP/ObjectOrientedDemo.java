// ==================================================================================================================
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//===================================================================================================================
/*
creating a main() method to call upon other classes etc...
*/
//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ====================================================================================================================
// Assign relevant packages
//======================================================================================================================
package OOP;

// Import relevant packages
//======================================================================================================================


//Create ObjectOrientedDemo Class
//======================================================================================================================
public class ObjectOrientedDemo
{
    public static void main(String [] args)
    {
        Staff staff1 = new Staff("Peter");                                                                            // uses the constr from staff classes to create a new staff name
        staff1.set_hours_worked(160);
        int pay  = staff1.calc_pay(1000,400);
        System.out.println("Pay : " + pay);



        Staff staff2 = new Staff("Jane", "Smith");                                                                            // uses the constr from staff classes to create a new staff name
        staff2.set_hours_worked(80);
        int pay2  = staff2.calc_pay();
        System.out.println("Pay : " + pay2);

        System.out.println("\n\n Updating Jane's Hours Worked to -10");
        staff2.set_hours_worked(-10);
        System.out.println(
                            "\n Hours Worked = " +
                                    staff2.get_hours_worked()
                            );
        System.out.println("Pay = " + pay2);
    }


}
