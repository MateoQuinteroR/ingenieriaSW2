package academic.entity;

public class ProfessorEntity {
	
	private int id;
	private String idNumber;
	private IdTypeEntity idType;
	private String name;
	private String email;
	
	
	public ProfessorEntity() {
		setId(0);
		setIdNumber("");
		setIdType(IdTypeEntity.create());
		setName("");
		setEmail("");
		
	}
	
	public ProfessorEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public static ProfessorEntity create(int id,String name) {
		return new ProfessorEntity(id, name);	
	}
	
	public static ProfessorEntity create() {
		return new ProfessorEntity();
	}
	
	public int getId() {
		return id;
	}
	public ProfessorEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public IdTypeEntity getIdType() {
		return idType;
	}
	public ProfessorEntity setIdType(IdTypeEntity idType) {
		this.idType = idType;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProfessorEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public ProfessorEntity setIdNumber(String idNumber) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorEntity setEmail(String email) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
	
}
