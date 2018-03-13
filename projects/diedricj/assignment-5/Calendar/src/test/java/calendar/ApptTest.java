package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */


	@Test
	public void compareto()
	{
		Appt appointment = new Appt(2,5,30,3,2017, "meeting", "meet arlphr");
		Appt appointment2 = new Appt(1,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.compareTo(appointment2), 5);
	}

    @Test
	public void printablestr1()
	{
		Appt appointment = new Appt(1,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.toString(), "\t"+ "2/29/2016" + " at " + "1" + ":" + "4" + "am" + " ," +  "meeting" + ", "+  "meet arlphr" +"\n");
	}

	@Test
	public void printablestr2()
	{
		Appt appointment = new Appt(0,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.toString(), "\t"+ "2/29/2016" + " at " + "12" + ":" + "4" + "am" + " ," +  "meeting" + ", "+  "meet arlphr" +"\n");
	}

	@Test
	public void printablestr3()
	{
		Appt appointment = new Appt(11,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.toString(), "\t"+ "2/29/2016" + " at " + "11" + ":" + "4" + "am" + " ," +  "meeting" + ", "+  "meet arlphr" +"\n");
	}

	@Test
	public void printablestr4()
	{
		Appt appointment = new Appt(12,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.toString(), "\t"+ "2/29/2016" + " at " + "12" + ":" + "4" + "pm" + " ," +  "meeting" + ", "+  "meet arlphr" +"\n");
	}

    @Test
	public void boundary1()
	{
		Appt appointment = new Appt(0,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary2()
	{
		Appt appointment = new Appt(23,4,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary3()
	{
		Appt appointment = new Appt(23,0,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary4()
	{
		Appt appointment = new Appt(23,59,29,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary5()
	{
		Appt appointment = new Appt(23,0,1,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary6()
	{
		Appt appointment = new Appt(1,4,29,11,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void boundary7()
	{
		Appt appointment = new Appt(23,0,1,2,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void startwrongmonth()
	{
		Appt appointment = new Appt(2,4,15,12,2016, "meeting", "meet arlphr");

		appointment.setStartMonth(4);
		assertEquals(appointment.getValid(), true);
	}

	@Test
	public void startwrongyear()
	{
		Appt appointment = new Appt(1,4,29,2,2016, "meeting", "meet arlphr");
		System.out.println("LOOKYHERE");
		System.out.println(appointment.getValid());
		appointment.setStartYear(2017);
		System.out.println("LOOKYHERE2");
		System.out.println(appointment.getValid());
		assertEquals(appointment.getValid(), false);
	}

    @Test
	public void startwronghou()
	{
		Appt appointment = new Appt(1,4,5,10,2016, "meeting", "meet arlphr");
		appointment.setStartHour(-1);
		assertEquals(appointment.getValid(), false);
	}

    @Test
	public void startwrongday()
	{
		Appt appointment = new Appt(1,4,5,10,2016, "meeting", "meet arlphr");
		appointment.setStartDay(-1);
		assertEquals(appointment.getValid(), false);
	}

	@Test
	public void startwrongmin()
	{
		Appt appointment = new Appt(1,4,5,10,2016, "meeting", "meet arlphr");
		appointment.setStartMinute(-1);
		assertEquals(appointment.getValid(), false);
	}

    @Test
	public void startwrong()
	{
		Appt appointment = new Appt(1,4,5,10,2016, "meeting", "meet arlphr");
		appointment.setStartHour(-1);
		assertEquals(appointment.getValid(), false);
	}

	@Test
	public void isval()
	{
		Appt appointment = new Appt(2100,4,5,10,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), false);
	}

	@Test
	public void isval2()
	{
		Appt appointment = new Appt(-1000,4,5,10,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getValid(), false);
	}

    @Test
	public void Const()
	{
		Appt appointment = new Appt(3,4,5,10,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getRecurBy(), 2);
	}

    @Test
	public void Title()
	{
		Appt appointment = new Appt(3,4,5,10,2016, "meeting", "meet arlphr");
		assertEquals(appointment.getTitle(), "meeting");
	}

	@Test
	public void setStartHour()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setStartHour(3);
		assertEquals(3, appointment.getStartHour());
	}

	@Test
	public void setStartMinute()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setStartMinute(4);
		assertEquals(4, appointment.getStartMinute());
	}

	@Test
	public void setStartDay()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setStartDay(5);
		assertEquals(5, appointment.getStartDay());
	}

	@Test
	public void setStartMonth()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setStartMonth(10);
		assertEquals(10, appointment.getStartMonth());
	}

	@Test
	public void setStartYear()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setStartYear(2016);
		assertEquals(2016, appointment.getStartYear());
	}

	@Test
	public void setTitle()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setTitle("meeting");
		assertEquals("meeting", appointment.getTitle());
	}

	@Test
	public void setTitleNull()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", null);
		appointment.setTitle(null);
		assertEquals("", appointment.getDescription());
	}

	@Test
	public void setDescription()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setDescription("meet arlph");
		assertEquals("meet arlph", appointment.getDescription());
	}

	@Test
	public void setDescriptionNull()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", null);
		appointment.setDescription(null);
		assertEquals("", appointment.getDescription());
	}

	@Test
	public void isValid()
	{
		Appt appointment = new Appt(3,4,5,11,2016,"meeting", "meet arlph");
		assertEquals(true, appointment.getValid());
	}

	@Test
	public void setRecurDays()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		int[] days = {15,17};
		appointment.setRecurrence(days, 3,4,5);
		int[] testdays = appointment.getRecurDays();
		assertEquals(appointment.getRecurBy(), 3);
		assertEquals(testdays[0], days[0]);
	}

	@Test
	public void setRecurDaysNull()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		appointment.setRecurrence(null, 3,4,5);
		assertEquals(0, appointment.getRecurDays().length);
	}

	@Test
	public void setRecurBy()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		int[] days = {15,17};
		appointment.setRecurrence(days, 3,4,5);
		assertEquals(appointment.getRecurBy(), 3);
	}


	@Test
	public void setRecurIncrement()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		int[] days = {15,17};
		appointment.setRecurrence(days, 3,4,5);
		assertEquals(appointment.getRecurIncrement(), 4);
	}

	@Test
	public void setRecurNumber()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		int[] days = {15,17};
		appointment.setRecurrence(days, 3,4,5);
		assertEquals(appointment.getRecurNumber(), 5);
	}

	@Test
	public void isRecurring()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		int[] days = {15,17};
		appointment.setRecurrence(days, 3,4,5);
		assertEquals(appointment.isRecurring(), true);
	}

	@Test
	public void isRecurringF()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		assertEquals(appointment.isRecurring(), false);
	}

	@Test
	public void Compareto()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		Appt appointment2 = new Appt(4,5,5,10,2016,"meeting", "meet arlph");
		int temp = appointment.compareTo(appointment2);
		assertEquals(temp, -2);
	}

	@Test
	public void toStringTest()
	{
		Appt appointment = new Appt(3,4,5,10,2016,"meeting", "meet arlph");
		String str = appointment.toString();
		assertEquals(str, str);
	}

	@Test
	public void toStringfail()
	{
		Appt appointment = new Appt(3,4,5,12,2016,"meeting", "meet arlph");
		String str = appointment.toString();
		assertEquals(str, null);
	}



}
