package academic.dto;

import java.util.Calendar;
import java.util.Date;

public class CourseDTO {

	private int id;
	private SubjectDTO subject;
	private ProfessorDTO professor;
	private Date initialDate;
	private Date finalDate;

	public CourseDTO() {
		setId(0);
		setSubject(SubjectDTO.create());
		setProfessor(ProfessorDTO.create());
		setInitialDate(Calendar.getInstance().getTime());
		setFinalDate(Calendar.getInstance().getTime());
	}

	public CourseDTO(int id, SubjectDTO subject, ProfessorDTO professor, Date initialDate, Date finalDate) {
		setId(0);
		setSubject(SubjectDTO.create());
		setProfessor(ProfessorDTO.create());
		setInitialDate(Calendar.getInstance().getTime());
		setFinalDate(Calendar.getInstance().getTime());
	}

	public static CourseDTO create() {
		return new CourseDTO();
	}

	public static CourseDTO create(int id, SubjectDTO subject, ProfessorDTO professor, Date initialDate,
			Date finalDate) {
		return new CourseDTO(id, subject, professor, initialDate, finalDate);
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
		this.subject = (subject == null) ? SubjectDTO.create() : subject;
		return this;
	}

	public ProfessorDTO getProfessor() {
		return professor;
	}

	public CourseDTO setProfessor(ProfessorDTO professor) {
		this.professor = (professor == null) ? ProfessorDTO.create() : professor;
		return this;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public CourseDTO setInitialDate(Date initialDate) {
		this.initialDate = (initialDate == null) ? Calendar.getInstance().getTime() : initialDate;
		return this;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public CourseDTO setFinalDate(Date finalDate) {
		this.finalDate = (finalDate == null) ? Calendar.getInstance().getTime() : finalDate;
		return this;
	}

	public boolean isOpen() {
		return (Calendar.getInstance().getTime().getTime() >= getInitialDate().getTime()
				&& Calendar.getInstance().getTime().getTime() <= getFinalDate().getTime());
	}

}
