package edu.seminolestate.grading;

import java.time.LocalDate;

public class AssignmentApplication {

	public static void main(String[] args) {
		//try to create an object below but pass 3 invalid values.
		Assignment assignment_1 = new Assignment("", -100, null);
		//display the object values showing how the invalid values were replaced
		//by the default values
		System.out.println(assignment_1);
		
		//try to create the object using 3 good values
		Assignment assignment_2 = new Assignment("Midterm", 75, LocalDate.now());
		//display the object values showing how the valid values were applied
		System.out.println(assignment_2);
		
		//test the set methods by passing invalid values
		assignment_2.setDescription(null);
		assignment_2.setScore(-99);
		assignment_2.setDueDate(null);
		////display the object values showing how the existing values were not changed
		System.out.println(assignment_2);
	}
}
