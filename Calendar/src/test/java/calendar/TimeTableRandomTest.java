package calendar;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTableRandomTest {


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
        listAppts.add(appt);
        listAppts.add(appt);
        listAppts.add(appt);


        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+1);

        TimeTable t = new TimeTable();
        int num;
        Random ran = new Random();
        for(int i = 0; i < 1000; i++) {
            listAppts.add(appt);
            listAppts.add(appt);
            appt.setStartHour(16);
            listAppts.add(appt);
            listAppts.add(appt);
            num = ran.nextInt(3);

            if(ran.nextInt(2) == 1)
            {
                appt = listAppts.get(1);
                t.deleteAppt(listAppts, null);
                appt = listAppts.get(1);
                assertEquals(listAppts.get(1).getStartMinute(), appt.getStartMinute());
            }
            else {
                t.deleteAppt(listAppts, listAppts.get(num));
                appt = listAppts.get(num);
                assertEquals(listAppts.get(num).getStartHour(), appt.getStartHour());
            }
        }

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




        GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
        GregorianCalendar tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

        TimeTable t = new TimeTable();


        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
        calDays = new LinkedList<CalDay>();
        Random ran = new Random();
        int num1 = 10;
        int num2;
        int StartDay2 = startDay+1;

        for(int i = 0; i < 1000; i++) {
            listAppts = new LinkedList<Appt>();
            num2 = ran.nextInt(20);
            appt.setStartHour(num2);
            listAppts.add(appt);
            System.out.println(num2);
            appt.setStartHour(num2);
            appt = new Appt(num2,
                    startMinute ,
                    startDay ,
                    startMonth ,
                    startYear ,
                    title,
                    description);
            listAppts.add(appt);
            System.out.println(num2);
            tomorrow = new GregorianCalendar(thisYear,thisMonth,thisDay+2);
            if(num1 > num2) {
                calDays = t.getApptRange(listAppts, today, tomorrow);
                assertEquals(calDays.get(0).getAppts().get(0).getStartHour(), num2);
            }
            else
            {
                calDays = t.getApptRange(listAppts, today, tomorrow);
                assertEquals(calDays.get(0).getAppts().get(0).getStartHour(), num2);
            }
        }
    }
}
