package academic.domain;

public class StudentDomain {
	
	private int id;
	private IdTypeDomain idType;
	private String name;
	public StudentDomain(int id, IdTypeDomain idType, String name) {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}
	public IdTypeDomain getIdType() {
		return idType;
	}
	public void setIdType(IdTypeDomain idType) {
		this.idType = idType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

	
}
