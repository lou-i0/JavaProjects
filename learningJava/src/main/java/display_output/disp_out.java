package display_output;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.util.Scanner;                                                                                               // used to take in User input

public class disp_out   {
                           public static void main(String[] args) throws ScriptException
                           {
                               // instantiate imports
                               ScriptEngineManager  mgr     = new ScriptEngineManager();
                               ScriptEngine engine   = mgr.getEngineByName("Javascript");                      // brings in javascript functionality

                               Scanner reader = new Scanner(System.in);                                                 // Setting up a new reader to read in user input



                               //Declare variables here
                               int         age  = 30;
                               String      calc = "30+5";

                               // Simple display of messages
                               System.out.println("new java file to show output from user input");System.out.println("");//Display a simple message
                               System.out.print("Hi there , My name is louis");
                               System.out.println(", and I am " + age + " years old.");

                               // displaying the result of a calc
                               System.out.print(" The result of 30+5 equals: ");
                               System.out.println(30+5);

                               // Same , but different
                               System.out.println(" The result of 30+5 equals: " + (30+5));

                               // use of escape seqeuences
                               System.out.println("Hello\t World!");                                                    // \t is used to tab words
                               System.out.println("Hello\nWorld");                                                      // \n used to create new line within print
                               System.out.println("Hello\\World!");                                                     // \\ used to actually add \ in text
                               System.out.println("I am \"30\" years old");                                             // \" to add " in text


                               // using printf() to show information for numbers per se, without all the digits.
                               System.out.printf("the answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);        // using string and numerical variables based on the datatype between int and float

                               //=======================================================================================
                               // ACCEPTING USER INPUT
                               //=======================================================================================
                               /////////////////////////////////////////////////////////////////////////////////////////
                               //=======================================================================================
                               // need to ensure to import java.util.Scanner;

                           }
                        }
