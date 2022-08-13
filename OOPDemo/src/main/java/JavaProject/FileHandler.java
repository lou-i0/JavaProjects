package JavaProject;

import java.io.*;                                                                                                       // import all tools to read and write files
import java.util.LinkedList;                                                                                            // use the linked list and operations for it.

public class FileHandler
{
    //==================================================================================================================
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================================================================================================
    // method read member information from csv file
    //------------------------------------------------------------------------------------------------------------------
    public LinkedList<Member> readFile()
    {
        LinkedList<Member> m = new LinkedList();
        String lineRead;
        String splitLine[];
        Member mem;

        try
                (BufferedReader reader = new BufferedReader(new FileReader("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\members.csv")))
        {
            lineRead = reader.readLine();
            while (lineRead != null)
            {
                splitLine = lineRead.split(", ");                                                                 // splits line by comma to add into list

                if (splitLine[0].equals("S"))                                                                           // if single club member
                {
                    //Instantiate single club member
                    mem = new SingleClubMember(
                                                'S'                                                                     // member type
                                                ,Integer.parseInt(splitLine[1])                                         //member id
                                                ,splitLine[2]                                                           // member name
                                                ,Double.parseDouble(splitLine[3])                                       // fees
                                                ,Integer.parseInt(splitLine[4])                                         // club id
                                              );
                }
                else                                                                                                    // if multi club member
                {
                    // Instantiate multi club member.
                    mem = new MultiClubMember(
                                                'S'                                                                     // member type
                                                ,Integer.parseInt(splitLine[1])                                         //member id
                                                ,splitLine[2]                                                           // member name
                                                ,Double.parseDouble(splitLine[3])                                       // fees
                                                ,Integer.parseInt(splitLine[5])                                         // mem points
                                             );

                }
                m.add(mem);                                                                                        // adds line of member info to linkedList?
                lineRead = reader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return m;
    }

    //==================================================================================================================
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================================================================================================
    // method to add new members to csv file
    //------------------------------------------------------------------------------------------------------------------
    public void appendFile(String mem)
    {
        try
                (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\members.csv", true)))
        {
                writer.write(mem + "\n");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //==================================================================================================================
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //==================================================================================================================
    // method to overwrite member information on csv file. - remove member from club
    //------------------------------------------------------------------------------------------------------------------
    public void overwriteFile(LinkedList<Member> m)
    {
     String s;

     try(BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\members.temp", false)))
     {
         for(int i = 0; i < m.size(); i++)
         {
             s = m.get(i).toString();
             writer.write(s + "\n");

         }
     }
     catch(IOException e)
     {
         System.out.println(e.getMessage());
     }
     try
     {
         File f = new File("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\members.csv");
         File tf = new File("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\members.temp");

         f.delete();
         tf.renameTo(f);
     }
     catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
    }
}
