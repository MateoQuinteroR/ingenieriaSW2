package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.CourseDomain;
import academic.dto.CourseDTO;
import academic.entity.CourseEntity;
import academic.service.assembler.Assembler;

public class CourseAssembler implements Assembler <CourseDomain, CourseDTO, CourseEntity>{

	
	private static final Assembler <CourseDomain, CourseDTO, CourseEntity>
	INSTANCE =new CourseAssembler();
	
	private CourseAssembler() {
		super();
	}
	
	public static Assembler <CourseDomain, CourseDTO, CourseEntity>
	getCourseAssembler(){
		return INSTANCE;
	}
	
	@Override
	public CourseDTO convertDomainToDTO(CourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return CourseDTO.create();
	}

	@Override
	public CourseEntity convertDomainToEntity(CourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return CourseEntity.create();
	}

	@Override
	public CourseDomain convertDTOToDomain(CourseDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return CourseDomain.create();
	}

	@Override
	public CourseDomain convertEntityToDomain(CourseEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return CourseDomain.create();
	}

	@Override
	public List<CourseDomain> convertListEntityToListDomain(List<CourseEntity> entities) {
		List<CourseDomain> domains = new ArrayList<>();
		for (CourseEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<CourseDTO> convertListDomainToListDTO(List<CourseDomain> domains) {
		List<CourseDTO> dtos = new ArrayList<>();
		for (CourseDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	
	
}
