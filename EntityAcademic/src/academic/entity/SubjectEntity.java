package academic.entity;

public class SubjectEntity {
	
	private int id;
	private String name;
	
	public SubjectEntity() {
		setId(0);
		setName("");
		
	}
	
	public static SubjectEntity create() {
		return new SubjectEntity();
	}
	
	public int getId() {
		return id;
	}
	public SubjectEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public String getName() {
		return name;
	}
	public SubjectEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
	
	

}
