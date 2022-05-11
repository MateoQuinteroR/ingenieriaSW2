package academic.dto;

public class CourseDTO {
	
	private int id;
	private SubjectDTO subject;
	private ProfessorDTO professor;
	
	public CourseDTO() {
		setId(0);
		setSubject(SubjectDTO.create());
		setProfessor(ProfessorDTO.create());
		
		
	}
	
	public static CourseDTO create() {
		return new CourseDTO();
	}
	
	public int getId() {
		return id;
	}
	public CourseDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public SubjectDTO getSubject() {
		return subject;
	}
	public CourseDTO setSubject(SubjectDTO subject) {
		this.subject = subject;
		return this;
	}
	public ProfessorDTO getProfessor() {
		return professor;
	}
	public CourseDTO setProfessor(ProfessorDTO professor) {
		this.professor = professor;
		return this;
	}
	
	



}
