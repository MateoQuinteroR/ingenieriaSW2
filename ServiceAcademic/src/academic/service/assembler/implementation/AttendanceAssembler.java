package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.AttendanceDomain;
import academic.dto.AttendanceDTO;
import academic.entity.AttendanceEntity;
import academic.service.assembler.Assembler;

public class AttendanceAssembler implements Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>{

	private static final Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>
	INSTANCE =new AttendanceAssembler();
	
	private AttendanceAssembler() {
		super();
	}
	
	public static Assembler <AttendanceDomain, AttendanceDTO, AttendanceEntity>
	getAttendanceAssembler(){
		return INSTANCE;
	}

	@Override
	public AttendanceDTO convertDomainToDTO(AttendanceDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return AttendanceDTO.create();
	}

	@Override
	public AttendanceEntity convertDomainToEntity(AttendanceDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return AttendanceEntity.create();
	}

	@Override
	public AttendanceDomain convertDTOToDomain(AttendanceDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return AttendanceDomain.create();
	}

	@Override
	public AttendanceDomain convertEntityToDomain(AttendanceEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return AttendanceDomain.create();
	}

	@Override
	public List<AttendanceDomain> convertListEntityToListDomain(List<AttendanceEntity> entities) {
		List<AttendanceDomain> domains = new ArrayList<>();
		for (AttendanceEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<AttendanceDTO> convertListDomainToListDTO(List<AttendanceDomain> domains) {
		List<AttendanceDTO> dtos = new ArrayList<>();
		for (AttendanceDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	
	}
