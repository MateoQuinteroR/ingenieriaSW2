package academic.domain;

import java.util.Calendar;
import java.util.Date;

public class SessionDomain {

	private int id;
	private CourseDomain course;
	private Date date;

	public static SessionDomain create() {
		return new SessionDomain();
	}

	public static SessionDomain create(int id, CourseDomain course, Date date) {
		return new SessionDomain(id, course, date);
	}

	public SessionDomain() {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}

	public SessionDomain(int id, CourseDomain course, Date date) {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public CourseDomain getCourse() {
		return course;
	}

	private void setCourse(CourseDomain course) {
		this.course = (course == null) ? new CourseDomain() : course;
	}

	public Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = (date == null) ? Calendar.getInstance().getTime() : date;
	}
}
