package OOP;

import java.util.Arrays;

class myclass
{
    public void printFirstElement(int[] a)
    {
        System.out.println("The First element is : " + a[0]);
    }

    public int[] returnArray()
    {
        int[] a = new int[3];

        //for loop that go through an array and multiplies by 2 per iteration#
        for( int i =1; i < a.length; i++)
        {
            a[i] = i*2;
        }
        return a;
    }

    public void passprim(int primpara)
    {
        primpara = 10;
        System.out.println("Value inside method = " + primpara);
    }

    public void passref(int[] refpara)
    {
        refpara[1] = 5;
        System.out.println("Value inside method = " + refpara[1]);
    }
}

public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        // create a new instantiation of the arraymethod demo2 class above
        myclass amd  = new myclass();

        int[] marray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        amd.printFirstElement(marray);

        int[] marray2 = amd.returnArray();

        System.out.println(Arrays.toString(marray2));

        int mynum = 2;
        System.out.println(" Value before  = " + mynum);
        amd.passprim(mynum);
        System.out.println("Value after  = " + mynum);

        System.out.println("array before = " + marray[1]);
        amd.passref(marray);
        System.out.println("array after = " + marray[1]);
    }
}



