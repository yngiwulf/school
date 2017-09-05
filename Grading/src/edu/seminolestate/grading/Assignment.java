package edu.seminolestate.grading;

import java.time.LocalDate;
/*
 * Without using exceptions (covered later in the course) we need a way
 * to handle invalid data sent to this class. We will follow the rule:
 * 		- invalid parameter values sent to the constructor(s) will be replaced
 * 		with valid default values.
 * 		- invalid parameter values sent to the set methods will cause the
 * 		update to be skipped (no change to the class variable)
 */
public class Assignment {
	public static final String 		DEFAULT_DESCRIPTION = "No Description";
	public static final double 		DEFAULT_SCORE = 0;
	public static final LocalDate 	DEFAULT_DUEDATE = LocalDate.now();
	private String description;
	private double score;
	private LocalDate dueDate;
	
	public Assignment(String startingDesc, double startingScore, LocalDate startingDueDate) {
		/*	assign default values to class data variables
			then call the set methods using parameters
			if parameters are valid, the class variable will get new values
			if parameters are invalid, the class values will retain the default values
		 */
		this.description = DEFAULT_DESCRIPTION;
		this.score = DEFAULT_SCORE;
		this.dueDate = DEFAULT_DUEDATE;
		//we want to call the set methods so we don't have the code to edits in more than one place
		this.setDescription(startingDesc);
		this.setScore(startingScore);
		this.setDueDate(startingDueDate);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String newDescription) {
		/*
		 * Update done only if parameter value is valid
		 * other wise no update is done
		 */
		if (newDescription != null && newDescription.length() > 0){
			this.description = newDescription;
		}
	}
	public double getScore() {
		return score;
	}
	public void setScore(double newScore) {
		/*
		 * Update done only if parameter value is valid
		 * other wise no update is done
		 */
		if (newScore >=  0 && newScore <= 100){
			this.score = newScore;
		}
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate newDueDate) {
		/*
		 * Update done only if parameter value is valid
		 * other wise no update is done
		 */
		if (newDueDate != null){
			this.dueDate = newDueDate;
		}
	}
	@Override
	public String toString() {
		return "Assignment [description=" + description + ", score=" + score + ", dueDate=" + dueDate + "]";
	}
}
