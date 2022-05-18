package academic.dto;

public class IdTypeDTO {
	
	private int id;
	private String name;
	
	public IdTypeDTO(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public IdTypeDTO() {
		setName("");
	}
	
	public static IdTypeDTO create() {
		return new IdTypeDTO();
	}
	
	public static IdTypeDTO create(int id,String name) {
		return new IdTypeDTO(id, name);	
	}
	
	public int getId() {
		return id;
	}

	public IdTypeDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}

	public String getName() {
		return name;
	}

	public IdTypeDTO setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
	
}
