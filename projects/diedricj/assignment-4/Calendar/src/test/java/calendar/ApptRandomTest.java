package calendar;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApptRandomTest {

    @Test
    public void testValidDay()
    {
        int day;
        int hour;
        int year;
        int month;
        Random ran = new Random();
        for(int i = 0; i < 1000; i++) {
            day = ran.nextInt(100 + 1 + 100) - 100;
            if(day == 31)
                day++;
            hour = ran.nextInt(24 + 1);
            year = ran.nextInt(2016 + 1);
            month = ran.nextInt(10)+2;
            Appt appointment = new Appt(hour,4, day, 3, year,"meeting", "meet arlph");
            int NumDaysInMonth= CalendarUtil.NumDaysInMonth(year,month);
            System.out.println("Month days");
            System.out.println(NumDaysInMonth);
            System.out.println("days");
            System.out.println(appointment.getStartDay());
            System.out.println(appointment.getValid());
            if(day<1 || day>NumDaysInMonth)
                assertEquals(false, appointment.getValid());
        }
    }

    @Test
    public void testValidmin()
    {
        int day;
        int hour;
        int year;
        int month;
        int minute;
        Random ran = new Random();
        for(int i = 0; i < 1000; i++) {
            minute = ran.nextInt(100 +1+100) - 100;
            day = ran.nextInt(27 + 1);
            hour = ran.nextInt(24 + 1);
            year = ran.nextInt(2016 + 1);
            month = ran.nextInt(10)+2;
            Appt appointment = new Appt(hour,minute, day, 3, year,"meeting", "meet arlph");
            int NumDaysInMonth= CalendarUtil.NumDaysInMonth(year,month);
            System.out.println("minute");
            System.out.println(appointment.getStartMinute());
            System.out.println(appointment.getValid());
            if(minute<0)
                assertEquals(false, appointment.getValid());
        }
    }

    @Test
    public void testRecurDays()
    {
        int [] days = {0,0};
        Random ran = new Random();
        Appt appointment = new Appt(2, 2, 2, 3, 2016,"meeting", "meet arlph");

        for(int i = 0; i < 1000; i++) {
            days[0] = ran.nextInt(100+1-100)-100;
            days[1] = ran.nextInt(100+1-100)-100;
            int rec = ran.nextInt(2);
            if(rec == 1) {
                appointment.setRecurrence(days, 2, 2, 2);
            }
            else
            {
                appointment.setRecurrence(null, 2, 2, 2);
            }
            if (rec == 1) {
                assertEquals(appointment.getRecurDays()[0], days[0]);
            }
            else{
                assertEquals(appointment.getRecurDays().length, 0);
            }
        }
    }

}
