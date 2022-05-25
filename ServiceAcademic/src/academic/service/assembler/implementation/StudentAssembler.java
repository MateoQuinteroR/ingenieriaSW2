package academic.service.assembler.implementation;

import java.util.ArrayList;
import java.util.List;

import academic.crosscutting.exception.AcademicException;
import academic.domain.StudentDomain;
import academic.dto.StudentDTO;
import academic.entity.StudentEntity;
import academic.service.assembler.Assembler;

public class StudentAssembler implements Assembler <StudentDomain, StudentDTO, StudentEntity>{

	
	private static final Assembler <StudentDomain, StudentDTO, StudentEntity>
	INSTANCE =new StudentAssembler();
	
	private StudentAssembler() {
		super();
	}
	
	public static Assembler <StudentDomain, StudentDTO, StudentEntity>
	getStudentAssembler(){
		return INSTANCE;
	}
	
	@Override
	public StudentDTO convertDomainToDTO(StudentDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectDTO cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentDTO.create();
	}

	@Override
	public StudentEntity convertDomainToEntity(StudentDomain domain) {
		if (domain == null) {
			var message = "No es posible convertir un dominio SubjectDomain a un SubjectEntity cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentEntity.create();
	}

	@Override
	public StudentDomain convertDTOToDomain(StudentDTO dto) {
		if (dto == null) {
			var message = "No es posible convertir un dominio SubjectDTO a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentDomain.create();
	}

	@Override
	public StudentDomain convertEntityToDomain(StudentEntity entity) {
		if (entity == null) {
			var message = "No es posible convertir un dominio SubjectEntity a un SubjectDomain cuando el dominio esta nulo";
			throw AcademicException.buildTechnicalServiceException(message);
		}
		return StudentDomain.create();
	}

	@Override
	public List<StudentDomain> convertListEntityToListDomain(List<StudentEntity> entities) {
		List<StudentDomain> domains = new ArrayList<>();
		for (StudentEntity entity : entities) {
			domains.add(convertEntityToDomain(entity));
		}
		return domains;
	}

	@Override
	public List<StudentDTO> convertListDomainToListDTO(List<StudentDomain> domains) {
		List<StudentDTO> dtos = new ArrayList<>();
		for (StudentDomain domain : domains) {
			dtos.add(convertDomainToDTO(domain));
		}
		return dtos;
	}
	

	
}
