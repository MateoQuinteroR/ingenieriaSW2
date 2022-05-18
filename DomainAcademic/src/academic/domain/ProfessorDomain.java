package academic.domain;

public class ProfessorDomain {
	
	private int id;
	private String idNumber;
	private IdTypeDomain idType;
	private String name;
	private String email;
	
	
	public ProfessorDomain() {
		setId(0);
		setIdNumber("");
		setIdType(IdTypeDomain.create());
		setName("");
		setEmail("");
		
	}
	
	public ProfessorDomain(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public static ProfessorDomain create(int id,String name) {
		return new ProfessorDomain(id, name);	
	}
	
	public static ProfessorDomain create() {
		return new ProfessorDomain();
	}
	
	public int getId() {
		return id;
	}
	public ProfessorDomain setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public IdTypeDomain getIdType() {
		return idType;
	}
	public ProfessorDomain setIdType(IdTypeDomain idType) {
		this.idType = idType;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProfessorDomain setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public ProfessorDomain setIdNumber(String idNumber) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorDomain setEmail(String email) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
}
