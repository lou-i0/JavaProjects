package JavaProject;

import java.io.*;
import java.util.LinkedList;

public class JavaProject
{
    public static void main(String[] args)
    {
        String mem;


        MemberManagement mm = new MemberManagement();
        FileHandler fh = new FileHandler();

        LinkedList<Member> members = fh.readFile();

        int choice  = mm.getChoice();
        while (choice != -1)
        {
            switch(choice)
            {
                case 1:
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                case 2:
                    mm.removeMember(members);
                    fh.overwriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                    break;
                default:
                    System.out.println("This was a invalid answer");
                    break;
            }
            choice = mm.getChoice();

        }
        System.out.println("Thanks, Goodbye.");
    }

}

