package academic.service.facade.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import academic.domain.StudentDomain;
import academic.dto.StudentDTO;
import academic.service.assembler.implementation.StudentAssembler;
import academic.service.facade.student.RegisterStudentFacade;
import academic.service.usecase.student.RegisterStudent;

@Service
@Transactional
public class RegisterStudentFacadeImpl implements RegisterStudentFacade{

	@Autowired
	private RegisterStudent registerStudent;
	
	@Override
	public void execute(StudentDTO dto) {
		StudentDomain domain =StudentAssembler.getStudentAssembler().convertDTOToDomain(dto);
	registerStudent.execute(domain);

	}
}
