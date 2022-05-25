package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.ProfessorDomain;
import academic.dto.ProfessorDTO;
import academic.entity.ProfessorEntity;
import academic.service.assembler.Assembler;

public class ProfessorAssembler implements Assembler <ProfessorDomain, ProfessorDTO, ProfessorEntity>{

	private static final Assembler <ProfessorDomain, ProfessorDTO, ProfessorEntity>
	INSTANCE =new ProfessorAssembler();
	
	private ProfessorAssembler() {
		super();
	}
	
	public static Assembler <ProfessorDomain, ProfessorDTO, ProfessorEntity>
	getProfessorAssembler(){
		return INSTANCE;
	}
	
	@Override
	public ProfessorDTO convertDomainToDTO(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorDTO.create();
	}

	@Override
	public ProfessorEntity convertDomainToEntity(ProfessorDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorEntity.create();
	}

	@Override
	public ProfessorDomain convertDTOToDomain(ProfessorDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorDomain.create();
	}

	@Override
	public ProfessorDomain convertEntityToDomain(ProfessorEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return ProfessorDomain.create();
	}

	@Override
	public List<ProfessorDomain> convertListEntityToListDomain(List<ProfessorEntity> entities) {
		List<ProfessorDomain> domains = new ArrayList<>();
		for (ProfessorEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<ProfessorDTO> convertListDomainToListDTO(List<ProfessorDomain> domains) {
		List<ProfessorDTO> dtos = new ArrayList<>();
		for (ProfessorDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}


}
