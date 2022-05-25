package academic.domain;

import java.util.Date;


public class SessionDomain {
	
	private int id;
	private CourseDomain course;
	private Date date;
	
	public SessionDomain() {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}
	
	public static SessionDomain create() {
		return new SessionDomain();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CourseDomain getCourse() {
		return course;
	}
	public void setCourse(CourseDomain course) {
		this.course = course;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
