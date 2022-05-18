package academic.dto;


public class ProfessorDTO {
	
	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name;
	private String email;
	
	
	public ProfessorDTO() {
		setId(0);
		setIdNumber("");
		setIdType(IdTypeDTO.create());
		setName("");
		setEmail("");
		
	}
	
	public ProfessorDTO(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public static ProfessorDTO create(int id,String name) {
		return new ProfessorDTO(id, name);	
	}
	
	public static ProfessorDTO create() {
		return new ProfessorDTO();
	}
	
	public int getId() {
		return id;
	}
	public ProfessorDTO setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public ProfessorDTO setIdType(IdTypeDTO idType) {
		this.idType = idType;
		return this;
	}
	public String getName() {
		return name;
	}
	public ProfessorDTO setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public ProfessorDTO setIdNumber(String idNumber) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorDTO setEmail(String email) {
		this.name = (name == null) ? "" : name.trim();
		return this;
	}
	
	
	

}
