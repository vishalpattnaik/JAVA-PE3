package com.stackroute.p3;

public class StudentMarks {

    public String studentDetails(int numOfStudents, int[] stuGrades) {

        String res = "";
        for (int i=0; i<numOfStudents; i++) {

            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return "Please enter valid input";
            }

            res = "Input is valid";

        }

        return res;
    }

}
