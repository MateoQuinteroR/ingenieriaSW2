package academic.entity;

public class CourseEntity {
	
	private int id;
	private SubjectEntity subject;
	private ProfessorEntity professor;
	
	public CourseEntity() {
		setId(0);
		setSubject(SubjectEntity.create());
		setProfessor(ProfessorEntity.create());
		
		
	}
	
	public static CourseEntity create() {
		return new CourseEntity();
	}
	
	public int getId() {
		return id;
	}
	public CourseEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public SubjectEntity getSubject() {
		return subject;
	}
	public CourseEntity setSubject(SubjectEntity subject) {
		this.subject = subject;
		return this;
	}
	public ProfessorEntity getProfessor() {
		return professor;
	}
	public CourseEntity setProfessor(ProfessorEntity professor) {
		this.professor = professor;
		return this;
	}
	
	



}
