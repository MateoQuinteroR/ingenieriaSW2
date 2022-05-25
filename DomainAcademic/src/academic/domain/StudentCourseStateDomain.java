package academic.domain;

public class StudentCourseStateDomain {

	private int id;
	private String name;

	public StudentCourseStateDomain() {
		super();
		setId(id);
		setName(name);
	}

	public StudentCourseStateDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public static StudentCourseStateDomain create() {
		return new StudentCourseStateDomain();
	}

	public static StudentCourseStateDomain create(int id, String name) {
		return new StudentCourseStateDomain(id, name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}
}
