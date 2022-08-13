package FileHandling;


import java.io.*; // import all methods from the java .io class for file handling





//BufferedReader reader = null;            // variable reader as empty

// older code thas works still, but is archaic, better methods are out there.
//        try
//            {
//                reader = new BufferedReader(new FileReader("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\sample3.txt")); // read in file from location
//                line = reader.readLine(); // read a line but only when line is not null (its valid)
//
//                while (line != null) // while line has valid lines to enter
//                {
//                    System.out.println(line); /// print out current line
//                    line = reader.readLine(); // read next line
//                }
//            }
//        catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        finally
//        {
//            try
//            {
//                if (reader != null) // if reader is valid
//                {
//                    reader.close(); // close reader / file
//                }
//            }
//            catch (IOException e)
//            {
//                System.out.println(e.getMessage());
//            }
//        }


//FileReader -  to read from a textfile -  reads steream of characters one at a time.
//BufferedReader -  to wrap around Filereader as better - reads larger blocks to speed up the process.

public class filehandlingDemo
{
// READ A FILE
//======================================================================================================
//    public static void main(String[] args)
//    {
//        String line;
//
//        // read from a text file
//        // newer way to do it , that is less close and deals with resources for you.
//        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\sample3.txt")))
//        {
//            line = reader.readLine();
//            while(line != null)
//            {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }
//        catch(IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
    //}
// WRITE TO A FILE.
//======================================================================================================
    public static void main(String[] args)
    {
        String text = "Hellow World!"; // text to wrtie into file.

        try(
                BufferedWriter writer = new BufferedWriter(
                                                            new FileWriter("D:\\Coding\\JavaProjects\\OOPDemo\\src\\main\\java\\FileHandling\\lotest1.txt")
                                                          )
            )
        {
            writer.write(text);
            writer.newLine();
        }
        catch(IOException e)
        {System.out.println(e.getMessage());}
    }
}
