package academic.domain;

public class StudentCourseDomain {

	private int id;
	private StudentDomain student;
	private CourseDomain course;
	private int state;

	public static StudentCourseDomain create() {
		return new StudentCourseDomain();
	}

	public static StudentCourseDomain create(int id, StudentDomain student, CourseDomain course, int state) {
		return new StudentCourseDomain(id, student, course, state);
	}

	public StudentCourseDomain() {
		super();
		setId(id);
		setStudent(student);
		setCourse(course);
		setState(state);
	}

	public StudentCourseDomain(int id, StudentDomain student, CourseDomain course, int state) {
		super();
		setId(id);
		setStudent(student);
		setCourse(course);
		setState(state);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public StudentDomain getStudent() {
		return student;
	}

	private void setStudent(StudentDomain student) {
		this.student = (student == null) ? new StudentDomain() : student;
	}

	public CourseDomain getCourse() {
		return course;
	}

	private void setCourse(CourseDomain course) {
		this.course = (course == null) ? new CourseDomain() : course;
	}

	public int getState() {
		return state;
	}

	private void setState(int state) {
		this.state = (state < 0) ? 0 : state;
	}
}
