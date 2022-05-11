package academic.domain;

import javax.security.auth.Subject;

public class CourseDomain {
	
	private int id;
	private Subject subject;
	private ProfessorDomain professor;
	
	public CourseDomain(int id, Subject subject, ProfessorDomain professor) {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public ProfessorDomain getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorDomain professor) {
		this.professor = professor;
	}
	
	

	
}
