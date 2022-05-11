package academic.entity;

public class IdTypeEntity {
	
	private int id;
	private String name;
	
	public IdTypeEntity() {
		setId(0);
		setName("");
		
	}
	
	public static IdTypeEntity create() {
		return new IdTypeEntity();
	}

	public int getId() {
		return id;
	}

	public IdTypeEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public String getName() {
		return name;
	}

	public IdTypeEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
	
}
