package academic.dto;

public class StudentCourseStateDTO {
	
	private int id;
	private String name;
	
	
	public StudentCourseStateDTO(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public StudentCourseStateDTO() {
		setName("");
	}
	
	public static StudentCourseStateDTO create() {
		return new StudentCourseStateDTO();
	}
	
	public static StudentCourseStateDTO create(int id,String name) {
		return new StudentCourseStateDTO(id, name);	
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
