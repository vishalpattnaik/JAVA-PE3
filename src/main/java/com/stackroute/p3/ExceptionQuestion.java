/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.*/

package com.stackroute.p3;

public class ExceptionQuestion {

    public static void main(String args[])
    {
        try {                               // try block

            System.out.println("TRY");
            throw new Exception();

        }
        catch(Exception e) {                //catch block

            System.out.println("CATCH");

        }
        finally {                           //finally block

            System.out.println("FINALLY");
        }
    }


}
