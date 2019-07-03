/*Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.*/

package com.stackroute.p3;

public class CatchDifferentExceptions {

    public static void main(String args[]) {
        int result = 0;
        int arraySize = 5;
        int negative = -1;
        int[] array = null;

        for (int choice = 0; choice < 3; ++choice)
            try {
                switch (choice) {
                    case 0:
                        result = array[0];
                        break;
                    case 1:
                        array = new int[negative];
                        break;
                    case 2:
                        array = new int[arraySize];
                        result = array[arraySize];
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("\nNullPointerException Exception caught.");

            } catch (NegativeArraySizeException e) {
                System.out.println("\nNegativeArraySizeException Exception caught.");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught.");

            }
    }
}
