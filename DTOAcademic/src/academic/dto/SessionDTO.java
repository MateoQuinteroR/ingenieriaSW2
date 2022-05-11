package academic.dto;

import java.util.Calendar;
import java.util.Date;

public class SessionDTO {
	
	private int id;
	private CourseDTO course;
	private Date date;
	
	public SessionDTO() {
		setId(0);
		setCourse(CourseDTO.create());
		setDate(Calendar.getInstance().getTime());
		
	}
	
	public static SessionDTO create() {
		return new SessionDTO();
	}
	
	public int getId() {
		return id;
	}
	public SessionDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public CourseDTO getCourse() {
		return course;
	}
	public SessionDTO setCourse(CourseDTO course) {
		this.course = course;
		return this;
	}
	public Date getDate() {
		return date;
	}
	public SessionDTO setDate(Date date) {
		this.date = date;
		return this;
	}
	
	

}
