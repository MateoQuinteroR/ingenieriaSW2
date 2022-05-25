package academic.domain;

public class SubjectDomain {
	
	private int id;
	private String name;
	
	
	private SubjectDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public SubjectDomain() {
		setId(0);
	}
	
	public static SubjectDomain create(int id,String name) {
		return new SubjectDomain(id, name);	
	}
	
	public static SubjectDomain create() {
		return new SubjectDomain();	
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
