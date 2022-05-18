package academic.dto;

public class AttendanceDTO {

	private int id;
	private StudentCourseDTO studentCourse;
	private SessionDTO session;
	private boolean attended;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = studentCourse;
	}
	public SessionDTO getSession() {
		return session;
	}
	public void setSession(SessionDTO session) {
		this.session = session;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}

	
	
}
