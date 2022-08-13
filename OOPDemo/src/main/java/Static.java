// ==================================================================================================================
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//===================================================================================================================
/*
Examples of using static to use fields in a class without having to create a class object.
*/
//=====================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ====================================================================================================================
// Assign relevant packages
//======================================================================================================================
package StaticTest;

 class classy
{
    // Non static field and method
    public String message = "Hello World";
    public void displaymsg()
    {
        System.out.println("Message = " + message);
    }

    // Static field and method
    public static String greetings = "Good Morning";
    public static void displayGreetings()
    {
        System.out.println("Greetings = " + greetings);
    }
}

public class Static
{
    public static void main(String[] args)
    {
        classy sd  = new classy();
        System.out.println(sd.message);
        sd.displaymsg();


        System.out.println(classy.greetings);
        classy.displayGreetings();
    }
}









