package Items;

import java.util.HashMap;
import java.util.Vector;

public class Timetable{
	
	Lesson lesson;
	private HashMap<DayOfWeek, Vector<Lesson>> lessons = new HashMap<>();
	
	
	public Timetable() {
		lessons.put(DayOfWeek.FRIDAY, new Vector<Lesson>());
		lessons.put(DayOfWeek.MONDAY, new Vector<Lesson>());
		lessons.put(DayOfWeek.SATURDAY, new Vector<Lesson>());
		lessons.put(DayOfWeek.THURSDAY, new Vector<Lesson>());
		lessons.put(DayOfWeek.TUESDAY, new Vector<Lesson>());
		lessons.put(DayOfWeek.WEDNESDAY, new Vector<Lesson>());
		
	}

	
	/**
     * Adding values in Vector "Lesson".
     */
	public void addLesson(Lesson lesson) {
		
		 	lessons.get(lesson.getDay()).add(lesson);
	}
	
	
	/**
     * Showing the lessons for the current day.
     */
	public void showLessonFullDay(DayOfWeek day) {
		
		System.out.println(day);

			for(Lesson lesson : lessons.get(day)) {
				System.out.println(lesson.toString());
			}
			
		System.out.println("----------");
	}
	
	/**
     * Showing the lessons for the week.
     */
	public void showTimetable() {
	    System.out.println("----------------|SCHEDULE|----------------");

		for (DayOfWeek day1 : DayOfWeek.values()) {
	    	showLessonFullDay(day1);
	    }
	}
	
}
    
