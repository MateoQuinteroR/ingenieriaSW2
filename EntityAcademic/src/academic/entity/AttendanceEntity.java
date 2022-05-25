package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Attendance")
public class AttendanceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "studentCourse")
	private StudentCourseEntity studentCourse;
	@ManyToOne
	@JoinColumn(name = "session")
	private SessionEntity session;
	@Column(name = "student")
	private boolean attended;
	
	public AttendanceEntity() {
		setId(0);
		setStudentCourse(StudentCourseEntity.create());
		setSession(SessionEntity.create());
	}
	
	public static AttendanceEntity create() {
		return new AttendanceEntity();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentCourseEntity getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseEntity studentCourse) {
		this.studentCourse = studentCourse;
	}
	public SessionEntity getSession() {
		return session;
	}
	public void setSession(SessionEntity session) {
		this.session = session;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}


	
}
