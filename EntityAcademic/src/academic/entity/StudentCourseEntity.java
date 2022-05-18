package academic.entity;

public class StudentCourseEntity {
	
	private int id;
	private StudentEntity student;
	private CourseEntity course;
	private int state;
	
	public StudentCourseEntity() {
		setId(0);
		setStudent(StudentEntity.create());
		setCourse(CourseEntity.create());
		
	}
	
	public static StudentCourseEntity create() {
		return new StudentCourseEntity();
	}
	
	public int getId() {
		return id;
	}
	public StudentCourseEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public StudentCourseEntity setStudent(StudentEntity student) {
		this.student = student;
		return this;
	}
	public CourseEntity getCourse() {
		return course;
	}
	public StudentCourseEntity setCourse(CourseEntity course) {
		this.course = course;
		return this;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	

}
