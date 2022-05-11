package academic.dto;

public class StudentCourseDTO {
	
	private int id;
	private StudentDTO student;
	private CourseDTO course;
	
	public StudentCourseDTO() {
		setId(0);
		setStudent(StudentDTO.create());
		setCourse(CourseDTO.create());
		
	}
	
	public static StudentCourseDTO create() {
		return new StudentCourseDTO();
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
		this.student = student;
		return this;
	}
	public CourseDTO getCourse() {
		return course;
	}
	public StudentCourseDTO setCourse(CourseDTO course) {
		this.course = course;
		return this;
	}
	
	
	

}
