package JavaProject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MemberManagement
{
    final private Scanner reader = new Scanner(System.in);


    private int getInput()
    {
        int choice = 0;
        while(choice == 0)
        {
            try
            {
                //System.out.println("Please enter a value: ");
                choice =  reader.nextInt();
                if (choice == 0)
                    throw new InputMismatchException();

                reader.nextLine();
            }
            catch(InputMismatchException e)
            {
                reader.nextLine();
                System.out.println("Please enter a Integer value that is not 0");
            }

        }
        return choice;
    }

    private void printClubOptions()
    {
        System.out.println("Please see the following club options available: ");
        System.out.println("1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Club Mars");
    }

    public int getChoice()
    {

        System.out.println("WELCOME TO INSTONE FITNESS");
        System.out.println("===========================");
        System.out.println("1) Add Member");
        System.out.println("2) Remove Member");
        System.out.println("3) Display Information");
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter an option, or enter -1 to quit");

        int choice = getInput();

        return choice;
    }

    public String addMembers(LinkedList<Member> m)
    {
        String name;
        int club = 0;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

        System.out.print("Please enter the members name: ");
        name  =  reader.nextLine();

        printClubOptions();

        while (club < 1 || club > 4)
        {
            System.out.println("The elected choice is invalid, please try again.");
            System.out.println("PLease enter a new value:");
            club  =  reader.nextInt();
            break;
        }

        if(m.size() > 0)
        {
            memberID = m.getLast().getMemberID()+ 1;
        }
        else
        {
            memberID = 1;
        }

        if (club != 4)
        {
            cal = (n) -> {
                            switch (n)
                            {
                                case 1:
                                    return 900;

                                case 2:
                                    return 950;

                                case 3:
                                    return 1000;

                                default:
                                    return -1;

                            }
                         };
            fees = cal.calculateFees(club);

            mbr = new SingleClubMember('S',memberID,name,fees,club);

            m.add(mbr);

            mem = mbr.toString();

            System.out.println("");
            System.out.println("STATUS: Single Club Member has been added.");

        }
        else
        {
            cal = (n) -> {
                            switch (n)
                            {
                                case 4:
                                    return 1200;

                                default:
                                    return -1;

                            }
                         };
            fees = cal.calculateFees(club);
            mbr = new MultiClubMember('M',memberID,name,fees,100);
            m.add(mbr);

            mem = mbr.toString();
            System.out.println("");
            System.out.println("STATUS: Multi Club Member has been added.");

        }
        return mem;
    }

    public  void removeMember(LinkedList<Member> m)
    {
        int memberID;


        System.out.println("Please enter the memberID to be removed:");
        memberID =  getInput();

        for(int i = 0; i<m.size();i++)
        {
            if(m.get(i).getMemberID() == memberID)
            {
                m.remove(i);
                System.out.println("the member has now been removed : " + memberID);
                return;
            }
            else
            {System.out.println("Member not found");}
        }

    }

    public void printMemberInfo(LinkedList<Member> m)
    {
        int memberID;

        System.out.println("Please enter the memberID to check:");

        memberID =  getInput();

        for(int i = 0; i<m.size();i++)
        {
            if (m.get(i).getMemberID() == memberID) {
                String[] memberInfo = m.get(i).toString().split(", ");
                if (memberInfo[0].equals("S"))
                    System.out.print(memberInfo[0] + "," +  memberInfo[1] + "," +  memberInfo[2] + ","  + memberInfo[3] + "," +  memberInfo[4]);
                else
                {
                    System.out.println(memberInfo[0] + "," + memberInfo[1] + "," + memberInfo[2] + "," + memberInfo[3] + "," + memberInfo[5]);
                }
                return;
            } else {
                System.out.println("Member not found");
            }
        }

    }
}
