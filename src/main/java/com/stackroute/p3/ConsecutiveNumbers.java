package com.stackroute.p3;

public class ConsecutiveNumbers {

    public String checkConsecutiveNumbers(String inputNum) {

        String[] input = inputNum.split(",");

        for(int i=0; i<input.length-1; i++) {

            if(Math.abs(Integer.parseInt(input[i])-Integer.parseInt(input[i+1])) > 1) {

                    return inputNum + " are non consecutive numbers";

            }
        }

        return inputNum + " are consecutive numbers";

    }

}
