package Items;

import java.time.LocalTime;
import java.util.ArrayList;

public class Lesson{
    
    private LessonType type;
    private LocalTime lessonTime;
    private DayOfWeek day;
    private Integer duration;
    private Integer room;
    private Subject subject;
  
    public Lesson(LessonType type, LocalTime lessonTime, Integer duration, Integer room, Subject subject, DayOfWeek day) {
    	this.duration = duration;
    	this.lessonTime = lessonTime;
    	this.type = type;
    	this.room = room;
    	this.subject = subject;
    	this.day = day;
    }

    public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Lesson() {}
    
    
    /**
     * @generated
     */
    public LessonType getLessonType() {
        return this.type;
    }
    
    /**
     * @generated
     */
    public void setLessonType(LessonType type) {
    	this.type = type;
    }
    
    /**
     * @generated
     */
    public LocalTime getLessonTime() {
        return this.lessonTime;
    }
    
    /**
     * @generated
     */
    public void setLessonTime(LocalTime lessonTime) {
        this.lessonTime = lessonTime;
    }
    
    
    /**
     * @generated
     */
    public Integer getDuration() {
        return this.duration;
    }
    
    /**
     * @generated
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    
    /**
     * @generated
     */
    public Integer getRoom() {
        return this.room;
    }
    
    /**
     * @generated
     */
    public void setRoom(Integer room) {
        this.room = room;
    }
    
    
    /**
     * @generated
     */
    public Subject getSubject() {
        return this.subject;
    }
    
    /**
     * @generated
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    public String toString() {
    	return "| Subject: " + subject.getSubjectName() + " | lesson type: " + type + " | time: " + lessonTime + " | duration: " + duration + " | room: " + room + " |";
    }
}
