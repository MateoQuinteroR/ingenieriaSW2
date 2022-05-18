package academic.entity;


public class AttendanceEntity {
	
	private int id;
	private StudentCourseEntity studentCourse;
	private SessionEntity session;
	private boolean attended;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentCourseEntity getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseEntity studentCourse) {
		this.studentCourse = studentCourse;
	}
	public SessionEntity getSession() {
		return session;
	}
	public void setSession(SessionEntity session) {
		this.session = session;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}


	
}
