package OOP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {
        // List stuff
        //=============================================
        LinkedList<Integer> userAgeList =  new /*ArrayList<>()*/ LinkedList<>();        // new obj based on array/ linked list

        userAgeList.add(40);                                   // add new element of 40 to list
        userAgeList.add(53);                                   // add new element of 40 to list
        userAgeList.add(45);                                   // add new element of 40 to list
        userAgeList.add(53);                                   // add new element of 40 to list
        userAgeList.add(2,51);                    // Change element of 53 to 51 in index 2



        System.out.println(userAgeList.size());                // Prints out the number of elements in list

        userAgeList.remove(3);                           // remove number 45 from list based on index pos

        System.out.println(userAgeList.contains(12));          // whether list contains number 12?
        System.out.println(userAgeList.indexOf(12));           // find index number of value 12? - -1 means not in there?
        System.out.println(userAgeList.get(2));                // get value based on index position in list (51)

        // Array Stuff
        //============================================
        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]); // create array from list (all same data type?
        System.out.println(userAgeArray[0]);
        System.out.println(userAgeList);

        // peek to see first element without removing it from linked list
        System.out.println(userAgeList.peek());
        //getFirst is the same as the default for peek
        System.out.println(userAgeList.getFirst());
        // getLast is peek, but for last element
        System.out.println(userAgeList.getLast());

        // poll to see the first element, and remove it from the list.
        System.out.println(userAgeList.poll());
        System.out.println(userAgeList);
    }

    public void methodOne(ArrayList<Integer> m) // to have as parameter in method
    {
        // some code here.....
    }

    public ArrayList<Integer> methodTwo() // to return a arraylist for a method
    {
        ArrayList<Integer> a = new ArrayList<>();
        //some code here
        return a;
    }
}
