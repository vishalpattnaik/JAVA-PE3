/*calculate first and last date of a week.*/

package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDate {

    public String calculateDate(Calendar c) {

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);   //date set to monday

        String res = "";

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        res = "First Date of Week: " + df.format(c.getTime());      //calculate first day of the week

        for(int i=0; i<6; i++) {

            c.add(Calendar.DATE, 1);

        }

        res = res + "\n" + "Last date of the week: " + df.format(c.getTime());      //calculate last day of the week

        return res;

    }


}
