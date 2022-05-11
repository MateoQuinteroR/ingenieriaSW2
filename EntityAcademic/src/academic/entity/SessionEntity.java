package academic.entity;

import java.util.Calendar;
import java.util.Date;

public class SessionEntity {
	
	private int id;
	private CourseEntity course;
	private Date date;
	
	public SessionEntity() {
		setId(0);
		setCourse(CourseEntity.create());
		setDate(Calendar.getInstance().getTime());
		
	}
	
	public static SessionEntity create() {
		return new SessionEntity();
	}
	
	public int getId() {
		return id;
	}
	public SessionEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public CourseEntity getCourse() {
		return course;
	}
	public SessionEntity setCourse(CourseEntity course) {
		this.course = course;
		return this;
	}
	public Date getDate() {
		return date;
	}
	public SessionEntity setDate(Date date) {
		this.date = date;
		return this;
	}
	
	

}
