package academic.domain;

public class SubjectDomain {
	
	private int id;
	private String name;
	public SubjectDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

	
}
