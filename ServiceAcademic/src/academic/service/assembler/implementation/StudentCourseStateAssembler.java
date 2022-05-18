package academic.service.assembler.implementation;

import academic.domain.SubjectDomain;
import academic.dto.SubjectDTO;
import academic.entity.SubjectEntity;
import academic.service.assembler.Assembler;

public class StudentCourseStateAssembler implements Assembler <SubjectDomain, SubjectDTO, SubjectEntity>{

	
	private static final Assembler <SubjectDomain, SubjectDTO, SubjectEntity>
	INSTANCE =new StudentCourseStateAssembler();
	
	private StudentCourseStateAssembler() {
		super();
	}
	
	public static Assembler <SubjectDomain, SubjectDTO, SubjectEntity>
	getStudentCourseStateAssembler(){
		return INSTANCE;
	}
	
	@Override
	public SubjectDTO convertDomainToDTO(SubjectDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectEntity convertDomainToEntity(SubjectDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDomain convertDTOToDomain(SubjectDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDomain convertEntityToDomain(SubjectEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
