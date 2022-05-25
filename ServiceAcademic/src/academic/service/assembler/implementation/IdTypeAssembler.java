package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.IdTypeDomain;
import academic.dto.IdTypeDTO;
import academic.entity.IdTypeEntity;
import academic.service.assembler.Assembler;

public class IdTypeAssembler implements Assembler <IdTypeDomain, IdTypeDTO, IdTypeEntity>{

	
	private static final Assembler <IdTypeDomain, IdTypeDTO, IdTypeEntity>
	INSTANCE =new IdTypeAssembler();
	
	private IdTypeAssembler() {
		super();
	}
	
	public static Assembler <IdTypeDomain, IdTypeDTO, IdTypeEntity>
	getIdTypeAssembler(){
		return INSTANCE;
	}
	
	@Override
	public IdTypeDTO convertDomainToDTO(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return IdTypeDTO.create(domain.getId(), domain.getName());
	}

	@Override
	public IdTypeEntity convertDomainToEntity(IdTypeDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return IdTypeEntity.create(domain.getId(), domain.getName());
	}

	@Override
	public IdTypeDomain convertDTOToDomain(IdTypeDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return IdTypeDomain.create(dto.getId(), dto.getName());
	}

	@Override
	public IdTypeDomain convertEntityToDomain(IdTypeEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return IdTypeDomain.create(entity.getId(), entity.getName());
	}

	@Override
	public List<IdTypeDomain> convertListEntityToListDomain(List<IdTypeEntity> entities) {
		List<IdTypeDomain> domains = new ArrayList<>();
		for (IdTypeEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<IdTypeDTO> convertListDomainToListDTO(List<IdTypeDomain> domains) {
		List<IdTypeDTO> dtos = new ArrayList<>();
		for (IdTypeDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	
	
}
