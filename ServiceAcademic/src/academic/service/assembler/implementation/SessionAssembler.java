package academic.service.assembler.implementation;


import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.SessionDomain;
import academic.dto.SessionDTO;
import academic.entity.SessionEntity;
import academic.service.assembler.Assembler;

public class SessionAssembler implements Assembler <SessionDomain, SessionDTO, SessionEntity>{

	private static final Assembler <SessionDomain, SessionDTO, SessionEntity>
	INSTANCE =new SessionAssembler();
	
	private SessionAssembler() {
		super();
	}
	
	public static Assembler <SessionDomain, SessionDTO, SessionEntity>
	getSessionAssembler(){
		return INSTANCE;
	}
	
	@Override
	public SessionDTO convertDomainToDTO(SessionDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SessionDTO.create();
	}

	@Override
	public SessionEntity convertDomainToEntity(SessionDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SessionEntity.create();
	}

	@Override
	public SessionDomain convertDTOToDomain(SessionDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SessionDomain.create();
	}

	@Override
	public SessionDomain convertEntityToDomain(SessionEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return SessionDomain.create();
	}

	@Override
	public List<SessionDomain> convertListEntityToListDomain(List<SessionEntity> entities) {
		List<SessionDomain> domains = new ArrayList<>();
		for (SessionEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<SessionDTO> convertListDomainToListDTO(List<SessionDomain> domains) {
		List<SessionDTO> dtos = new ArrayList<>();
		for (SessionDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	

}
