package academic.entity;



public class StudentEntity {
	
	private int id;
	private String idNumber;
	private IdTypeEntity idType;
	private String name;
	private String email;
	
	public StudentEntity() {
		setId(0);
		setIdType(IdTypeEntity.create());
		setName("");
		
	}
	
	public static StudentEntity create() {
		return new StudentEntity();
	}
	
	public int getId() {
		return id;
	}
	public StudentEntity setId(int id) {
		this.id = (id < 0) ? 0 : id;
		return this;
	}
	public IdTypeEntity getIdType() {
		return idType;
	}
	public StudentEntity setIdType(IdTypeEntity idType) {
		this.idType = idType;
		return this;
	}
	public String getName() {
		return name;
	}
	public StudentEntity setName(String name) {
		this.name = (name == null) ? "" : name.trim();
		return this;
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
