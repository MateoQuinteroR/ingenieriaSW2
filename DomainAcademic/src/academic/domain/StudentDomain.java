package academic.domain;

public class StudentDomain {
	
	private int id;
	private String idNumber;
	private IdTypeDomain idType;
	private String name;
	private String email;
	
	public StudentDomain() {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
	}
	
	public static StudentDomain create() {
		return new StudentDomain();
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
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
