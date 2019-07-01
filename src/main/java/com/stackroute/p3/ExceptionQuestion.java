package com.stackroute.p3;

public class ExceptionQuestion {

    public static void main(String args[])
    {
        try {

            System.out.println("TRY");
            throw new Exception();

        }
        catch(Exception e) {

            System.out.println("CATCH");

        }
        finally {

            System.out.println("FINALLY");
        }
    }


}
