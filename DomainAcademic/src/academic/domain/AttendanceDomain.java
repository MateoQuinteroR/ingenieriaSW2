package academic.domain;

public class AttendanceDomain {
	
	private int id;
	private StudentCourseDomain studentCourse;
	private SessionDomain session;
	private boolean attended;
	
	public AttendanceDomain(int id) {
		super();
		setId(id);
		setStudentCourse(studentCourse);
		setSession(session);
		setAttended(attended);
	}

	public AttendanceDomain() {
		setId(0);
	}
	
	public static AttendanceDomain create() {
		return new AttendanceDomain();
	}
	
	public static AttendanceDomain create(int id) {
		return new AttendanceDomain(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = studentCourse;
	}
	public SessionDomain getSession() {
		return session;
	}
	public void setSession(SessionDomain session) {
		this.session = session;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}

	
}
