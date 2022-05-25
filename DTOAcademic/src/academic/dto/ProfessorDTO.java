package academic.dto;

public class ProfessorDTO {

	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name;
	private String email;

	public ProfessorDTO() {
		setIdNumber("");
		setIdType(IdTypeDTO.create());
		setName("");
		setEmail("");
	}

	public ProfessorDTO(int id, String idNumber, IdTypeDTO idType, String name, String email) {
		setId(id);
		setIdNumber(idNumber);
		setIdType(idType);
		setName(name);
		setEmail(email);
	}

	public static ProfessorDTO create() {
		return new ProfessorDTO();
	}

	public static ProfessorDTO create(int id, String idNumber, IdTypeDTO idType, String name, String email) {
		return new ProfessorDTO(id, idNumber, idType, name, email);
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
		this.idType = (idType == null) ? IdTypeDTO.create() : idType;
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
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorDTO setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();
		return this;
	}

}
