/* simple example of an if statement used in java */

public class simpleif
{
    public static void main(String[] args) 
    {
        int a,b,c;

        a = 4;
        b = 3;

        if (a < b) 
        {
            System.out.println(" a is less then b, so c is the addition of both ..."); 
            c = a + b;
            System.out.println("c: " + c);   
        }
        if(a == b) 
        {
            System.out.println("they are both the same, so whats the point!");
            
        }
        if (a > b)
        {
            System.out.println("Well,  c is now the substitution of a and b...");
            c = a - b;
            System.out.println("c: " + c);
        }

    }
}
