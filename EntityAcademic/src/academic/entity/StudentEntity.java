package academic.entity;

public class StudentEntity {
	
	private int id;
	private IdTypeEntity idType;
	private String name;
	
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
	
	

}
