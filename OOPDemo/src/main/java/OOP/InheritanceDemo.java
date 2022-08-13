package OOP;
//import relevant libraries


// to learn about the concept of Inheritance, a key concept in java and all oop programming.

// to create a class called member , to work out who is a vip member, or a peasant member.

import java.util.Scanner;
//======================================================================================================================
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//======================================================================================================================
// Parent class - member
//======================================================================================================================
abstract class Member
{
    //==================================================================================================================
    // Variables
    //==================================================================================================================
    public String welcome = "Hello, and welcome to Instone Fitness.";                   // add a welcome to when a member enters the app
    protected   double  annualfee;                                                      // How much a member pays, not to be
    private     String  name;                                                           // Name of member
    private     int     memberID;                                                       // unique ID for each member
    private     int     memberSince;                                                    // How long a member has been with us
    private     int     discount;                                                       // Any discounts the member is/was eligible for

    //==================================================================================================================
    // Constructors
    //==================================================================================================================
    private void Member()                                                               // Constructor for ?
    {
        System.out.println("Parent Constructor with no parameter.");
    }

    public Member (String pname, int pmemberID, int pmembersince)                       // Constructor to take name, member id and how long the have been a member for
    {
        System.out.println("Parent Constructor with 3 paramerters declared.");
        name        = pname;                                                            // assign pname parameter to name variable. to capture a members names
        memberID    = pmemberID;                                                        // assign pmemberID parameter to memberID variable. to capture a members id
        memberSince = pmembersince;                                                     // asign pmembersince with membersince variable.
    }
    //==================================================================================================================
    // Getter /  Setter Methods
    //==================================================================================================================
    public double getDiscount()                                                         // getter method for discount, using the other variables.
    {
        return discount;                                                                // get discount value for member?
    }

    public void setDiscount()                                                           //setter method to set discount for fitness member.
    {
        Scanner input = new Scanner(System.in);                                         //?
        String password;

        System.out.println("Please enter the admin password to continue: ");            // Asks the user to enter a valid password
        password = input.nextLine();                                                    // Get the password value from the user of app.

        if(!password.equals("14621"))                                                   // if password is not 14621, tell user it's wrong.
        {
            System.out.println("I'm sorry, but the password you have entered is incorrect.");
            System.out.println("Please try again, or contact a system administrator to continue.");
        }
        else
        {
            System.out.println("Thank you, the password entry was successful. Please enter the discount.");
            discount = input.nextInt();
        }

    }
    //==================================================================================================================
    // Additional methods
    //==================================================================================================================
    public void dispMemberInfo()                                                        // method to display member information.
    {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee for membership: " + annualfee);
    }
    // commented out to replace with an abstract class equivelant
    //------------------------------------------------------------------------------------------------------------------
//    public void calcAnnualFee()                                                        // method to calc annual fee
//    {
//        annualfee = 0;
//    }

    abstract public void calcAnnualFee();                                          // example of an abstract method.
}
//======================================================================================================================
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//======================================================================================================================
//Child class to get information from parent to reuse code etc...
//======================================================================================================================
class Normal_Member extends Member                                                      // extends indicates that one class is inherited from another class.
{
//    public Normal_Member()                                                            // Child constructor with no parameters
//    {
//        System.out.println("Child Constructor with no parameter.");
//    }
    //==================================================================================================================
    // Constructors
    //==================================================================================================================
    public Normal_Member (String pname, int pmemberID, int pmembersince)            // child constructor with 3 parameters
    {
        super(pname, pmemberID, pmembersince);                                      // super is used to call in the constructor from the parent class (member)
        System.out.println("Child Constructor with 3 parameters.");
    }
    //==================================================================================================================
    // Overriding a parent class for the annual fee- to create calc for annual fee to pay.
    //==================================================================================================================

    @Override
    public void calcAnnualFee()
    {
        annualfee = (1-0.1 * getDiscount()) * (100 + 12*30);
    }
}
//======================================================================================================================
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//======================================================================================================================
//VIP class to get information from parent to reuse code etc...... but for the rich bitches !
//======================================================================================================================
class Vip_Member extends Member
{
//    vip_member()
//    {
//        System.out.println("Constructor with no parameters");
//    }

    Vip_Member(String pname, int pmemberID, int pmembersince)            // child constructor with 3 parameters
    {
        super(pname, pmemberID, pmembersince);                           // super is used to call the constructor from the parent class (member)
    }

    @Override
    public void calcAnnualFee()
    {
        annualfee = (1-0.1 * getDiscount()) * (1200);                   /// ooohgb vip annual fee is expensive boooiiiiii
    }
}
//======================================================================================================================
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//======================================================================================================================
//Main method to run all classes and you know ..... that jazzyness :D
//======================================================================================================================
//public class InheritanceDemo
//{
    //==================================================================================================================
    // Using inheritance
    //==================================================================================================================
//    public static void main(String[] args)
//    {
//        System.out.println("hey yall!");
//
//        Normal_Member   mem1 = new Normal_Member("Michael", 2, 2021);   // new member to Instone fitness!
//        Vip_Member      mem2 = new Vip_Member("Louis", 3, 2020);      // oooopp special VIP member boyo!
//
//        // work out annual fees for both members
//        mem1.setDiscount();
//        mem1.calcAnnualFee();
//        mem1.dispMemberInfo();
//
//        mem2.calcAnnualFee();
//        mem2.dispMemberInfo();
//
//
//    }
//}

public class InheritanceDemo
{
    //==================================================================================================================
    // Using polymorphism - programs ability to use the correct method for an object, based on its run-time type.
    //==================================================================================================================

    public static void main(String[] args)
    {
        Member[] clubmembers = new Member[6];                               // Creates new member array and size

        // add members to created array
        //--------------------------------------------------------------------------------------------------------------
        clubmembers[0] = new Normal_Member("Tom",1,1990);
        clubmembers[1] = new Vip_Member("Bob",2,2022);
        clubmembers[2] = new Normal_Member("Jane",3,2021);
        clubmembers[3] = new Normal_Member("Jamie",4,2020);
        clubmembers[4] = new Vip_Member("Jo",5,2019);
        clubmembers[5] = new Normal_Member("Alex",6,2018);

        // For loop to display the member information and calculate their annual fee
        //--------------------------------------------------------------------------------------------------------------
        for(Member m : clubmembers)
        {
            m.calcAnnualFee();                                              // Show annual fee for the member
            System.out.println("============");
            m.dispMemberInfo();                                             // Show member information
            System.out.println("============");

        }
    }

}