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
    public void getRange5()throws DateOutOfRangeException {
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
        Appt app1 = new Appt(4,5,3,4,2017, "meeting", "meet arlphr");
        Appt app2 = new Appt(6,5,4,4,2017, "meeting", "meet arlphr");
        Appt app3 = new Appt(3,5,16,5,2017, "meeting", "meet arlphr");
        Appt app4 = new Appt(10,5,100,5,2017, "meeting", "meet arlphr");

        int [] days = {1, 2, 3};
        app1.setRecurrence(days, 2, 1, 2);
        app2.setRecurrence(null, 1, 1, 1000);

        listAppts.add(app1);
        listAppts.add(app2);
        listAppts.add(app3);
        listAppts.add(app4);

        GregorianCalendar first = new GregorianCalendar(2017,4,1);
        GregorianCalendar second = new GregorianCalendar(2017,7,20);

        TimeTable t = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, first, second);

        assertEquals(calDays.get(17).getAppts().getFirst().getStartHour(), 6);

        LinkedList<Appt> listDeletedAppts = t.deleteAppt(listAppts, listAppts.get(2));
        assertEquals(listDeletedAppts.getFirst().getStartHour(), 4);
    }

    @Test
    public void getRange4()throws DateOutOfRangeException {
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
        Appt app1 = new Appt(4,5,3,4,2017, "meeting", "meet arlphr");
        Appt app2 = new Appt(6,5,4,4,2017, "meeting", "meet arlphr");
        Appt app3 = new Appt(3,5,16,5,2017, "meeting", "meet arlphr");
        Appt app4 = new Appt(10,5,100,5,2017, "meeting", "meet arlphr");

        int [] days = {1, 2, 3};
        app1.setRecurrence(days, 2, 1, 2);
        app2.setRecurrence(null, 1, 1, 1000);

        listAppts.add(app1);
        listAppts.add(app2);
        listAppts.add(app3);
        listAppts.add(app4);

        GregorianCalendar first = new GregorianCalendar(2017,4,1);
        GregorianCalendar second = new GregorianCalendar(2017,7,20);

        TimeTable t = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, first, second);

        assertEquals(calDays.get(17).getAppts().getFirst().getStartHour(), 6);
    }

    @Test
    public void getRange3()throws DateOutOfRangeException {
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
        Appt app1 = new Appt(4,5,3,4,2017, "meeting", "meet arlphr");
        Appt app2 = new Appt(6,5,4,4,2017, "meeting", "meet arlphr");
        Appt app3 = new Appt(3,5,16,5,2017, "meeting", "meet arlphr");
        Appt app4 = new Appt(10,5,100,5,2017, "meeting", "meet arlphr");

        int [] days = {1, 2, 3};
        app1.setRecurrence(days, 2, 1, 2);
        app2.setRecurrence(days, 1, 0, 5);

        listAppts.add(app1);
        listAppts.add(app2);
        listAppts.add(app3);
        listAppts.add(app4);

        GregorianCalendar first = new GregorianCalendar(2017,4,1);
        GregorianCalendar second = new GregorianCalendar(2017,7,20);

        TimeTable t = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, first, second);

        assertEquals(calDays.get(63).getAppts().getFirst().getStartHour(), 4);
    }

    @Test
    public void getRange2()throws DateOutOfRangeException {
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
        Appt app1 = new Appt(4,5,3,4,2017, "meeting", "meet arlphr");
        Appt app2 = new Appt(6,5,4,4,2017, "meeting", "meet arlphr");
        Appt app3 = new Appt(3,5,16,5,2017, "meeting", "meet arlphr");
        Appt app4 = new Appt(10,5,100,5,2017, "meeting", "meet arlphr");

        int [] days = {1, 2, 3};
        app1.setRecurrence(days, 2, 1, 2);
        app2.setRecurrence(days, 1, 0, 5);

        listAppts.add(app1);
        listAppts.add(app2);
        listAppts.add(app3);
        listAppts.add(app4);

        GregorianCalendar first = new GregorianCalendar(2017,4,1);
        GregorianCalendar second = new GregorianCalendar(2017,7,20);

        TimeTable t = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, first, second);

        assertEquals(calDays.get(14).getAppts().getFirst().getStartHour(), 6);
    }

    @Test
    public void getRange1()throws DateOutOfRangeException {
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
        Appt app1 = new Appt(2,5,15,3,2017, "meeting", "meet arlphr");
        Appt app2 = new Appt(15,5,2,2,2017, "meeting", "meet arlphr");
        Appt app3 = new Appt(2,5,16,3,2017, "meeting", "meet arlphr");
        Appt app4 = new Appt(2,5,100,3,2017, "meeting", "meet arlphr");


        listAppts.add(app1);
        listAppts.add(app2);
        listAppts.add(app3);
        listAppts.add(app4);

        GregorianCalendar first = new GregorianCalendar(2017,2,1);
        GregorianCalendar second = new GregorianCalendar(2017,4,1);

        TimeTable t = new TimeTable();

        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = t.getApptRange(listAppts, first, second);

        assertEquals(calDays.get(1).getAppts().getFirst().getStartHour(), 15);
    }

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

        assertEquals(calDays.get(0).getDay(), 12);
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
