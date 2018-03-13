package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
import java.util.*;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;
public class CalDayTest {




    @Test
    public void getsize() {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
        Appt appointment1 = new Appt(2,4,5,9,2016,"meeting", "meet arlph");

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

        c.addAppt(appointment);
        c.addAppt(appointment1);
        int i = c.getSizeAppts();
        assertEquals(i, 2);
    }




    @Test
    public void addAppt1() {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
        Appt appointment2 = new Appt(4,4,5,11,2016,"meeting", "meet arlph");
        Appt appointment3 = new Appt(3,4,5,9,2016,"meeting", "meet arlph");


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

        c.addAppt(appointment);
        c.addAppt(appointment2);
        c.addAppt(appointment3);
        LinkedList<Appt> listAppts = c.getAppts();
        assertEquals(listAppts.get(1).getStartMonth(), 9);
        assertEquals(listAppts.get(0).getStartMonth(), 10);
        assertEquals(listAppts.get(2).getStartMonth(), 11);

    }

    @Test
    public void addAppt() {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");

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

        c.addAppt(appointment);
        LinkedList<Appt> listAppts = c.getAppts();
        assertEquals(listAppts.get(0).getStartMonth(), 10);
    }

    @Test
    public void getDay()
    {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");

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

        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,2);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
        CalDay c = new CalDay(today);

        assertEquals(2, c.getDay());
    }

    @Test
    public void getYear()
    {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");

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

        GregorianCalendar today = new GregorianCalendar(2005,thisMonth,2);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
        CalDay c = new CalDay(today);

        assertEquals(2005, c.getYear());
    }

    @Test
    public void getMonth()
    {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");

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

        GregorianCalendar today = new GregorianCalendar(2005,10,2);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
        CalDay c = new CalDay(today);

        assertEquals(10, c.getMonth());
    }

    @Test
    public void ToString()
    {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");

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

        GregorianCalendar today = new GregorianCalendar(2005,10,2);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
        CalDay c = new CalDay(today);

        System.out.println("/" + c.toString() + "/");
        assertEquals(c.toString(), c.toString());
    }

    @Test
    public void addApptOrder()
    {

        Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
        Appt appointment2 = new Appt(4,4,5,10,2016,"meeting", "meet arlph");

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

        GregorianCalendar today = new GregorianCalendar(2005,10,2);
        GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
        tomorrow.add(Calendar.DAY_OF_MONTH,1);
        String todayDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
        String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);
        CalDay c = new CalDay(today);

        System.out.println("/" + c.toString() + "/");
        c.addAppt(appointment);
        c.addAppt(appointment2);

        assertEquals(c.getAppts().get(0).getStartHour(), 3);
        assertEquals(c.getAppts().get(1).getStartHour(), 4);
    }
}
