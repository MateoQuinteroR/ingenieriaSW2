package academic.entity;

import java.util.Date;

public class CourseEntity {
	
	private int id;
	private SubjectEntity subject;
	private ProfessorEntity professor;
	private Date initialDate;
	private Date finalDate;
	
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

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
	



}
