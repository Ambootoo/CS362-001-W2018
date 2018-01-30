package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Test;

import java.sql.Time;
import java.util.*;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;
public class TimeTableTest {
    boolean diagnose = true;

    @Test
    public void getRange()throws DateOutOfRangeException {
        int thisMonth;
        /** the year the user is currently viewing **/
        int thisYear;
        /** todays date **/
        int thisDay;

        Calendar rightnow = Calendar.getInstance();

        //current month/year/date is today
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
        String title="Birthday Party";
        String description="This is my birthday party.";

        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);

        startHour=14;
        startMinute=30;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        title="Class";
        description="Rescheduled class.";
        //Construct a new Appointment object with the initial data
        appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);


        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+1);

        TimeTable t = new TimeTable();


        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, today, tomorrow);

        assertEquals(calDays.get(0).getDay(), 1);
    }

    @Test
    public void delete()throws DateOutOfRangeException {
        int thisMonth;
        /** the year the user is currently viewing **/
        int thisYear;
        /** todays date **/
        int thisDay;

        Calendar rightnow = Calendar.getInstance();

        //current month/year/date is today
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
        String title="Birthday Party";
        String description="This is my birthday party.";

        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);

        startHour=14;
        startMinute=30;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        title="Class";
        description="Rescheduled class.";
        //Construct a new Appointment object with the initial data
        appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);


        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+1);

        TimeTable t = new TimeTable();

        t.deleteAppt(listAppts, listAppts.get(0));
        assertEquals(listAppts.get(1).getStartHour(), appt.getStartHour());

    }

    @Test
    public void deletenull()throws DateOutOfRangeException {
        int thisMonth;
        /** the year the user is currently viewing **/
        int thisYear;
        /** todays date **/
        int thisDay;

        Calendar rightnow = Calendar.getInstance();

        //current month/year/date is today
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

        LinkedList<Appt> listAppts = new LinkedList<Appt>();

        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
        String title="Birthday Party";
        String description="This is my birthday party.";

        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);

        startHour=14;
        startMinute=30;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        title="Class";
        description="Rescheduled class.";
        //Construct a new Appointment object with the initial data
        appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);


        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+1);

        TimeTable t = new TimeTable();

        t.deleteAppt(listAppts, null);
        assertEquals(listAppts.get(1).getStartHour(), appt.getStartHour());

    }

    @Test
    public void permute()throws DateOutOfRangeException {
        int thisMonth;
        /** the year the user is currently viewing **/
        int thisYear;
        /** todays date **/
        int thisDay;

        Calendar rightnow = Calendar.getInstance();

        //current month/year/date is today
        thisMonth = rightnow.get(Calendar.MONTH)+1;
        thisYear = rightnow.get(Calendar.YEAR);
        thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

        LinkedList<Appt> listAppts = new LinkedList<Appt>();
        LinkedList<Appt> appts2 = new LinkedList<Appt>();

        int startHour=15;
        int startMinute=30;
        int startDay=thisDay+1;
        int startMonth=thisMonth;
        int startYear=thisYear;
        String title="Birthday Party";
        String description="This is my birthday party.";

        Appt appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);

        startHour=14;
        startMinute=30;
        startDay=thisDay;
        startMonth=thisMonth;
        startYear=thisYear;
        title="Class";
        description="Rescheduled class.";
        //Construct a new Appointment object with the initial data
        appt = new Appt(startHour,
                startMinute ,
                startDay ,
                startMonth ,
                startYear ,
                title,
                description);

        listAppts.add(appt);


        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+1);

        TimeTable t = new TimeTable();

        int[] i = {0,1};

        appts2 = t.permute(listAppts, i);
        assertEquals(appt.getStartHour(), appts2.get(1).getStartHour());

    }

}
