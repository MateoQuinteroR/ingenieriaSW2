package academic.entity;

public class IdTypeEntity {
	
	private int id;
	private String name;
	
	public IdTypeEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public IdTypeEntity() {
		setName("");
	}
	
	public static IdTypeEntity create() {
		return new IdTypeEntity();
	}
	
	public static IdTypeEntity create(int id,String name) {
		return new IdTypeEntity(id, name);	
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
