package academic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "subject")
	private SubjectEntity subject;
	@ManyToOne
	@JoinColumn(name = "professor")
	private ProfessorEntity professor;
	@Column(name = "initialDate")
	private Date initialDate;
	@Column(name = "finalDate")
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
