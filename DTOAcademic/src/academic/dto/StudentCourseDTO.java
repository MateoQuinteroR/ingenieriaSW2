package academic.dto;

public class StudentCourseDTO {

	private int id;
	private StudentDTO student;
	private CourseDTO course;
	private int state;

	public StudentCourseDTO() {
		setId(0);
		setStudent(StudentDTO.create());
		setCourse(CourseDTO.create());
		setState(0);
	}

	public StudentCourseDTO(int id, StudentDTO student, CourseDTO course, int state) {
		setId(0);
		setStudent(StudentDTO.create());
		setCourse(CourseDTO.create());
		setState(0);
	}

	public static StudentCourseDTO create() {
		return new StudentCourseDTO();
	}

	public static StudentCourseDTO create(int id, StudentDTO student, CourseDTO course, int state) {
		return new StudentCourseDTO(id, student, course, state);
	}

	public int getId() {
		return id;
	}

	public StudentCourseDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;

	}

	public StudentDTO getStudent() {
		return student;
	}

	public StudentCourseDTO setStudent(StudentDTO student) {
		this.student = (student == null) ? StudentDTO.create() : student;
		return this;

	}

	public CourseDTO getCourse() {
		return course;
	}

	public StudentCourseDTO setCourse(CourseDTO course) {
		this.course = (course == null) ? CourseDTO.create() : course;
		return this;
	}

	public int getState() {
		return state;
	}

	public StudentCourseDTO setState(int state) {
		this.state = (state < 0) ? 0 : state;
		return this;
	}
}
