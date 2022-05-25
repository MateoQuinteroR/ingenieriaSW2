package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "StudentCourseState")
public class StudentCourseStateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
	
	public StudentCourseStateEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public StudentCourseStateEntity() {
		setName("");
	}
	
	public static StudentCourseStateEntity create() {
		return new StudentCourseStateEntity();
	}
	
	public static StudentCourseStateEntity create(int id,String name) {
		return new StudentCourseStateEntity(id, name);	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
