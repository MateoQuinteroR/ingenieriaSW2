package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentCourseDomain;
import academic.dto.StudentCourseDTO;
import academic.entity.StudentCourseEntity;
import academic.service.assembler.Assembler;

public class StudentCourseAssembler implements Assembler <StudentCourseDomain, StudentCourseDTO, StudentCourseEntity>{

	
	private static final Assembler <StudentCourseDomain, StudentCourseDTO, StudentCourseEntity>
	INSTANCE = new StudentCourseAssembler();
	
	private StudentCourseAssembler() {
		super();
	}
	
	public static Assembler <StudentCourseDomain, StudentCourseDTO, StudentCourseEntity>
	getStudentCourseAssembler(){
		return INSTANCE;
	}
	
	@Override
	public StudentCourseDTO convertDomainToDTO(StudentCourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseDTO.create();
	}

	@Override
	public StudentCourseEntity convertDomainToEntity(StudentCourseDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseEntity.create();
	}

	@Override
	public StudentCourseDomain convertDTOToDomain(StudentCourseDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseDomain.create();
	}

	@Override
	public StudentCourseDomain convertEntityToDomain(StudentCourseEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseDomain.create();
	}

	@Override
	public List<StudentCourseDomain> convertListEntityToListDomain(List<StudentCourseEntity> entities) {
		List<StudentCourseDomain> domains = new ArrayList<>();
		for (StudentCourseEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<StudentCourseDTO> convertListDomainToListDTO(List<StudentCourseDomain> domains) {
		List<StudentCourseDTO> dtos = new ArrayList<>();
		for (StudentCourseDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
}
