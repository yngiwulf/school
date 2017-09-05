/*************************
 * Created By: Randy Sims
 * Created On: 8/26/2017
 *************************/

package edu.seminolestate.volunteers;

import java.time.LocalDate;

public class Volunteer {

	private String firstName;
	private String lastName;
	private LocalDate startDate;
	private Double volunteerHours;
	public static final String DEFAULT_FIRST_NAME = "no first name assigned";
	public static final String DEFAULT_LAST_NAME = "no last name assigned";
	public static final LocalDate DEFAULT_START_DATE = LocalDate.now();
	public static final double DEFAULT_HOURS = 0;
		
	public Volunteer(String firstname, String lastname, LocalDate start, double hours) {
		this.firstName = DEFAULT_FIRST_NAME;
		this.lastName = DEFAULT_LAST_NAME;
		this.startDate = DEFAULT_START_DATE;
		this.volunteerHours = DEFAULT_HOURS;
		
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setStartDate(start);
		this.setVolunteerHours(hours);
	}


	public Volunteer() {
		this(DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_START_DATE, DEFAULT_HOURS);
	}
	
	public Volunteer(String firstName, String lastName) {
		this(firstName,lastName,DEFAULT_START_DATE,DEFAULT_HOURS);
	}

	
	public void updateVolunteerHours(double hours) {
			this.volunteerHours = this.volunteerHours + hours;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String newFName) {
		if (newFName != null && newFName.length() > 0) {
			this.firstName = newFName;
		}
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String newLName) {
		if (newLName != null && newLName.length() > 0) {
			this.lastName = newLName;
		}
	}
	
	public LocalDate getStartDate() {
		return this.startDate;
	}
	
	public void setStartDate(LocalDate newStartDate) {
		if (newStartDate != null) {
			this.startDate = newStartDate;
		}
	}
	
	public void setStartDate(int newYear, int newMonth, int newDay) {
		if (newYear != 0 && newMonth != 0 && newDay != 0) {
			this.startDate = LocalDate.of(newYear, newMonth, newDay);
		}
	}
	
	public double getVolunteerHours() {
		return this.volunteerHours;
	}
	
	public void setVolunteerHours(double newHours) {
		this.volunteerHours = this.volunteerHours + newHours;
	}
	
	public String toString() {
		return "Volunteer [firstName=" + firstName
				+ " lastName=" + lastName
				+ " startDate=" + startDate
				+ " volunteerHours=" + volunteerHours;
	}
	
}
