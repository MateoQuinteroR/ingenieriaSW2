package academic.service.assembler;

public interface Assembler <D, T, E>{

	T convertDomainToDTO(D domain);
	
	E convertDomainToEntity(D domain);
	
	D convertDTOToDomain(T dto);
	
	D convertEntityToDomain(E entity);
	
}
