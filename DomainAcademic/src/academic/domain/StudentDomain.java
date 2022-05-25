package academic.domain;

public class StudentDomain {

	private int id;
	private String idNumber;
	private IdTypeDomain idType;
	private String name;
	private String email;

	public static StudentDomain create() {
		return new StudentDomain();
	}

	public static StudentDomain create(int id, IdTypeDomain idType, String name, String idNumber, String email) {
		return new StudentDomain(id, idType, name, idNumber, email);
	}

	public StudentDomain() {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
		setIdNumber(idNumber);
		setEmail(email);
	}

	public StudentDomain(int id, IdTypeDomain idType, String name, String idNumber, String email) {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
		setIdNumber(idNumber);
		setEmail(email);
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public IdTypeDomain getIdType() {
		return idType;
	}

	private void setIdType(IdTypeDomain idType) {
		this.idType = (idType == null) ? new IdTypeDomain() : idType;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

	public String getIdNumber() {
		return idNumber;
	}

	private void setIdNumber(String idNumber) {
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();
	}

}
