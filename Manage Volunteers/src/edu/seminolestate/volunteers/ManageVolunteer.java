/*************************
 * Created By: Randy Sims
 * Created On: 8/26/2017
 *************************/

package edu.seminolestate.volunteers;

import java.time.LocalDate;

public class ManageVolunteer {

	public static void main(String[] args) {
		Volunteer vol1 = new Volunteer("Randy","Sims",LocalDate.of(2016, 5, 1),5);
		System.out.println("Volunteer 1\n" + vol1.toString() + "\n");
		Volunteer vol2 = new Volunteer();
		System.out.println("Volunteer 2\n" + vol2.toString() + "\n");
		Volunteer vol3 = new Volunteer("Renee","Braziel");
		System.out.println("Volunteer 3\n" + vol3.toString() + "\n");
		vol1.updateVolunteerHours(5);
		vol1.setStartDate(2017, 1, 31);
		System.out.println("Volunteer 1 after updating hours and start date\n" + vol1.toString() + "\n");
	}

}
