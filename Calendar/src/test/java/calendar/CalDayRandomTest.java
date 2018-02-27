package calendar;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalDayRandomTest {

    @Test
    public void addApptTest(){
        Random ran = new Random();

        Calendar rightnow = Calendar.getInstance();

        int thisMonth;
        /** the year the user is currently viewing **/
        int thisYear;
        /** todays date **/
        int thisDay;

        //current month/year/date is today
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

            GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
            GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
            tomorrow.add(Calendar.DAY_OF_MONTH,1);
            String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
            String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
            CalDay c = new CalDay(today);

            int hour;
            Appt appointment;
            Appt appointment1;

            for(int i = 0; i < 1000; i++) {
                hour = ran.nextInt(24);
                appointment = new Appt(hour, 4, 2, 10, 2016, "meeting", "meet arlph");
                hour = ran.nextInt(24);
                appointment1 = new Appt(hour, 5, 2, 10, 2016, "meeting", "meet arlph");

                c.addAppt(appointment);
                c.addAppt(appointment1);
                LinkedList<Appt> listAppts = c.getAppts();
                System.out.println("Appoinmtnet");
                System.out.println(appointment.getStartHour());
                System.out.println("Appoinmtnet1");
                System.out.println(appointment1.getStartHour());
                if (appointment1.getStartHour() < appointment.getStartHour())
                    assertEquals(listAppts.get(0).getStartMinute(), listAppts.get(0).getStartMinute());
            }
        }
    }

