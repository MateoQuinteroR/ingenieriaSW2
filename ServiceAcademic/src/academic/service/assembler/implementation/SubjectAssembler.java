package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.SubjectDomain;
import academic.dto.SubjectDTO;
import academic.entity.SubjectEntity;
import academic.service.assembler.Assembler;

public class SubjectAssembler implements Assembler <SubjectDomain, SubjectDTO, SubjectEntity>{

	
	private static final Assembler <SubjectDomain, SubjectDTO, SubjectEntity>
	INSTANCE =new SubjectAssembler();
	
	private SubjectAssembler() {
		super();
	}
	
	public static Assembler <SubjectDomain, SubjectDTO, SubjectEntity>
	getSubjectAssembler(){
		return INSTANCE;
	}

	@Override
	public SubjectDTO convertDomainToDTO(SubjectDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectDTO.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectEntity convertDomainToEntity(SubjectDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectEntity.create(domain.getId(), domain.getName());
	}

	@Override
	public SubjectDomain convertDTOToDomain(SubjectDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectDomain.create(dto.getId(), dto.getName());
	}

	@Override
	public SubjectDomain convertEntityToDomain(SubjectEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SubjectDomain.create(entity.getId(), entity.getName());
	}

	@Override
	public List<SubjectDomain> convertListEntityToListDomain(List<SubjectEntity> entities) {
		List<SubjectDomain> domains = new ArrayList<>();
		for (SubjectEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<SubjectDTO> convertListDomainToListDTO(List<SubjectDomain> domains) {
		List<SubjectDTO> dtos = new ArrayList<>();
		for (SubjectDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
}
