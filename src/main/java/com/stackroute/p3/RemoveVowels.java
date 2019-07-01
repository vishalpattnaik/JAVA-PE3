package com.stackroute.p3;

public class RemoveVowels {


    public String removeVowels(String[] input) {

        String res = "";

        for(int i=0; i< input.length; i++) {

            for(int j=0; j<input[i].length(); j++) {

                if(!(input[i].charAt(j)=='a'|| input[i].charAt(j)=='e' || input[i].charAt(j)=='i'|| input[i].charAt(j)=='o'|| input[i].charAt(j)=='u')) {

                    res = res + input[i].charAt(j);

                }

            }

            res = res + " ";

        }

        return res.trim();

    }

}
