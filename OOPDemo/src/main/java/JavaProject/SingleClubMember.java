package JavaProject;

public class SingleClubMember extends Member                                                            // inherit information from the Member class
{
    private int club;

    //==================================================================================================================
    // Constructor for class bring in in parent class information and new variable.
    //==================================================================================================================
    public SingleClubMember (char pMemberType, int pMemberID, String pName, double pFees, int pClub)    // child constructor with 5 parameters
    {
        super(pMemberType,pMemberID,pName,pFees);                                                       // super is used to call in the constructor from the parent class (member)

        pClub  = club;                                                                                  // Assign value of pClub to club variable.
        System.out.println("Child Constructor with 5 parameters.");
    }

    //==================================================================================================================
    // Get/Set methods for pClub/Club
    //==================================================================================================================
    // setter method to set value for club
    //------------------------------------------------------------------------------------------------------------------
    public void setClub(int pClub) {club = pClub;}
    // getter method to retrieve value for club
    //------------------------------------------------------------------------------------------------------------------
    public int getClub() {return club;}


    //==================================================================================================================
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================================================================================================
    // method to convert information into to string ?
    //------------------------------------------------------------------------------------------------------------------
    public String toString(char memberType,int memberID, String name, double fees, int club)
    {
        return super.toString() + "," + club;
    }

}
