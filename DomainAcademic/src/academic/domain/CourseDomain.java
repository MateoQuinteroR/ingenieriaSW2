package academic.domain;

import java.util.Calendar;
import java.util.Date;

import javax.security.auth.Subject;

public class CourseDomain {
	
	private int id;
	private Subject subject;
	private ProfessorDomain professor;
	private Date initialDate;
	private Date finalDate;
	
	public CourseDomain(int id, Subject subject, ProfessorDomain professor) {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
	}
	
	public CourseDomain() {
		setId(0);
	}
	
	public static CourseDomain create() {
		return new CourseDomain();
	}
	
	public static CourseDomain create(int id, Subject subject, ProfessorDomain professor) {
		return new CourseDomain(id, subject, professor);
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

	
	public boolean isOpen() {
		return (Calendar.getInstance().getTime().getTime() >= getInitialDate().getTime() && Calendar.getInstance().getTime().getTime() <= getFinalDate().getTime());

	}

	
}
