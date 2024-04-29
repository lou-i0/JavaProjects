package helloworld;

import java.util.Locale;

public class HelloWorld {
                          //============================================================================================
                          // Training Area
                          // ===========================================================================================
                            public static void main(String[] args) {
                                // Write out a line that says hello world
                                System.out.println("Hello World!");
                                System.out.println("all up in this bitch!");
                                // declaring a variables - initialise and declare
                                byte    userAge             = 30            ;
                                short   number_students     = 45            ;
                                int     number_employees    = 10            ;
                                long    number_inhabitants  = 2102131301267L;

                                float   hourly_rate         = 9.50f         ;
                                int     weekly_hours        = 40            ;
                                char    grade               = 'A'           ;
                                boolean promote             = true          ;
                                byte    level = 2, user_exp = 5             ;

                                // declaring variables - declare, but initialise later
                                int year = 20; // wont let me use it without delcaration

                                int pussio = 1524521 ;


                                // test of assignment with variables
                                int x = 20;
                                int y = 25;
                                x = y;
                                System.out.println(y);
                                x++;
                                System.out.println(x);

                                //type casting from smaller to larger data type
                                short age = 20;
                                double myage = age;
                                System.out.println(myage);

                                // Arrays and strings
                                String message = "hello all!";
                                System.out.println(message);
                                String another_msg = "Another message to change things up";
                                System.out.println(another_msg);

                                System.out.println(message + ' ' + another_msg);

                                // get length of characters in string
                                System.out.println(message.length());

                                int msg_length = "hello world".length();
                                System.out.println(msg_length);

                                // uppercase/lowercase
                                System.out.println(message.toUpperCase());
                                System.out.println(message.toLowerCase());

                                //substring
                                System.out.println(another_msg.substring(6)); // from 6 onwards
                                System.out.println(another_msg.substring(0,7)); // "another"

                                //charAt -  returns the character at stated position
                                System.out.println(another_msg.charAt(0)); // "another"

                                //equals -  iof two values or arguments are the same
                                System.out.println(another_msg.equals(message)); // is false

                                //split - split a string into substring based on user defined sep
                                String names = "john, peter, rob, dave, michael,louis";
                                String [] split_names = names.split(",");
                                System.out.println(split_names[0]); //returns first split thing in order

                                System.out.print("my balls are bigger then yours for surwe!");
                            }



                        }
