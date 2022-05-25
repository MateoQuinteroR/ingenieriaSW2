package academic.domain;

public class AttendanceDomain {

	private int id;
	private SessionDomain session;
	private StudentCourseDomain studentCourse;
	private boolean attended;

	public AttendanceDomain() {
		super();
		setId(id);
		setSession(session);
		setStudentCourse(studentCourse);
		setAttended(attended);
	}

	public static AttendanceDomain create() {
		return new AttendanceDomain();
	}

	public static AttendanceDomain create(int id, SessionDomain session, StudentCourseDomain studentCourse,
			boolean attended) {
		return new AttendanceDomain(id, session, studentCourse, attended);
	}

	public AttendanceDomain(int id, SessionDomain session, StudentCourseDomain studentCourse, boolean attended) {
		super();
		setId(id);
		setSession(session);
		setStudentCourse(studentCourse);
		setAttended(attended);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public SessionDomain getSession() {
		return session;
	}

	private void setSession(SessionDomain session) {
		this.session = (session == null) ? new SessionDomain() : session;
	}

	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}

	private void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = (studentCourse == null) ? new StudentCourseDomain() : studentCourse;
	}

	public boolean isAttended() {
		return attended;
	}

	private void setAttended(boolean attended) {
		this.attended = attended;
	}

}
