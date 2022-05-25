package academic.domain;

import java.util.Calendar;
import java.util.Date;

public class CourseDomain {

	private int id;
	private SubjectDomain subject;
	private ProfessorDomain professor;
	private Date initialDate;
	private Date finalDate;

	public static CourseDomain create() {
		return new CourseDomain();
	}

	public static CourseDomain create(int id, SubjectDomain subject, ProfessorDomain professor, Date initialDate,
			Date finalDate) {
		return new CourseDomain(id, subject, professor, initialDate, finalDate);
	}

	public CourseDomain(int id, SubjectDomain subject, ProfessorDomain professor, Date initialDate, Date finalDate) {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
		setInitialDate(initialDate);
		setFinalDate(finalDate);
	}

	public CourseDomain() {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
		setInitialDate(initialDate);
		setFinalDate(finalDate);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public SubjectDomain getSubject() {
		return subject;
	}

	private void setSubject(SubjectDomain subject) {
		this.subject = (subject == null) ? new SubjectDomain() : subject;
	}

	public ProfessorDomain getProfessor() {
		return professor;
	}

	private void setProfessor(ProfessorDomain professor) {
		this.professor = (professor == null) ? new ProfessorDomain() : professor;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	private void setInitialDate(Date initialDate) {
		this.initialDate = (initialDate == null) ? Calendar.getInstance().getTime() : initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	private void setFinalDate(Date finalDate) {
		this.finalDate = (finalDate == null) ? Calendar.getInstance().getTime() : finalDate;
	}

	public boolean isOpen() {
		return (Calendar.getInstance().getTime().getTime() >= getInitialDate().getTime()
				&& Calendar.getInstance().getTime().getTime() <= getFinalDate().getTime());
	}
}
