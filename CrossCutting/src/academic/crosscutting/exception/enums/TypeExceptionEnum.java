package academic.crosscutting.exception.enums;

public enum TypeExceptionEnum {

	BUSINESS, TECHNICAL, DEFAULT;
	
	public static TypeExceptionEnum getDefault() {
		return DEFAULT;
	}
	
}
