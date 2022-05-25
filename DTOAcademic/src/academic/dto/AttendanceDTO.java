package academic.dto;

public class AttendanceDTO {

	private int id;
	private SessionDTO sesion;
	private StudentCourseDTO studentCourse;
	private boolean attended;

	public AttendanceDTO() {
		setId(0);
		setSesion(SessionDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
	}

	public AttendanceDTO(int id, SessionDTO session, StudentCourseDTO studentCourse, boolean attended) {
		setId(0);
		setSesion(SessionDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
	}

	public static AttendanceDTO create() {
		return new AttendanceDTO();
	}

	public static AttendanceDTO create(int id, SessionDTO session, StudentCourseDTO studentCourse, boolean attended) {
		return new AttendanceDTO(id, session, studentCourse, attended);
	}

	public int getId() {
		return id;
	}

	public AttendanceDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public SessionDTO getSesion() {
		return sesion;
	}

	public AttendanceDTO setSesion(SessionDTO sesion) {
		this.sesion = (sesion == null) ? SessionDTO.create() : sesion;
		return this;
	}

	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}

	public AttendanceDTO setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = (studentCourse == null) ? StudentCourseDTO.create() : studentCourse;
		return this;
	}

	public boolean isAttended() {
		return attended;
	}

	public AttendanceDTO setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}

}
