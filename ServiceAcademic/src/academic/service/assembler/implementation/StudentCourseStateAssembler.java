package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentCourseStateDomain;
import academic.dto.StudentCourseStateDTO;
import academic.entity.StudentCourseStateEntity;
import academic.service.assembler.Assembler;

public class StudentCourseStateAssembler implements Assembler <StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity>{

	
	private static final Assembler <StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity>
	INSTANCE =new StudentCourseStateAssembler();
	
	private StudentCourseStateAssembler() {
		super();
	}
	
	public static Assembler <StudentCourseStateDomain, StudentCourseStateDTO, StudentCourseStateEntity>
	getStudentCourseStateAssembler(){
		return INSTANCE;
	}
	
	@Override
	public StudentCourseStateDTO convertDomainToDTO(StudentCourseStateDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseStateDTO.create();
	}

	@Override
	public StudentCourseStateEntity convertDomainToEntity(StudentCourseStateDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseStateEntity.create();
	}

	@Override
	public StudentCourseStateDomain convertDTOToDomain(StudentCourseStateDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseStateDomain.create();
	}

	@Override
	public StudentCourseStateDomain convertEntityToDomain(StudentCourseStateEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentCourseStateDomain.create();
	}

	@Override
	public List<StudentCourseStateDomain> convertListEntityToListDomain(List<StudentCourseStateEntity> entities) {
		List<StudentCourseStateDomain> domains = new ArrayList<>();
		for (StudentCourseStateEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<StudentCourseStateDTO> convertListDomainToListDTO(List<StudentCourseStateDomain> domains) {
		List<StudentCourseStateDTO> dtos = new ArrayList<>();
		for (StudentCourseStateDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	

}
