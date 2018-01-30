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
		assertEquals(testdays[1],days[1]);
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
