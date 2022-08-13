package JavaProject;

public class MultiClubMember extends Member
{
    private int membershipPoints;                                                                                        // variable to calc mem points for members wth diff mem type to singles
    //==================================================================================================================
    // Constructor for class bring in parent class information and new variable.
    //==================================================================================================================
    public MultiClubMember (char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints)         // child constructor with 5 parameters
    {
        super(pMemberType,pMemberID,pName,pFees);                                                                       // super is used to call in the constructor from the parent class (member)
        pMembershipPoints  = membershipPoints;                                                                          // Assign value of pMembershippoints to memberhippoints variable.
        System.out.println("Child Constructor with 5 parameters.");
    }

    //==================================================================================================================
    // Get/Set methods for membershipPoints/pMembershipPoints
    //==================================================================================================================
    // setter method to set value for membershippoints
    //------------------------------------------------------------------------------------------------------------------
    public void setMembershipPoints(int pMembershipPoints) {membershipPoints = pMembershipPoints;}
    // getter method to retrieve value for membershippoints
    //------------------------------------------------------------------------------------------------------------------
    public int getMembershipPoints() {return membershipPoints;}


    //==================================================================================================================
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================================================================================================
    // method to convert information into to string ?
    //------------------------------------------------------------------------------------------------------------------
    public String toString(char memberType,int memberID, String name, double fees, int membershipPoints)
    {
        return super.toString() + "," + membershipPoints;
    }
}
